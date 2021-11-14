import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SiteNavigator;
import utils.WebDriverManager;

public class SliderTest {

    @BeforeMethod
    public void BeforeEachTest() {
        WebDriverManager.openBrowser();
    }

    @Test
    public void sliderNavigationTest() {
        SiteNavigator.openMainWerushPage();
    }

    @AfterMethod
    public void AfterEachTest() {
        WebDriverManager.closeBrowser();
    }

}