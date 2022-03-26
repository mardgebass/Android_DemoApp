package ru.gb.tests;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckDragScreenshotTest extends BaseTest {

    @Test
    @Description("Проверяем экрана Drag с помощью скриншота")
    public void CheckMainPageScreenshot() {

        openApp()
                .clickDragMenuButton()
                .checkDragScreenshot();
    }

}
