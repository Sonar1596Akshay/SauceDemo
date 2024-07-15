package Steps;

import BaseLayer.BaseClass;
import PageLayer.overviewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OverViewSteps extends BaseClass {
	
	protected overviewPage overView;
	
	@Given("user validate total price")
	public void user_validate_total_price() {
	  overView = new overviewPage();
	  overView.verifyOverView();
	  
	}

	@Then("user click on finishButton")
	public void user_click_on_finish_button() {
	    overView.clickOnFinishButton();
	}

}
