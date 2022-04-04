package ru.gb.locators;

import ru.gb.locators.Android.AndroidDragPageLocators;
import ru.gb.locators.Android.AndroidLoginPageLocators;
import ru.gb.locators.Android.AndroidMainPageLocators;
import ru.gb.locators.IOS.iOSDragPageLocators;
import ru.gb.locators.IOS.iOSLoginPageLocators;
import ru.gb.locators.IOS.iOSMainPageLocators;
import ru.gb.locators.Interfaces.DragPageLocators;
import ru.gb.locators.Interfaces.LoginPageLocators;
import ru.gb.locators.Interfaces.MainPageLocators;

public class LocatorService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidMainPageLocators() : new iOSMainPageLocators();

    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidLoginPageLocators() : new iOSLoginPageLocators();

    public static final DragPageLocators DRAG_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidDragPageLocators() : new iOSDragPageLocators();


}
