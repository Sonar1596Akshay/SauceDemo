package Steps;

import BaseLayer.BaseClass;
import PageLayer.checkOutCompletePage;
import io.cucumber.java.en.Then;

public class checkOutSteps extends BaseClass
{
	protected checkOutCompletePage checkout;
	
	@Then("capture order message")
	public void capture_order_message() {
		checkout = new checkOutCompletePage();
	    checkout.captureMsg();
	}

	@Then("click on HomePage button")
	public void click_on_home_page_button() {
	    checkout.clickToHomPage();
	}

}
