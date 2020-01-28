package AmazonWeb;

import common.CommonAPI;
import org.testng.annotations.Test;

public class AmazonWebTest extends CommonAPI {


    @Test
    public void amazonSearchEngineTest() throws InterruptedException {
        System.out.println(driver.getTitle());
        typeOnElement("twotabsearchtextbox", "matcha green tea");
        clickOnElement("//*[@id=\"nav-search\"]/form/div[2]/div/input");
        Thread.sleep(2000);
    }
}
   /* @Test
    public void search() {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.search("iphone");
    }

    @Test
    public void clickSignIn() {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.signIn();

    }

    @Test
    public void amazonSearchEngineTest() {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
       hp.searchTest();

    }


}*/