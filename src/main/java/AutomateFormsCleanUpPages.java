import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static pages.ConfirmationAlert.assertBannerAlert;
import static pages.ConfirmationAlert.getAlertText;
import static pages.FormPage.fillForm;

public class AutomateFormsCleanUpPages {
    public static void main(String[] args) throws InterruptedException {
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        Thread.sleep(2500);

        fillForm(driver);
        assertBannerAlert(driver);

        assertEquals("The form was successfully submitted!",getAlertText(driver));

        Thread.sleep(3000);
        driver.quit();
    }
}
