package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productDetailsPage extends basePage {

	public productDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(className = "shopping_cart_badge")
	private WebElement shoppingCart;
	
	@FindBy(xpath= "/html/body/div/div[2]/div[2]/div/div/div/button")
	private WebElement addToCart;
	
	@FindBy(xpath= "/html/body/div/div[2]/div[2]/div/button")
	private WebElement back;
	
	public void clickAddtoCart() {
		click(addToCart);
	}
	public void clickbackToProductsPage() {
		click(back);
	}
	
	public void clickCart() {
		click(shoppingCart);
	}

}
