package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class logoutPage extends BaseClass
{
	@FindBy(xpath = "//button[text()='Open Menu']")
	private WebElement openMenu;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
	public logoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickToBeLogOut()
	{
		Wait.clickToBe(openMenu);
		Wait.clickToBe(logoutButton);
	}

}
