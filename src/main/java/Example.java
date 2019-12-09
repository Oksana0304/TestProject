

import com.intellij.codeInsight.preview.PreviewHintComponent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Example {
    private final String TWITTER_LINK = "https://twitter.com/wrike";
  //  private final String WRIKE_RESEND_LINK = "https://www.wrike.com/resend/";

    private ChromeDriver driver;

    @After
    public void closePage() {
        driver.close();
    }


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oksan\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // replace with some smarter wait
        driver.get("https://www.wrike.com//");
    }


    void sleep(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSearch() {
        HomePage home = new HomePage(driver);
            //ResultPage result = home.search("Get started for free");
          //assertTrue(result.getFirstLink().contains(""));
        home.clickStart();
        sleep();
        Actions actions = new Actions(driver);
        String email = UUID.randomUUID().toString() + "+wpt@wriketask.qaa";
        actions.sendKeys(email);
        actions.perform();//send keys doesn't work
        sleep();


        WebElement button = driver.findElement(By.xpath("//button[contains(text(), 'Create my Wrike account')]"));
        button.click();
        sleep();
      // assertThat(driver.getCurrentUrl()).isEqualTo(WRIKE_RESEND_LINK).withFailMessage("Redirect should happended");

     String BUTTON_XPATH = "//button[contains(text(), '%s')]";
         String XPATH_SUBMITTED_MESSAGE = "//p[contains(text(), 'forget to check your email to confirm your registration')]";
            driver.findElement(By.xpath(String.format(BUTTON_XPATH, "Very interested"))).click();
            sleep();
        driver.findElement(By.xpath(String.format(BUTTON_XPATH, "16–25"))).click();
        sleep();
        driver.findElement(By.xpath(String.format(BUTTON_XPATH, "Yes"))).click();
        sleep();
        driver.findElement(By.xpath(String.format(BUTTON_XPATH, "Submit results"))).click();
        sleep();
        driver.findElement(By.xpath(String.format(String.format("//a[@href='%s", TWITTER_LINK))));
        sleep();
    }


    }


