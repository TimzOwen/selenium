import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {
    public static void main(String[] args) throws InterruptedException{
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        Thread.sleep(2000);

        WebElement btnAlert = driver.findElement(By.id("alert-button"));
        btnAlert.click();

        // define alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        Thread.sleep(4000);

        driver.quit();



    }
}
