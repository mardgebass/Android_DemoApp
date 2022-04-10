package ru.gb.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.gb.base.BaseTest;
import ru.gb.pages.SwipePage;

public class SwipeSteps extends BaseTest {

    SwipePage swipePage;

    @Given("^User is on Swipe page$")
    public void user_is_on_Swipe_page() {
        swipePage = openApp().clickSwipeMenuButton();
    }

    @When("^User swipe card$")
    public void user_swipe_card() {
        swipePage.swipeLeft();
    }

    @Then("^User should see a new card$")
    public void user_should_see_a_new_card() {
        swipePage.checkCards();
    }

}
