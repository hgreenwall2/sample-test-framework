import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static pages.BasePage.BrowserSetup.initChrome;
import static pages.HomePage.utils.clickLearnHowBtn;
import static pages.HomePage.utils.homePageInit;
import static pages.SolutionsPage.utils.initSolutionsPage;


public class HomePageTests {

    @Test
    public void homepageTitle() {
        initChrome();
        homePageInit();
    }

    @Test
    public void clickLearnHow() throws InterruptedException {
        clickLearnHowBtn();
    }
}

