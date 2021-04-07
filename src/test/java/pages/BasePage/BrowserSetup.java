package pages.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserSetup {

    public static void initChrome() {
        System.setProperty("webdriver.chrome.driver", "/Users/macuser/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://aumni.fund/");
    }

}