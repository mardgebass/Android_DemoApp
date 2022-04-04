package ru.gb.pages;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import io.qameta.allure.Step;
import ru.gb.locators.Interfaces.DragPageLocators;
import ru.gb.locators.LocatorService;

import java.awt.image.BufferedImage;
import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static org.testng.Assert.assertEquals;

public class DragPage {

    private DragPageLocators locator() {
        return LocatorService.DRAG_PAGE_LOCATORS;
    }

    @Step("Делаем скриншот Драг экрана и сравниваем с требованием")
    public DragPage checkDragScreenshot() {

        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("src/main/resources/expectedScreenshots/dragPage.png");

        File actualScreenshot = $(locator().dragScreen()).screenshot();

        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());

        File resultDestination = new File("src/main/resources/differentScreenshots/diff_CheckDragPageScreenshot.png");

        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage, resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }

    @Step("Делаем скриншот Драг экрана и сравниваем с требованием")
    public DragPage checkDragPuzzleScreenshot() {

        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("src/main/resources/expectedScreenshots/dragPuzzlePage.png");

        File actualScreenshot = $(locator().dragScreen()).screenshot();

        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());

        File resultDestination = new File("src/main/resources/differentScreenshots/diff_CheckDragPuzzlePageScreenshot.png");

        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage, resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }

    public DragPage movePuzzle() {

        actions().dragAndDropBy($(locator().FirstColTwo()), 129, -586).perform();
        actions().dragAndDropBy($(locator().SecondColTwo()), 150, -729).perform();

        return this;
    }

}
