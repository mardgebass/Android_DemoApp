package ru.gb.tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;

public class EmptyEmailTest extends BaseTest {

    @Test
    @Description("Проверяем отправку формы с пустым email")
    public void checkEmptyEmail() {

        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText("Please enter a valid email address");
    }

}
