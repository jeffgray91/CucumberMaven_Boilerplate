package AppName.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;

public class OpenBrowserHelp {

    private WebDriver driver;
    private static OpenBrowserHelp browserHelp;

    private OpenBrowserHelp() {
        // add this if using the chrome driver
        // System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        // Enable this for safari
        // System.setProperty("webdriver.chrome.driver","src/test/resources/safaridriver");
        this.driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.wikipedia.org");
        driver.manage().window().maximize();
    }

    public static OpenBrowserHelp getOpenBrowserHelp() {
        if (null == browserHelp) {
            browserHelp = new OpenBrowserHelp();
        }
        return browserHelp;
    }

    WebDriver getDriver() {
        return driver;
    }

    void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void printSingleton() {
        System.out.println("Inside print Singleton");
    }
}

