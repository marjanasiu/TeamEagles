package home;

import common.CommonAPI;
import org.testng.annotations.Test;
import signin.HomePage;


public class HomeTest extends CommonAPI {

    @Test
    public void testUserCanLogInSuccessfully() {
        driver.get("https://gmail.com");
        HomePage hp = new HomePage();
        hp.logIn("abc@gmail.com", "abc123");
    }

}