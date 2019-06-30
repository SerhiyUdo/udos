package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;

    @Before
    public void setup () {
        System.setProperty("webdriver.chrome.driver", "/Users/serhiyudovychenko/webdriver/chromedriver");// whitelist-ip 192.168.1.5;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown () {
        driver.quit();
    }
}