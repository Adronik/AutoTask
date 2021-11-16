import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WerushMainPage;
import utils.SiteNavigator;
import utils.WebDriverManager;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SliderTest {

    @BeforeMethod
    public void BeforeEachTest() {
        WebDriverManager.openBrowser();
    }

    @Test
    public void lastSlideNavigationTest() {
        WerushMainPage werushMainPage = SiteNavigator.openMainWerushPage();
        werushMainPage.clickOnPreviousSlide();
        werushMainPage.clickOnActiveSlideButton();
        assertFalse(werushMainPage.isFailedURL());
    }

    @Test
    public void secondSlideNavigationTest() {
        WerushMainPage werushMainPage = SiteNavigator.openMainWerushPage();
        werushMainPage.clickOnNextSlide();
        werushMainPage.clickOnActiveSlideButton();
        assertFalse(werushMainPage.isFailedURL());
    }

    @Test
    public void firstSlideNavigationTest() {
        WerushMainPage werushMainPage = SiteNavigator.openMainWerushPage();
        werushMainPage.clickOnActiveSlideButton();
        assertFalse(werushMainPage.isFailedURL());
    }

    @AfterMethod
    public void AfterEachTest() {
        WebDriverManager.closeBrowser();
    }

}