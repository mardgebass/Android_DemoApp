package ru.gb.pages;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import io.qameta.allure.Step;
import ru.gb.locators.Interfaces.MainPageLocators;
import ru.gb.locators.LocatorService;
import java.awt.image.BufferedImage;
import java.io.File;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class MainPage {

    // Метод позволяет нам работать с локаторами для нужной нам экран
    private MainPageLocators locator() {
        return LocatorService.MAIN_PAGE_LOCATORS;
    }

    @Step("Кликаем по кнопке логина в меню и переходим на экран логина")
    public LoginPage clickLoginMenuButton() {
        $(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Кликаем по кнопке свайп в меню")
    public SwipePage clickSwipeMenuButton() {
        $(locator().swipeButton()).click();
        return new SwipePage();
    }

    @Step("Делаем скриншот главного экрана и сравниваем с требованием")
    public MainPage checkScreenshot() {

        // Загружаем ожидаемое изображения для сравнения
        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("src/main/resources/expectedScreenshots/mainPage.png");

        // Делаем актуальный скриншот, используя элемент и игнорируя другие части экрана
        File actualScreenshot = $(locator().homeScreen()).screenshot();

        // Загружаем актуальный скриншот
        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());

        //Где будем хранить скриншот с различиями в случае падения теста
        File resultDestination = new File("src/main/resources/differentScreenshots/diff_CheckMainPageScreenshot.png");

        // Сравниваем
        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage, resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }

    @Step("Кликаем по кнопке Drag в меню и переходим на экран драг")
    public DragPage clickDragMenuButton() {
        $(locator().dragButton()).click();
        return new DragPage();
    }
}

