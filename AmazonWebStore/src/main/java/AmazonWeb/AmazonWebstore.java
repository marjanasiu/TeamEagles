package AmazonWeb;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AmazonWebstore extends CommonAPI {

    public void search(String search) {
        this.driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search);
        this.driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
    }

    public void signIn() {
        this.driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        this.driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
    }

    public void goToPrimePage() {
        this.driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]")).click();
    }

    public void goToCart() {
        this.driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[3]")).click();
    }

    public void goToMenu() {
        this.driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
    }

    public void changeLanguages() {
        this.driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[1]/span[2]")).click();
        this.driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span/i")).click();
    }

    public void searchTwo() {
        this.driver.findElement(By.id("twotabsearchtextbox")).sendKeys();
    }

    public void searchForBooks() {
        this.driver.findElement(By.id("twotabsearchtextbox")).sendKeys();
    }

    public void goToTodaysDeal() {
        this.driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
    }


}