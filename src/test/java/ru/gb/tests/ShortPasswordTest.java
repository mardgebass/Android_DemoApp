package ru.gb.tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;

public class ShortPasswordTest extends BaseTest {

    @Test
    @Description("Проверяем введение пароля <8 символов")
    public void checkLengthPassword() {

        openApp()
                .clickLoginMenuButton()
                .senKeysPassword("test123")
                .clickLoginButton()
                .checkErrorTextShortPassword("Please enter at least 8 characters");
    }

    }
