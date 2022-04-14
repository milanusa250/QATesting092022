package debasis.learn.weekdays;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {

    WebDriver driver;

    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/dchatterjee/IdeaProjects/QAAutomation/src/Driver/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
    }


    public void afterTest(){
        driver.close();
    }

    public void searchUsingButtons() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book");
        Thread.sleep(3000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000);
    }


    public void searchUsingEnter() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium book", Keys.ENTER);
        Thread.sleep(3000);
    }

}
