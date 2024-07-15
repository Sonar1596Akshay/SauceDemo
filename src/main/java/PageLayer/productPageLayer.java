package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class productPageLayer extends BaseClass
{
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement clickonfilter;
	
	@FindBy(xpath="//option[text()='Price (high to low)']")
	private WebElement priceHighToLow ;
	
	@FindBys(@FindBy(xpath="//div[@class='inventory_item_label']/following-sibling::div/child::button"))
	private List<WebElement> productList;
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addtoCart ;
	
	@FindBy(name="checkout")
	private WebElement CheckOut ;
	
	public productPageLayer()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnFilterAndSelectPrice()
	{
		Wait.clickToBe(clickonfilter);
		Wait.clickToBe(priceHighToLow);
		
	}
	
	public void selectProducts(int productCount)
	{
		int counter=0;
		
		int maxCounter=productCount;
		
		for(WebElement list:productList)
		{
			if(counter<maxCounter)
			{
				Wait.clickToBe(list);
				counter++;
				
			}
		}
		
		
	}
	
	public void addToCart()
	{
		Wait.clickToBe(addtoCart);
	}
	
	public void checkOut()
	{
		Wait.clickToBe(CheckOut);
	}
	

}
