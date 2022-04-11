package debasisqa.learn.weekdays;
import debasisqa.learn.weekdays.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    public void test1(){

        System.out.println(calculator.add(15, 70));
        Assert.assertEquals(85, calculator.add(15, 70));
    }
    @Test
    public void test2(){

        System.out.println(calculator.sub(100, 70));
        Assert.assertEquals(30, calculator.sub(100, 70));
    }

    @Test
    public void test3(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/dchatterjee/IdeaProjects/QAAutomation/src/Driver/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.close();
        }

    WebDriver driver;
    @Before
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/dchatterjee/IdeaProjects/QAAutomation/src/Driver/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
    }

    @After
    public void afterTest(){
        driver.close();
    }
    @Test
    public void test4() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book");
        Thread.sleep(3000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000);
    }

    @Test
    public void searchUsingEnter() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium book", Keys.ENTER);
        Thread.sleep(3000);
    }

}

