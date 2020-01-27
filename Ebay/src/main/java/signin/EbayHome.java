package signin;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {


        public void logIn(String email, String password) {
            this.driver.findElement(By.id("identifierId")).sendKeys(email);
            this.driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
            this.driver.findElement(By.name("password")).sendKeys(password);
            this.driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        }

    }

