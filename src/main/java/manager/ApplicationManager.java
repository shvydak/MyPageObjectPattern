package manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ApplicationManager {
    WebDriver webDriver;
    
    UserHelper userHelper;

    public void init() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver.navigate().to("https://");
        
        userHelper = new UserHelper(webDriver);
    }

        public UserHelper getUserHelper() {
        return userHelper;
    }

    public void stop() {
    webDriver.close();
    }
}
