package pages.SolutionsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utils {

    public static void initSolutionsPage() {
        WebDriver driver = new ChromeDriver();
        //There is some weirdness with how I have set up my browser initialization, id spend more time here to figure out a better way
        String Actual = driver.getTitle();
        String Expected = "How Aumni Works: The Basics";
        if (Actual.equals(Expected)) {
            System.out.println("Solutions Page is Initialized");
        } else {
            System.out.println("Solutions Page is not Initialized");

        }
        driver.close();
    }
}
