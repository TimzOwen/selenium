package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public static void fillForm(WebDriver driver) throws InterruptedException {

        driver.findElement(By.id("first-name")).sendKeys("Timz");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Owen");
        Thread.sleep(1000);
        driver.findElement(By.id("job-title")).sendKeys("SRE Engineer");
        Thread.sleep(1000);
        driver.findElement(By.id("radio-button-3")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkbox-1")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("option[value='2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("datepicker")).sendKeys("05/12/2022");
        Thread.sleep(1000);
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN); // close date picker
        Thread.sleep(1000);
        // Submit the form
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

    }
}
