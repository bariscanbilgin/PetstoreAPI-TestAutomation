import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PetstoreApiTest {

    private String url          = "https://petstore.swagger.io/v2";
    private int    userId       = 232;
    private String username     = "QA-Testing-BCB";
    private String firstName    = "Baris Can";
    private String lastNAme     = "Bilgin";
    private String userMail     = "QA-Testing-BCB@yandex.com";
    private String userPassword = "test123";
    private String userMobile   = "+90 500 500 50 50";


    @Test
    public void createUser() {
        System.out.println("creating user.");
        String userData =
                "{\n"                   +
                "\"id\"        :   "    + userId        + ",\n"   +
                "\"username\"  : \""    + username      + "\",\n" +
                "\"firstName\" : \""    + firstName     + "\",\n" +
                "\"lastName\"  : \""    + lastNAme      + "\",\n" +
                "\"email\"     : \""    + userMail      + "\",\n" +
                "\"password\"  : \""    + userPassword  + "\",\n" +
                "\"phone\"     : \""    + userMobile    + "\",\n" +
                "\"userStatus\": 1 "    +
                "}";

        given().body(userData).contentType(ContentType.JSON).when()
                .post(url + "/user").then().statusCode(200); // Code 200 -> OK.
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

        given().when().delete(url + "/user/" + username).then().statusCode(200);
    }
}
