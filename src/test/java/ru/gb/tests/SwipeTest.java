package ru.gb.tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;

public class SwipeTest extends BaseTest {

    @Test
    @Description("Проверяем свайп баннеров")
    public void checkSwipe() {

        openApp()
                .clickSwipeMenuButton()
                .swipeLeft()
                .checkCards();
    }


}
