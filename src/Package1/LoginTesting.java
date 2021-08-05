package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class LoginTesting {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\IVL-Muhammad\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();


        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://search.propertyonion.info/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Search"))
        {
            System.out.println("Title Matches" + title );
        }
        else
        {
            System.out.println(title);
        }



        WebElement Login = driver.findElement(By.cssSelector("body > app-root > po-header > p-menubar > div > div.p-menubar-end.ng-star-inserted > div > button > span"));

        Actions action = new Actions(driver);
        action.moveToElement(Login).perform();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("body > app-root > po-header > p-menubar > div > div.p-menubar-end.ng-star-inserted > div > button > span")).click();

        WebElement email = driver.findElement(By.cssSelector("body > p-dynamicdialog > div > div > div.p-dialog-content > po-signin-popup > form > div:nth-child(1) > input"));
        email.sendKeys("zain@gmail.com");


        WebElement password = driver.findElement(By.cssSelector("body > p-dynamicdialog > div > div > div.p-dialog-content > po-signin-popup > form > div:nth-child(2) > input"));
        password.sendKeys("zain");
        WebElement submit =driver.findElement(By.cssSelector("body > p-dynamicdialog > div > div > div.p-dialog-content > po-signin-popup > form > div.p-d-flex.p-jc-between.p-ai-start.p-flex-wrap.p-mt-5 > button > span"));
        submit.click();
        Thread.sleep(3000);

        System.out.println("Before");

        WebElement Logt = driver.findElement(By.cssSelector("body > app-root > po-header > p-menubar > div > div.p-menubar-end.ng-star-inserted > po-user-menu > div > p-avatar > div"));
        Actions action2 = new Actions(driver);
        action2.moveToElement(Logt).perform();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("body > app-root > po-header > p-menubar > div > div.p-menubar-end.ng-star-inserted > po-user-menu > div > p-avatar > div")).click();

        driver.findElement(By.cssSelector("body > app-root > po-header > p-menubar > div > div.p-menubar-end.ng-star-inserted > po-user-menu > p-menu > div > ul > li:nth-child(9) > a > span")).click();
        Thread.sleep(2000);








    }
}