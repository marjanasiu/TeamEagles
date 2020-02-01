package googlehome;

import common.CommonAPI;
import org.openqa.selenium.By;

public class Google extends CommonAPI {
    public void logIn(String email, String password) {
        this.driver.findElement(By.name("identifier")).sendKeys(email);
        this.driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        this.driver.findElement(By.name("password")).sendKeys(password);
    }

    public void search(String search) {
        this.driver.findElement(By.xpath("//input[@name='q']")).sendKeys(search);
        this.driver.findElement(By.name("btnK")).click();
    }

    public void goStore() {
        this.driver.findElement(By.xpath("//*[@id=\"hptl\"]/a[2]")).click();
    }

    public void images(String search) {
        this.driver.findElement(By.name("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).click();
        this.driver.findElement(By.name("q")).sendKeys("book");
        this.driver.findElement(By.xpath("//body[@id='gsr']/div[@id='viewport']/div[@id='searchform']/div[@id='qbc']/form[@id='tsf']/div/div[@class='A8SBwf']/div[@id='sbtc']/button[@class='Tg7LZd']/div[@class='FAuhyb']/span[@class='z1asCe MZy1Rb']/*[1]")).click();

    }
    public void searchBlank() {
        this.driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
    }
    public void voiceSearch() {
        this.driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[3]/div/span")).click();

    }
    public void searchFirstDropDown() {
        this.driver.findElement(By.xpath("//input[@name='q']")).click();
        this.driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[2]/div/div[2]/div/span")).click();
    }
    public void searchAndClickFirstResult(String search) {
        this.driver.findElement(By.xpath("//input[@name='q']")).sendKeys(search);
        this.driver.findElement(By.name("btnK")).click();
        this.driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
    }
    public void goAboutPage() {
        this.driver.findElement(By.xpath("//*[@id=\"hptl\"]/a[1]")).click();
    }
    public void goSettingsPage() {
        this.driver.findElement(By.xpath("//*[@id=\"fsr\"]/a[1]")).click();
    }
    public void goToTermsPage() {
        this.driver.findElement(By.xpath("//*[@id=\"fsr\"]/a[2]")).click();
    }
    public void goToNews() {
        this.driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
        this.driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[6]/a/span[1]")).click();
    }
    public void goToCareer() {
        this.driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
    }

}

