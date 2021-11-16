package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static utils.WebDriverManager.driver;

public class WerushMainPage extends BasePage {

    @FindBy(className = "home-slider__next")
    private WebElement nextSlideButton;

    @FindBy(className = "home-slider__prev")
    private WebElement prevSlideButton;

    @FindBy(xpath = "//app-rush-slide[contains(@class, 'active')]//a")
    private WebElement activeSlideButton;

    @FindBy(xpath = "//ul[@class='dots']/li")
    private List<WebElement> sliderDots;



    public void clickOnNextSlide() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(nextSlideButton));
        nextSlideButton.click();
    }

    public void clickOnPreviousSlide() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(prevSlideButton));
        prevSlideButton.click();
    }

    public void clickOnActiveSlideButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(activeSlideButton));
        activeSlideButton.click();
    }

    public Boolean checkActiveSlideButtonsURLS() {
        for ( int i = 1; i <= sliderDots.size(); i++) {
            for (int j=1; j <= sliderDots.size(); j++) {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                clickOnNextSlide();
            }
            clickOnActiveSlideButton();
        }
        return isFailedURL();
    }

    public Boolean isFailedURL() {
        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals("https://test:werushtest@test.werush.co/404")) {
            return true;
        }
        return false;
    }

}