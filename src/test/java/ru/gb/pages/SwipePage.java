package ru.gb.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ru.gb.locators.Interfaces.SwipePageLocators;
import ru.gb.locators.LocatorService;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SwipePage {

    private SwipePageLocators locator() {
        return LocatorService.SWIPE_PAGE_LOCATORS;
    }

    @Step("Свайп баннера влево")
    public SwipePage swipeLeft() {

        sleep(2000);

        WebDriver driver = WebDriverRunner.getWebDriver();

        new TouchAction((PerformsTouchActions) driver)

                // Точка куда нажимаем и держим
                .press(PointOption.point(1025, 1245))
                //  Время удержания
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                // Точка куда движется свайп
                .moveTo(PointOption.point(125,1245))
                .release().perform();
        return new SwipePage();
    }

    @Step("Проверка видимости ранее скрытого баннера")
    public SwipePage checkCards() {
        $(locator().hideCard()).shouldHave(Condition.visible);
        return new SwipePage();
    }



}
