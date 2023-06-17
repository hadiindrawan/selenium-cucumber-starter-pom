package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    protected WebDriver driver;

    public void setup(String browser) {
        //Create a Chrome driver. All test classes use this.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        switch(browser){
            case "chrome":
                driver = new ChromeDriver(options);
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Wrong input");
        }
        //Maximize Window
        driver.manage().window().maximize();
    }

    public void teardown() {
        driver.quit();
    }
}
