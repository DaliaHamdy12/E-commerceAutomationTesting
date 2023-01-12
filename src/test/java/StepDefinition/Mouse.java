package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Mouse {
    public static WebDriver driver;
    @Before
    public static void open_browser()
    {
        System.setProperty("web-driver.chrome.driver",
                "C:\\Users\\Hamdy\\IdeaProjects\\E-commerceAutomationTesting\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage() .window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public static void quit_browser()
    {
        driver.quit();
    }
}

