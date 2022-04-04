package ru.gb.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import ru.gb.locators.Interfaces.LoginPageLocators;
import ru.gb.locators.LocatorService;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    // Метод позволяет работать с локаторами для нужной нам страницы
    private LoginPageLocators locator() {
        return LocatorService.LOGIN_PAGE_LOCATORS;
    }

    @Step("Кликаем по кнопке 'Login' в форме")
    public LoginPage clickLoginButton() {
        $(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkLoginErrorText(String text) {
        $(locator().loginErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

    @Step("Тап Sign in таба")
    public LoginPage clickSignUpTab() {
        $(locator().signUpTab()).click();
        return new LoginPage();
    }

    @Step("Вводим валидный email")
    public LoginPage senKeysEmail(String email) {
        $(locator().emailField()).sendKeys(email);
        return new LoginPage();
    }

    @Step("Вводим валидный password")
    public LoginPage senKeysPassword(String password) {
        $(locator().passwordField()).sendKeys(password);
        return new LoginPage();
    }

    @Step("Вводим другой password")
    public LoginPage senKeysConfirmPassword(String confirmPassword) {
        $(locator().passwordConfirmField()).sendKeys(confirmPassword);
        return new LoginPage();
    }

    @Step("Отправка формы по тапу Sign in")
    public LoginPage clickSignUpButton() {
        $(locator().signUpButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkErrorTextConfirmPassword(String text) {
        $(locator().ErrorTextConfirm()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkErrorTextShortPassword(String text) {
        $(locator().ErrorTextShortPassword()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

}


