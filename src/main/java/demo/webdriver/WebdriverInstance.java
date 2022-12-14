package demo.webdriver;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class WebdriverInstance {

    public static WebDriver webdriver;

    public static void initialize()  {
//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "--start-maximized");
        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        webdriver = new ChromeDriver(options);
        webdriver.manage().window().maximize();
        webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webdriver.get("https://middleman-alta.vercel.app/auth/login");
        webdriver.manage().deleteAllCookies();
    }

    public static void quit() {
        webdriver.quit();
    }
}
