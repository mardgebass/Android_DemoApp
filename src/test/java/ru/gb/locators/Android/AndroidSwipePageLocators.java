package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.Interfaces.SwipePageLocators;

public class AndroidSwipePageLocators implements SwipePageLocators {

    @Override
    public By card() {
        return By.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[2]");
    }

    @Override
    public By hideCard() {
        return By.xpath("(//android.view.ViewGroup[@content-desc=\"slideTextContainer\"])[2]/android.widget.TextView[1]");
    }


}
