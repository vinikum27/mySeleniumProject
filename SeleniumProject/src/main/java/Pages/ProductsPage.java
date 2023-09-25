package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends basePage {
	

//1. Page Constructor
		
		public ProductsPage (WebDriver driver) {
			super(driver);
			
		}
	    
//2. Page Elements
	    
		@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
		private WebElement backPack;
		
		@FindBy(id = "add-to-cart-sauce-labs-backpack")
		private WebElement addToCart;
		
		@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
		private WebElement jacket;
		
		@FindBy(xpath = "//div[text()='Products']")
		private WebElement heading;
		
// 3. Page actions
		
		public void clickbackPack() {
			click(backPack);
		}
		public void clickAddToCart() {
			click(addToCart);
		}
		public void clickFleeceJacket() {
			click(jacket);
		}
		public String getHeading() {
			return heading.getText();
		}
	    
	}

