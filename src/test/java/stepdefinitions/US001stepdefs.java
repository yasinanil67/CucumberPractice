package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.MedunnaHomePage;
import pages.MedunnaRegisterPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US001stepdefs {
    MedunnaHomePage homePage = new MedunnaHomePage();
    MedunnaRegisterPage medunnaRegisterPage = new MedunnaRegisterPage();

    @Given("User goes to homepage")
    public void user_goes_to_homepage() {

        Driver.getDriver().get("https://medunna.com");

    }
    @When("user clicks user icon")
    public void user_clicks_user_icon() {

        homePage.userIcon.click();

    }
    @When("user clicks register link")
    public void user_clicks_register_link() {

        homePage.registerOption.click();

    }
    @Given("AC001TC01: User enters the ssn first dash missing, there should be Your SSN is invalid message")
    public void ac001tc01_user_enters_the_ssn_first_dash_missing_there_should_be_your_ssn_is_invalid_message() {

        medunnaRegisterPage.ssn.sendKeys("44499-5678"+ Keys.ENTER);
        assertTrue(medunnaRegisterPage.invalidSsn.isDisplayed());

    }
    @When("AC001TC02: User enters the ssn second dash missing, there should be Your SSN is invalid message")
    public void ac001tc02_user_enters_the_ssn_second_dash_missing_there_should_be_your_ssn_is_invalid_message() {
        medunnaRegisterPage.ssn.clear();
        medunnaRegisterPage.ssn.sendKeys("444-995678"+ Keys.ENTER);
        assertTrue(medunnaRegisterPage.invalidSsn.isDisplayed());

    }
    @When("AC001TC03: User enters the ssn one digit missing, there should be Your SSN is invalid message")
    public void ac001tc03_user_enters_the_ssn_one_digit_missing_there_should_be_your_ssn_is_invalid_message() {
        medunnaRegisterPage.ssn.clear();
        medunnaRegisterPage.ssn.sendKeys("444-99-558"+ Keys.ENTER);
        assertTrue(medunnaRegisterPage.invalidSsn.isDisplayed());


    }
    @When("AC001TC04: User enters the ssn with a non numeric character, there should be Your SSN is invalid message")
    public void ac001tc04_user_enters_the_ssn_with_a_non_numeric_character_there_should_be_your_ssn_is_invalid_message() {

        medunnaRegisterPage.ssn.clear();
        medunnaRegisterPage.ssn.sendKeys("444-99-558X"+ Keys.ENTER);
        assertTrue(medunnaRegisterPage.invalidSsn.isDisplayed());

    }
    @When("AC001TC05: User enters a valid ssn, there should not be any error message")
    public void ac001tc05_user_enters_a_valid_ssn_there_should_not_be_any_error_message() {

        medunnaRegisterPage.ssn.clear();
        medunnaRegisterPage.ssn.sendKeys("444-99-5587"+ Keys.ENTER);
    }

    @Given("AC002TC01: User leaves the ssn blank, there should be Your SSN is required message")
    public void ac002tc01_user_leaves_the_ssn_blank_there_should_be_your_ssn_is_required_message() {

        medunnaRegisterPage.ssn.clear();
        medunnaRegisterPage.ssn.sendKeys(Keys.ENTER);
        assertTrue(medunnaRegisterPage.requiredSsn.isDisplayed());


    }
    @When("AC002TC02: User enters the ssn only space, there should be Your SSN is required. message")
    public void ac002tc02_user_enters_the_ssn_only_space_there_should_be_your_ssn_is_required_message() {

        medunnaRegisterPage.ssn.clear();
        medunnaRegisterPage.ssn.sendKeys(" "+Keys.ENTER);
        assertTrue(medunnaRegisterPage.requiredSsn.isDisplayed());

    }

    @Given("AC003TC01: User leaves the FirstName blank, there should be Your FirstName is required message")
    public void ac003tc01_user_leaves_the_first_name_blank_there_should_be_your_first_name_is_required_message() {

        medunnaRegisterPage.firstName.sendKeys(Keys.ENTER);
        assertTrue(medunnaRegisterPage.requiredFirstName.isDisplayed());

    }
    @When("AC003TC02: User enters the FirstName only space, there should be Your FirstName is required message")
    public void ac003tc02_user_enters_the_first_name_only_space_there_should_be_your_first_name_is_required_message() {

        medunnaRegisterPage.firstName.sendKeys(" "+Keys.ENTER);
        assertTrue(medunnaRegisterPage.requiredFirstName.isDisplayed());


    }
    @When("AC003TC03: User enters the name that contains any chars, there should not be any error message")
    public void ac003tc03_user_enters_the_name_that_contains_any_chars_there_should_not_be_any_error_message() {

        medunnaRegisterPage.firstName.sendKeys("John"+Keys.ENTER);

    }

    @Given("AC004TC01: User leaves the lastname blank, there should be Your LastName is required message")
    public void ac004tc01_user_leaves_the_lastname_blank_there_should_be_your_last_name_is_required_message() {

        medunnaRegisterPage.lastName.sendKeys(Keys.ENTER);
        assertTrue(medunnaRegisterPage.requiredLastName.isDisplayed());

    }
    @When("AC004TC02: User enters the lastname only space, there should be Your LastName is required message")
    public void ac004tc02_user_enters_the_lastname_only_space_there_should_be_your_last_name_is_required_message() {

        medunnaRegisterPage.lastName.sendKeys(" "+Keys.ENTER);
        assertTrue(medunnaRegisterPage.requiredLastName.isDisplayed());

    }
    @When("AC004TC03: User enters the lastname that contains any chars, there should not be any error message")
    public void ac004tc03_user_enters_the_lastname_that_contains_any_chars_there_should_not_be_any_error_message() {

        medunnaRegisterPage.lastName.clear();
        medunnaRegisterPage.lastName.sendKeys("Doe"+Keys.ENTER);

    }

}
