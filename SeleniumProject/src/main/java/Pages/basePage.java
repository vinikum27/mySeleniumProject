package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	
	WebDriver driver; //driver has to be declare in only one time in (Pages(basePage) & TestCases(BaseTest))
	public basePage(WebDriver driver) { //In Page constructor we should have basePage, it extends everyPage, we should place argument(driver) in basePage. so, that it should not repeat the code.
		PageFactory.initElements(driver, this); //In Page Constructor we have to make a connection between Page Elements and Page Actions for that we are using PageFactory
		this.driver = driver;
	}
	public void waitforElement(WebElement e) { 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOf(e));	//e means WebElement e
	}
	
	public void click(WebElement e) { // this method will use in page actions
		waitforElement(e); //element should load properly before click
		e.click();
	}
	
	public void sendKeys(WebElement e, String str) {
		waitforElement(e);
		e.clear();
		e.sendKeys(str);
	}
	public void scrollToElement(WebElement e) {
		waitforElement(e);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", e);
	}
	
	public void DropDownByIndex(int index, WebElement e) {
		waitforElement(e);
		Select select = new Select(e);
		select.selectByIndex(index);
	}
	
	public void DropDownByVisibleText(String text, WebElement e) {
		waitforElement(e);
		Select select = new Select(e);
		select.selectByVisibleText(text);
	}
	
	public void DropDownByValue(String text, WebElement e) {
		waitforElement(e);
		Select select = new Select(e);
		select.selectByValue(text);
	}
	public void DragAndDrop(WebElement start, WebElement end) {
		waitforElement(start);
		waitforElement(end);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(start, end).perform();
	}


}
