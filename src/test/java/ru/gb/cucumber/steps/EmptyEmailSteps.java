package ru.gb.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.gb.base.BaseTest;
import ru.gb.pages.LoginPage;

public class EmptyEmailSteps extends BaseTest {

    LoginPage loginPage;

    @Given("User is on Login page")
    public void user_is_on_login_page() {
        loginPage = openApp().clickLoginMenuButton();
        throw new io.cucumber.java.PendingException();
    }

    @When("User click login button")
    public void user_click_login_button() {
        loginPage.clickLoginButton();
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should see error message {string}")
    public void user_should_see_error_message(String string) {
        loginPage.checkLoginErrorText("Please enter a valid email address");
        throw new io.cucumber.java.PendingException();
    }
}
