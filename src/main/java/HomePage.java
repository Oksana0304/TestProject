import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(FirefoxDriver driver) {
           this.driver = driver;
    }

    public ResultPage search(String text) {
        driver.findElement(By.id("gbqfq")).sendKeys(text);  //определить локатор
        return new ResultPage(driver);
    }
}

