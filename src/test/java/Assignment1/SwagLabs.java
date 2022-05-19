package Assignment1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class SwagLabs {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(500);
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);




        driver.close();
    }
}
