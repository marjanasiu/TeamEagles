package home;



import common.CommonAPI;
import org.testng.annotations.Test;
import signin.Homepage;

public class HomeTest extends CommonAPI {

        @Test
        public void testUserCanLogInSuccessfully() {
            driver.get("https://facebook.com");
            Homepage hp = new Homepage();
            hp.logIn("testemail", "testpass");
        }

    }

