package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmationAlert {
    public static void assertBannerAlert(WebDriver driver){
        // Junit test to compare output values
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

    }

    public static String getAlertText(WebDriver driver){
        return driver.findElement(By.className("alert")).getText();
    }
}
