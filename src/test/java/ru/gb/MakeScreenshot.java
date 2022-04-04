package ru.gb;

import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.locators.LocatorService;

import java.io.File;
import static com.codeborne.selenide.Selenide.$;

public class MakeScreenshot extends BaseTest {

    @Test
    public void createScreen() {
        openApp();
        File actualScreenshot = $(LocatorService.MAIN_PAGE_LOCATORS.homeScreen()).screenshot();
    }

    @Test
    public void createDragScreen() {
        openApp().clickDragMenuButton();
        File actualScreenshot = $(LocatorService.DRAG_PAGE_LOCATORS.dragScreen()).screenshot();
    }

    @Test
    public void createDragAndDropScreen() {
        openApp().clickDragMenuButton().movePuzzle();
        File actualScreenshot = $(LocatorService.DRAG_PAGE_LOCATORS.dragScreen()).screenshot();
    }

}

