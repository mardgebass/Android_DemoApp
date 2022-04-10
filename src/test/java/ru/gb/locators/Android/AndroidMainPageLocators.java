package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.Interfaces.MainPageLocators;

public class AndroidMainPageLocators implements MainPageLocators {

    @Override
    public By loginButton() {
        return By.xpath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView[2]");
    }

    @Override
    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

    @Override
    public By dragButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Drag\"]/android.widget.TextView");
    }

    @Override
    public By swipeButton() {
        return By.xpath("//android.widget.Button[@content-desc=\"Swipe\"]/android.widget.TextView[2]");
    }

}

