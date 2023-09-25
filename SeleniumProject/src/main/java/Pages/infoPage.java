package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class infoPage extends basePage {

	public infoPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "first-name")
	private WebElement fName;
	
	@FindBy(id = "last-name")
	private WebElement lName;
	
	@FindBy(id = "postal-code")
	private WebElement pCode;

	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/form/div[2]/input")
	private WebElement cont;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div/form/div[2]/a")
	private WebElement cancel;
	
	public void enterDetails() {
		sendKeys(fName, "Priya");
		sendKeys(lName, "Sharma");
		sendKeys(pCode, "52242343242342");
		click(cont);	
	}

}
