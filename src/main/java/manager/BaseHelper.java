package manager;

import org.openqa.selenium.WebDriver;

public class BaseHelper {
    WebDriver webDriver;
    public BaseHelper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
