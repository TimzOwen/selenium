import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DargAndDrop {
    public static void main(String[] args) throws InterruptedException {
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        Thread.sleep(2000);

        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        // Use Action to perform the action
        Actions action = new Actions(driver);
        action.dragAndDrop(image, box).build().perform();

        Thread.sleep(4000);
        driver.quit();
    }
}
