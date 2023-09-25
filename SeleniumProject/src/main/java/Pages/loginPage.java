package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends basePage { //Every page should have 3 things, 1. Page Constructor, 2.Page Elements, 3. Page Actions.
	
	
//1. Page Constructor	
	
	public loginPage(WebDriver driver) { 
		super(driver); //Super means referring to the parent class(BasePage) using super keyword. so that no need to write (PageFactory.initElements(driver, this)) in every page. we can store it (PageFactory.initElements) in basePage and extends(keyword) in everyPage. so, that it should not repeat the code.
	}
//2. Page Elements // Page Elements will written only in Page repository
	
	@FindBy(id= "user-name") 
	private WebElement Uname; //Why Private? because "user-name element" will not using outside the login page
	
	@FindBy(name= "password")
	private WebElement pwd;
	
	@FindBy(id= "login-button")
	private WebElement btn;
	
	@FindBy(xpath= "//h3")
	private WebElement error;

//3. Page Actions
	
	public void enterUsername(String uName) { //Why public? because we are going to create object of the class(LoginPage) in TestCase and we are going to use these methods(page action), we are not going to use page elements
		sendKeys(Uname, uName);
	}

	public void enterPassword(String pwsd) {
		sendKeys(pwd, pwsd);
	} 
	public void loginButton() {
		click(btn);
	}
	public String getErrorMsg() { //Why String instead of void? Because it is returning as message.(String as return type)
		return error.getText();  
	}
	
}
