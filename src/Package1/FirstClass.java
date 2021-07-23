package Package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class FirstClass {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("This is first file");

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
            System.out.println("Title Matches");
        }
        else
        {
            System.out.println(title);
        }










    }
}

