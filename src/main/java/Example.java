

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

public class Example {

        private FirefoxDriver driver;

        @Before
        public void setUp () {   //будем запускать перед каждым тестом
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //на всякий случай, чтобы подождать элементы
            driver.get("https://www.//");
        }
        @After
        public void closePage () {
            driver.close();
        }

        @Test
        public void testSearch () {
            HomePage home = new HomePage(driver);  //объект, который будет иниц и сохранять объекты с главной страницы
            ResultPage result = home.search("Get started for free");  // этот метод будет возвращать главную страницу
            assertTrue(result.getFirstLink().contains(""));
        }

    public static void main(String[] args) {  }
}