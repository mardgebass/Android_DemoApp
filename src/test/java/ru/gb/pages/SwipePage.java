package ru.gb.pages;

import ru.gb.locators.Interfaces.SwipePageLocators;
import ru.gb.locators.LocatorService;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class SwipePage {

    private SwipePageLocators locator() {
        return LocatorService.SWIPE_PAGE_LOCATORS;
    }

    public SwipePage swipeLeft() {
        actions().moveToElement($(locator().card()),541,1173).perform();
        return new SwipePage();
    }

    public SwipePage checkCards() {
        $(locator().hideCard());
        return new SwipePage();
    }



}
