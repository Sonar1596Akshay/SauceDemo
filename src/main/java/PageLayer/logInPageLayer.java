package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class logInPageLayer extends BaseClass
{
	@FindBy(xpath = "//div[@class='login-box']/descendant::input[@id='user-name']")
	private WebElement userName;
	
	@FindBy(xpath = "//div[@class='login-box']/descendant::input[@id='password']")
	private WebElement passWord;
	
	@FindBy(xpath = "//div[@class='login-box']/descendant::input[@id='login-button']")
	private WebElement logIN;
	
	public logInPageLayer()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userCredentials(String UserID, String Password)
	{
		Wait.sendKeys(userName, UserID);
		
		Wait.sendKeys(passWord, Password);
	}
	
	public void logINButton()
	{
		Wait.clickToBe(logIN);
	}
	
	

}
