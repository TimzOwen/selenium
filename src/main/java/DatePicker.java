import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        Thread.sleep(2000);

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("06/12/1996");
        Thread.sleep(2000); // give a delay to see how the calendar selects the dates
        date.sendKeys(Keys.RETURN);

        Thread.sleep(4000);
        driver.quit();
    }
}
