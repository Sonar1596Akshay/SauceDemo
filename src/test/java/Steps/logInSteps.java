package Steps;

import BaseLayer.BaseClass;
import PageLayer.logInPageLayer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logInSteps extends BaseClass
{
	protected logInPageLayer logIN;
	@Given("user open URL on browser")
	public void user_open_url_on_browser() {
	    BaseClass.initilazations();
	}

	@When("user enter userName and password")
	public void user_enter_user_name_and_password() {
	   logIN = new logInPageLayer();
	   logIN.userCredentials("standard_user", "secret_sauce");
	}

	@Then("click on LoginButton")
	public void click_on_login_button() {
	    logIN.logINButton();

}
}
