package gb.dzhumaev.autotester.common;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;

import static gb.dzhumaev.autotester.common.Configuration.PLATFORM_AND_BROWSER;
import static gb.dzhumaev.autotester.common.Configuration.WINDOW_POSITION;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch (PLATFORM_AND_BROWSER) {
            case "WINDOWS_CHROME":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "WINDOWS_FIREFOX":
                System.setProperty("webdriver.firefox.driver", "src/main/resources/geckodriver.exe");
                FirefoxOptions options = new FirefoxOptions()
                        .setPageLoadStrategy(PageLoadStrategy.EAGER);
                driver = new FirefoxDriver(options);
                break;
            default:
                Assert.fail("Incorrect platform or browser name: " + PLATFORM_AND_BROWSER);
        }

        driver.manage().window().setPosition(WINDOW_POSITION);
        driver.manage().window().maximize();

        return driver;
    }
}
