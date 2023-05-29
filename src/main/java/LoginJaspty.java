import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Base64;

public class LoginJaspty {
    public static void main(String[] args) throws InterruptedException {
        //set location for chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tkipkosgei\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create chrome driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.digicert.com/account/login.php");

        driver.findElement(By.id("username")).sendKeys("Timz_Owen");
        byte[] encodeBytes = Base64.getEncoder().encode("Nairobi@12345.".getBytes());
        byte[] decodeBytes = Base64.getDecoder().decode(encodeBytes);
        driver.findElement(By.id("password")).sendKeys(new String(decodeBytes));
        driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg")).click();
        Thread.sleep(1500);

        driver.quit();
    }
}
    
//   String password = "Test!email30#password";

//   AES256TextEncryptor encryptor = new AES256TextEncryptor();
//   encryptor.setPassword("some_salt");
//   String myEncryptedText = encryptor.encrypt(password);
//   System.out.println("Encrypted: "+myEncryptedText);
//
//   String plainText = encryptor.decrypt(myEncryptedText);
//   System.out.println("Decrypted: "+plainText);

