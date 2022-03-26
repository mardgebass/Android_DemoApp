package ru.gb;

import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.locators.DragPageLocators;
import ru.gb.locators.MainPageLocators;
import java.io.File;
import static com.codeborne.selenide.Selenide.$;

public class MakeScreenshot extends BaseTest {

    @Test
    public void createScreen() {
        openApp();
        File actualScreenshot = $(new MainPageLocators().homeScreen()).screenshot();
    }

    @Test
    public void createDragScreen() {
        openApp().clickDragMenuButton();
        File actualScreenshot = $(new DragPageLocators().dragScreen()).screenshot();
    }

}

