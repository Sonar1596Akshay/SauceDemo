package Steps;

import BaseLayer.BaseClass;
import PageLayer.logoutPage;
import io.cucumber.java.en.Then;

public class LogOutSteps extends BaseClass
{
	protected logoutPage loggedOut;
	
	@Then("user click on logout button")
	public void user_click_on_logout_button() {
	    loggedOut = new logoutPage();
	    loggedOut.clickToBeLogOut();
	}

}
