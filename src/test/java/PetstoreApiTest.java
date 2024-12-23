import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PetstoreApiTest {

    private String url = "https://petstore.swagger.io/v2";
    private String username = "QA-Testing-BCB";
    private int userId = 232;

    @Test
    public void createUser() {
        System.out.println("creating user.");
        String userData =
                "{\n" +
                "\"id\" : 232," +
                "\"username\": \"" + username + "\",\n" +
                "\"firstName\": \"Baris Can\"," +
                "\"lastName\": \"Bilgin\"," +
                "\"email\": \"QA-Testing-BCB@yandex.com\"," +
                "\"password\": \"test123\"," +
                "\"phone\": \"+90 500 500 50 50\"," +
                "\"userStatus\": 1 " +
                "}";

        given().body(userData).contentType(ContentType.JSON).when()
                .post(url + "/user").then().statusCode(200); // OK

    }

    @Test
    public  void readUser(){
        System.out.println("reading user data.");
    }

    @Test
    public void updateUser(){
        System.out.println("updating user data.");
    }

    @Test
    public void deleteUser(){
        System.out.println("deleting user");
    }
}
