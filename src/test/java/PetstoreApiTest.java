import org.junit.jupiter.api.Test;

public class PetstoreApiTest {

    private String url = "https://petstore.swagger.io/v2";
    private String username = "QA-Test-BCB";

    @Test
    public void createUser(){
        System.out.println("creating user.");
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
        System.out.println("sdeleting user");
    }
}
