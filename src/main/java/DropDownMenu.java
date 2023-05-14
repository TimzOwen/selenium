import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownMenu {
    public static void main(String[] args) throws InterruptedException {
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        Thread.sleep(2000);

        WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();
        Thread.sleep(2000); // give a delay to see how the calendar selects the dates
//        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//        autocomplete.click();

        WebElement uploadFile = driver.findElement(By.xpath("/html/body/div/div/div/a[8]"));
        uploadFile.click();

        Thread.sleep(4000);
        driver.quit();
    }
}
