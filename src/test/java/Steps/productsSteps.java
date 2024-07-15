package Steps;

import BaseLayer.BaseClass;
import PageLayer.productPageLayer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class productsSteps extends BaseClass{
	
	protected productPageLayer product;
	
	@When("User click on filter and select price high to low")
	public void user_click_on_filter_and_select_price_high_to_low() {
	   product = new productPageLayer();
	   product.clickOnFilterAndSelectPrice();
	   
	}

	@When("user add first {int} products to cart")
	public void user_add_first_products_to_cart(Integer Products) {
		product.selectProducts(Products);
	}

	@Then("User click on add to cart container")
	public void user_click_on_add_to_cart_container() {
	    product.addToCart();
	}

	@Then("User is checkout")
	public void user_is_checkout() {
	    product.checkOut();
	}
}
