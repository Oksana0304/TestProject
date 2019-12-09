import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

    private ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
           this.driver = driver;
    }

    public ResultPage search(String text) {
        driver.findElement(By.id("gbqfq")).sendKeys(text);
        return new ResultPage(driver);
    }


    public void clickStart() {
        WebElement emailEl = driver.findElement(By.xpath("//button[@type='submit']"));

        driver.executeScript("arguments[0].click();", emailEl);

    }

}

