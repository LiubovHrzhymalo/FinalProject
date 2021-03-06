package apiTest;

import apiTest.utils.UserCreateUpdateData;
import apiTest.utils.UserListData;
import io.restassured.http.ContentType;
import org.junit.Test;
import java.util.List;
import static apiTest.StepsApiTest.REQUEST_SPEC;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class CRUDTest {

    @Test
    public void getUsers(){
        List<UserListData> users= (List<UserListData>) given()
                .spec(REQUEST_SPEC)
                .when().get()
                .then()
                .statusCode(200)
                .extract().jsonPath().getList("data", UserListData.class);
        assertThat(users).extracting(UserListData::getLast_name).contains("Morris");
    }

    @Test
    public void createUser(){
        UserCreateUpdateData rq=new UserCreateUpdateData();
        rq.setName("James Bond");
        rq.setJob("super agent");

        UserCreateUpdateData rs= given()
        .spec(REQUEST_SPEC)
        .body(rq)
        .when().post()
        .then().extract().as(UserCreateUpdateData.class);
        assertThat(rs)
        .isNotNull()
        .extracting(UserCreateUpdateData::getName)
        .isEqualTo(rq.getName());
    }

    @Test
    public void updateUser(){
        UserCreateUpdateData rq=new UserCreateUpdateData();
        rq.setName("James Bond junior");
        rq.setJob("super agent second");

        UserCreateUpdateData rs= given()
                .spec(REQUEST_SPEC)
                .body(rq)
                .when().put()
                .then().extract().as(UserCreateUpdateData.class);
        assertThat(rs)
                .isNotNull()
                .extracting(UserCreateUpdateData::getName)
                .isEqualTo(rq.getName());
    }
    @Test
    public void deleteUser(){

        given()
                .baseUri("https://reqres.in/api/")
                .basePath("/users/2")
                .contentType(ContentType.JSON)
                .when().delete()
                .then()
                .statusCode(204);

    }

}
