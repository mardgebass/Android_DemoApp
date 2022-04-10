package ru.gb.locators;

import ru.gb.locators.Android.AndroidDragPageLocators;
import ru.gb.locators.Android.AndroidLoginPageLocators;
import ru.gb.locators.Android.AndroidMainPageLocators;
import ru.gb.locators.Android.AndroidSwipePageLocators;
import ru.gb.locators.Interfaces.DragPageLocators;
import ru.gb.locators.Interfaces.LoginPageLocators;
import ru.gb.locators.Interfaces.MainPageLocators;
import ru.gb.locators.Interfaces.SwipePageLocators;

public class LocatorService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = new AndroidMainPageLocators();

    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = new AndroidLoginPageLocators();

    public static final DragPageLocators DRAG_PAGE_LOCATORS = new AndroidDragPageLocators();

    public static final SwipePageLocators SWIPE_PAGE_LOCATORS = new AndroidSwipePageLocators();
}
