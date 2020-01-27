package home;

import common.CommonAPI;
import org.testng.annotations.Test;
import signin.HomePage;


public class Home extends CommonAPI {

    @Test
    public void testUserCanLogInSuccessfully() {
        driver.get("https://gmail.com");
        HomePage hp = new HomePage();
        hp.logIn("firoz11218@gmail.com", "abc123");
    }

}