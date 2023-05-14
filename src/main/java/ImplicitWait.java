import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args){
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement date = driver.findElement(By.id("datepicker"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    ---> depreciated
        date.sendKeys("06/12/1996");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        date.sendKeys(Keys.RETURN);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.quit();
    }
}
