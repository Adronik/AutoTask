package utils;

import pages.WerushMainPage;

public class SiteNavigator {

    public static WerushMainPage openMainWerushPage() {
        WebDriverManager.driver.get("https://test:werushtest@test.werush.co/");
        return new WerushMainPage();
    }

}
