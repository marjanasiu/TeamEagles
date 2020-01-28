package AmazonWeb;

import common.CommonAPI;
import org.openqa.selenium.By;

public class AmazonWebstore extends CommonAPI {

    public void search(String search) {
        this.driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search);
        this.driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
    }

    public void signIn() {
        this.driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        this.driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();

    }

    public void searchTest() {
        typeOnElement("twotabsearchtextbox", "matcha green tea");
        clickOnElement("//*[@id=\"nav-search\"]/form/div[2]/div/input");
    }


}