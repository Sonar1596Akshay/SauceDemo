package Steps;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Then;

public class tearDownSteps extends BaseClass
{
	@Then("terminate the browser")
	public void terminate_the_browser() throws InterruptedException {
	    Thread.sleep(3000);
	    driver.quit();
	}

}
