package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class overviewPage extends BaseClass {

	@FindBy(xpath = "//div[@class='summary_total_label']")
	private WebElement verifyPrice;

	@FindBy(xpath = "//*[contains(text(),'Finish')]")
	private WebElement finishButton;

	public overviewPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyOverView() {
		String price = verifyPrice.getText();
		System.out.println(price);

	}

	public void clickOnFinishButton() {
		Wait.clickToBe(finishButton);
	}

}
