package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class checkOutCompletePage extends BaseClass {

	@FindBy(xpath = "//*[contains(text(),'Thank you for your order!')]")
	private WebElement orderMsg;

	@FindBy(xpath = "//button[@id='back-to-products']")
	private WebElement homePage;
	
	public checkOutCompletePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void captureMsg()
	{
		String msg = orderMsg.getText();
		System.out.println(msg);
	}
	
	public void clickToHomPage()
	{
		Wait.clickToBe(homePage);
	}

}
