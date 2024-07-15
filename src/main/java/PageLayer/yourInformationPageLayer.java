package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class yourInformationPageLayer extends BaseClass
{
	@FindBy(id = "first-name")
	private WebElement firstName;
	
	@FindBy(id = "last-name")
	private WebElement lasttName;
	
	@FindBy(id = "postal-code")
	private WebElement PINCode;
	
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	public yourInformationPageLayer()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void UserInformations(String FirstName, String LastName, String ZipCode)
	{
		Wait.sendKeys(firstName, FirstName);
		Wait.sendKeys(lasttName, LastName);
		Wait.sendKeys(PINCode, ZipCode);
		
	}
	
	public void clickOnContinue()
	{
		Wait.clickToBe(continueButton);
	}
	
	

}
