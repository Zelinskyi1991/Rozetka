import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class page {

    public static void search(String s, WebDriver driver){

        WebElement web1=driver.findElement(By.xpath(".//*[@id='search']/form/div[1]/div[2]/input"));
        web1.clear();
        web1.sendKeys(s);
        WebElement web2=driver.findElement(By.xpath("//*[@id='search']/form/span/span/button"));
        web2.click();

    }
    public static void Step1(WebDriver driver){
        search("Divoom iTour-Boom Jack Black (TBBLK)",driver);
        System.out.println("INFO:   ADD FIRST");
        add(driver);
        Continue(driver);
    }
    public static void Step2(WebDriver driver){
        search("3Q QUBA v2 SP101M Grey",driver);
        System.out.println("INFO:   ADD second");
        add(driver);
        Continue(driver);
    }
    public static void Step3(WebDriver driver) {
        search("Genius SP-HF150 Black (31731053101)", driver);
    System.out.println("INFO:   ADD third");
        add(driver);

    }


    public static void add(WebDriver driver){
        WebElement web3=  driver.findElement(By.name("topurchases"));
            if(web3.isEnabled()) {
                web3.click();
            }
            else{
                assert web3.isEnabled();
            }



    }

    public static void teardown(WebDriver driver){
        driver.close();
        System.out.println("END");

    }
    public static void Continue(WebDriver driver){
        driver.findElement(By.className("btn-link-i"));
    }
    public static void checkout(WebDriver driver){
       WebElement web4= driver.findElement(By.id("popup-checkout"));
        web4.click();
    }
    public static void datauser(String name,String lastname,String city,String phone,WebDriver driver){
        driver.findElement(By.id("reciever_name")).sendKeys(name+" "+lastname);
        driver.findElement(By.id("tip_for_input")).click();
        driver.findElement(By.xpath(".//*[@id='step_contacts']/div/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/ul/li[1]")).click();
        driver.findElement(By.id("reciever_phone")).sendKeys(phone);

        WebElement web5=driver.findElement(By.xpath(".//*[@id='step_contacts']/div/div[1]/div[3]/div/span/button"));//driver.findElement(By.name("next_step"));
        if(web5.isEnabled()){
            web5.click();
        }else{assert web5.isEnabled();
            web5.click();
        }

    }
    public static void curier(WebDriver driver) throws InterruptedException {
        System.out.println("curier page");
       WebElement web7= driver.findElement(By.xpath(".//*[@id='orders']/div/div/div[2]/div/div[2]/ul/li[2]/a"));
        if(web7.isEnabled()){

            web7.click();
        }


        WebElement web6=driver.findElement(By.xpath(".//*[@id='orders']/div/div/div[2]/div/div[2]/div[2]/ul/li/div[1]/div/div/div"));

        if (web6.isEnabled()){
            String value=web6.getText();
            System.err.println("Delivery: " + value);
        }


    }
    public static void countofgoods (WebDriver driver){
        WebElement web8 = driver.findElement(By.xpath(".//*[@id='total_block']/div[1]/div[1]/div[1]"));
        WebElement web9 = driver.findElement(By.xpath(".//*[@id='total_block']/div[1]/div[1]/div[2]"));
        String price = web9.getText();
        String count = web8.getText();
        System.err.println ("Goods: "+count + " "+price);
    }
}
