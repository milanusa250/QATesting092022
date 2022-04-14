package debasis.learn.weekdays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YoutubeSearchTest {


    WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/dchatterjee/IdeaProjects/QAAutomation/src/Driver/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        //driver.get("https://www.youtube.com");
    }

    @AfterMethod
    public void afterTest(){
        driver.close();
    }

    //@amazon
    @Test
    public void searchUsingButtons() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book");
        Thread.sleep(3000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000);
    }
    //@amazon
    @Test
    public void searchUsingEnter() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium book", Keys.ENTER);
        Thread.sleep(3000);
    }
    //@youtube
/*    @Test
    public void searchUsingEnterYoutube() throws InterruptedException {
        driver.findElement(By.id("search")).sendKeys("selenium course", Keys.ENTER);
        Thread.sleep(3000);
    }*/
}
