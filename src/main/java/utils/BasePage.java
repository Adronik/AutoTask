package utils;

import org.openqa.selenium.support.PageFactory;

public class BasePage extends PageFactory {

    public BasePage() {
        initElements(WebDriverManager.driver, this);
    }

}
