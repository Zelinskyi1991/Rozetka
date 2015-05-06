import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Женя on 26.04.2015.
 */
public class Between1500_20000 extends page {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://rozetka.com.ua/");

        search("Dell Inspiron 3541 (I35A645DIL-11) Black",driver);
        add(driver);
        Continue(driver);
        checkout(driver);
        datauser("Ivan", "Ivanov", "Киев", "067 895 77 77", driver);
        curier(driver);
        countofgoods(driver);
        teardown(driver);
    }

}