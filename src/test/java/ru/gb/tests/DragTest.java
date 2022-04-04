package ru.gb.tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;

public class DragTest extends BaseTest {

    @Test
    @Description("Проверяем два пазла Drag с помощью скриншота")
    public void CheckDragPage() {

        openApp()
                .clickDragMenuButton()
                .movePuzzle()
                .checkDragPuzzleScreenshot();
    }

}
