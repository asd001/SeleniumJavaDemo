import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class login {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.gecko.driver", "C:\\Windows\\System32\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://192.168.0.120:8080");

        Thread.sleep(2000);

        WebElement user = driver.findElement(By.id("Account"));
        user.sendKeys("director");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("123fff");

        WebElement we = driver.findElement(By.xpath("//input[@id='btn-submit']"));
        we.click();

        Thread.sleep(2000);

        WebElement quickly = driver.findElement(By.id("btn_quickly"));
        quickly.click();

        Thread.sleep(2000);

        WebElement agree = driver.findElement(By.id("agree"));
        agree.click();
    }
}