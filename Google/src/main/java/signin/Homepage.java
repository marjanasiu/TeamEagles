package signin;

import common.CommonAPI;
import org.openqa.selenium.By;

public class Homepage extends CommonAPI {

    public void logIn(String email, String password) {
        this.driver.findElement(By.name("identifier")).sendKeys(email);
        this.driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        this.driver.findElement(By.name("password")).sendKeys(password);
        this.driver.findElement(By.xpath("//div[@id='passwordNext']//div[@class='ZFr60d CeoRYc']")).click();

    }

}

