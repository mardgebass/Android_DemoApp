package ru.gb.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.gb.base.BaseTest;
import ru.gb.pages.SwipePage;

public class SwipeSteps extends BaseTest {

//    SwipePage swipePage;
//
//    @Given("User is on Swipe page")
//    public void user_is_on_Swipe_page() {
//        swipePage = openApp().clickSwipeMenuButton();
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("User swipe card")
//    public void user_swipe_card() {
//        swipePage.swipeLeft();
//    }
//
//    @Then("User should see a new card")
//    public void user_should_see_a_new_card() {
//        swipePage.checkCards();
//    }

    SwipePage swipePage;

    @Given("User is on Swipe page")
    public void user_is_on_swipe_page() {
        swipePage = openApp().clickSwipeMenuButton();
        throw new io.cucumber.java.PendingException();
    }
    @When("User swipe card")
    public void user_swipe_card() {
        swipePage.swipeLeft();
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should see a new card")
    public void user_should_see_a_new_card() {
        swipePage.checkCards();
        throw new io.cucumber.java.PendingException();
    }


}
