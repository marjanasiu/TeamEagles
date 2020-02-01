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

    @Test
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
    public void goToTryPrimePage() {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.goToPrimePage();
    }

    @Test
    public void goToCartPage() {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.goToCart();
    }

    @Test
    public void goToMenuPage() {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.goToMenu();
    }

    @Test
    public void changeLanguage() {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.changeLanguages();
    }

    /*@Test
    public void goToCustomerService() {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.goToAmazonCustomerService();*/
    @Test
    public void searchForJava(String java) {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.searchTwo();
    }

    @Test
    public void searchForBooks(String java) {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.searchForBooks();
    }

    @Test
    public void clickTodaysDeal() {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.goToTodaysDeal();
    }

    @Test
    public void goToHelpPage() {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.goToHelp();
    }

    @Test
    public void searchTv(String tv) {
        driver.get("https://amazon.com");
        AmazonWebstore hp = new AmazonWebstore();
        hp.searchTvs();
    }
    
}