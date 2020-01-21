package home;

import common.CommonAPI;
import org.testng.annotations.Test;
import signin.Homepage;

public class HomeTest extends CommonAPI {

    @Test
    public void testUserCanLogInSuccessfully() {
        driver.get("https://gmail.com");
        Homepage hp = new Homepage();
        hp.logIn("abc@gmail.com", "abc123");
    }

}