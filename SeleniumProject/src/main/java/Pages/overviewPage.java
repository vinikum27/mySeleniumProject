package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class overviewPage extends basePage {

	public overviewPage(WebDriver driver) {
		super(driver);
	}	
	@FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")
	private WebElement finish;
	
	@FindBy(name = "cancel")
	private WebElement cancel;
	
	public void clickFinish() {
		click(finish);
	}
	public void clickCancel() {
		click(cancel);
	}

}
