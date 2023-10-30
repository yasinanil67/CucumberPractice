package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.MedunnaRegisterPage;

import static org.junit.Assert.assertTrue;

public class US002stepdefs {

    MedunnaRegisterPage medunnaRegisterPage = new MedunnaRegisterPage();

    @Given("US002AC01TC01: User leaves the username blank, there should be Your username is required. error message")
    public void us002ac01tc01_user_leaves_the_username_blank_there_should_be_your_username_is_required_error_message() {

        medunnaRegisterPage.username.sendKeys(Keys.ENTER);
        assertTrue(medunnaRegisterPage.requiredUsername.isDisplayed());
    }

    @When("US002AC01TC02: User enters username special chars £#$€, there should be Your username is invalid. error message")
    public void us002ac01tc02_user_enters_username_special_chars_£_$€_there_should_be_your_username_is_invalid_error_message() {

        medunnaRegisterPage.username.sendKeys("£#$€"+Keys.ENTER);
        assertTrue(medunnaRegisterPage.invalidUsername.isDisplayed());

    }

    @When("US002AC01TC03: User enters username  that can contain any chars, there should not be any error message")
    public void us002ac01tc03_user_enters_username_that_can_contain_any_chars_there_should_not_be_any_error_message() {

        medunnaRegisterPage.username.clear();
        medunnaRegisterPage.username.sendKeys("john_doe"+Keys.ENTER);

    }

}
