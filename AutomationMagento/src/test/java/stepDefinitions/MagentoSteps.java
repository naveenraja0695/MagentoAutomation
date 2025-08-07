package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Utils.MagentoUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MagentoSteps {
	 WebDriver driver;
     MagentoUtils account = new MagentoUtils();
	@Given("user open the Magento website")
	public void i_open_the_magento_website()  {
		
	    account.launchBrowser();
	    account.openHomePage();
	}

	@When("user click on the {string} link")
	public void i_click_on_the_link(String string)  {
	    account.openCreateAnAccount(string);
	    account.closeAd();
	}

	@And("user enter valid details for {string}, {string}, {string}, {string} and {string}")
	public void i_enter_valid_details_for_and(String firstname, String lastname, String email, String password, String confirmpass) {
	    account.userDetails(firstname, lastname, email, password, confirmpass);
	    }

	@And("user click on the {string} button")
	public void i_click_on_the_button(String string)  {
	    account.clickCreateButton( string);
	}

	@Then("user should see a success message after account creation")
	public void i_should_see_a_success_message_after_account_creation() {
	    account.verifySuccessRegistration();
		account.closeBrowser();
	     
	}

}
