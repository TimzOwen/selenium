import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException{
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");
        Thread.sleep(2000);

        WebElement btnModal = driver.findElement(By.id("modal-button"));
        btnModal.click();

        WebElement btnClose = driver.findElement(By.id("close-button"));
        JavascriptExecutor jsExec = (JavascriptExecutor)driver;
        Thread.sleep(3000);
        jsExec.executeScript("arguments[0].click()",btnClose);

        Thread.sleep(4000);
        driver.quit();
    }
}
