import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
    public static void main(String[] args) throws InterruptedException{
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        Thread.sleep(2000);

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Timz Owen");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/02/2023");

        Thread.sleep(30000);

        driver.quit();



    }
}
