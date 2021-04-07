package pages.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class utils {

    public static void clickLearnHowBtn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/macuser/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://aumni.fund/");
        driver.findElement(By.cssSelector("body > main > section.s.s1.s1-home > div.c > div > div > div.pc.pc-60.pc-40-tb > a")).click();
        sleep(3000);
        //Im not a big fan of sleeps, given more time id figure out a better way to do this!
        String Actual = driver.getTitle();
        String Expected = "How Aumni Works: The Basics";
        if (Actual.equals(Expected)) {
            System.out.println("Solutions Page is Initialized");
        } else {
            System.out.println("Solutions Page is not Initialized");

        }
        driver.close();
    }

    public static void homePageInit() {
        WebDriver driver = new ChromeDriver();
        String Actual = driver.getTitle();
        String Expected = "Aumni — Investment Analytics for the Private Capital Markets";
        if (Actual.equals(Expected)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }
}


