package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.Interfaces.DragPageLocators;

public class AndroidDragPageLocators implements DragPageLocators {

    @Override
    public By dragScreen() {
        return MobileBy.AccessibilityId("Drag-drop-screen");
    }
    @Override
    public By FirstColTwo() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"drag-l2\"]/android.widget.ImageView");
    }
    @Override
    public By SecondColTwo() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"drag-c2\"]/android.widget.ImageView");
    }

}

