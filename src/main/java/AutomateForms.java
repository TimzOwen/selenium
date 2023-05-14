import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static org.junit.Assert.assertEquals;

public class AutomateForms {
    public static void main(String[] args) throws InterruptedException {
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        Thread.sleep(2500);

        driver.findElement(By.id("first-name")).sendKeys("Timz");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Owen");
        Thread.sleep(1000);
        driver.findElement(By.id("job-title")).sendKeys("SRE Engineer");
        Thread.sleep(1000);
        driver.findElement(By.id("radio-button-3")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkbox-1")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("option[value='2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("datepicker")).sendKeys("05/12/2022");
        Thread.sleep(1000);
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN); // close date picker
        Thread.sleep(1000);

        // Submit the form
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        // Junit test to compare output values
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

        String alertText = alert.getText();

        assertEquals("The form was successfully submitted!",alertText);

        Thread.sleep(5000); // wait form some time before exiting

        driver.quit();
    }
}
