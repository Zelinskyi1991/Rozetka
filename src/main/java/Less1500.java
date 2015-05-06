import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;


public class Less1500 extends page{
    public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new FirefoxDriver();
       driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.get("http://rozetka.com.ua/");

        Step1(driver);
        Step2(driver);
        Step3(driver);
        checkout(driver);
        datauser("Ivan","Ivanov","Киев","067 895 77 77",driver);
        curier(driver);
        countofgoods(driver);
        teardown(driver);



}


}
