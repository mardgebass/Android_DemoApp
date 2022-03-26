package ru.gb.tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;

public class NotSamePasswordTest extends BaseTest {

    @Test
    @Description("Проверяем подтверждение пароля при введении разных паролей")
    public void checkConfirmPassword() {

        openApp().clickLoginMenuButton()
                .clickSignUpTab()
                .senKeysEmail("test123@mail.ru")
                .senKeysPassword("testtest123")
                .senKeysConfirmPassword("testtest")
                .clickSignUpButton()
                .checkErrorTextConfirmPassword("Please enter the same password");
    }

    }
