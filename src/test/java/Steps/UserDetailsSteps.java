package Steps;

import BaseLayer.BaseClass;
import PageLayer.yourInformationPageLayer;
import io.cucumber.java.en.Then;

public class UserDetailsSteps extends BaseClass{
	protected yourInformationPageLayer info;
	@Then("user enter details")
	public void user_enter_details() {
	    info = new yourInformationPageLayer();
	    info.UserInformations("Jhon", "Price", "879452");
	   
	}

	@Then("click on continue button")
	public void click_on_continue_button() {
	    info.clickOnContinue();
	}

}
