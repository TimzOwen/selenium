import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        Thread.sleep(2000);

        WebElement fileUpload = driver.findElement(By.id("file-upload-field"));
        fileUpload.sendKeys("ftth.png");

        Thread.sleep(5000);
        driver.quit();
    }
}
