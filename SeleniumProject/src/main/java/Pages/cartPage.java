package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage extends basePage {

	public cartPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[2]/a[2]")  // 1. Page elements 2. page constructor 3. page actions
	private WebElement checkOut;
	
	@FindBy(id = "continue-shopping")
	private WebElement contShopping;
	
	public void clickCheckOut() {
		click(checkOut);
	}
	
	public void clickContShopping() {
		click(contShopping);
	}

}
