import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAuto {
    public static void main(String[] args) throws InterruptedException {
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        Thread.sleep(2000);

        WebElement radioBtn1 = driver.findElement(By.id("radio-button-1"));
        radioBtn1.click();

        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='option2'"));
        radioBtn2.click();

        WebElement radioBtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/label"));
        radioBtn3.click();

        Thread.sleep(4000);
        driver.quit();
    }
}
