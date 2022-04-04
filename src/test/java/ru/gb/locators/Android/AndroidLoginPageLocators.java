package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.Interfaces.LoginPageLocators;

public class AndroidLoginPageLocators implements LoginPageLocators {

    @Override
    public By loginButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");
    }

    @Override
    public By loginErrorText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
    }
    @Override
    public By signUpTab() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
    }
    @Override
    public By emailField() {
        return MobileBy.AccessibilityId("input-email");
    }
    @Override
    public By passwordField() {
        return MobileBy.AccessibilityId("input-password");
    }

    @Override
    public By passwordConfirmField() {
        return MobileBy.AccessibilityId("input-repeat-password");
    }
    @Override
    public By signUpButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup/android.widget.TextView");
    }
    @Override
    public By ErrorTextConfirm() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[3]");
    }
    @Override
    public By ErrorTextShortPassword() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[2]");
    }

}

