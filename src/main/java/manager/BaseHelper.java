package manager;

import org.openqa.selenium.WebDriver;

public class BaseHelper {
    WebDriver webDriver;
    public BaseHelper(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this); // Class initialisation
        this.webDriver = webDriver;
    }
}
