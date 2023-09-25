package TestCases;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import Pages.LoginPage;
//import Pages.ProductsPage;

public class FunctionalTests {
	
	//WebDriver driver; //We have to maintain outside the class always, so that both the method have access. 
	//LoginPage lp; //Creating the object of this class
	//ProductsPage pp;
	
	@BeforeMethod
	public void Before() {
		//driver = new ChromeDriver();
		//driver.get("https://www.saucedemo.com/v1/");
		//driver.manage().window().maximize();
			
	}
	
//Creating Test Cases
	
	@Test
	public void LoginTest() {
		//lp = new LoginPage(driver);
		//lp.enterUsername();
		//lp.enterPassword();
		//lp.loginButton();	
	}
	@Test
	public void Shopping() throws InterruptedException {
		//lp = new LoginPage(driver);
		//lp.enterUsername();
		//lp.enterPassword();
		//lp.loginButton();
		//Thread.sleep(2000);
		//pp.clickBackpack();
		//pp.clickAddtocart();
		//pp.getPrice();
		//pp.clickCart();
		
	}
	
	@AfterMethod
	
	public void After() {
		//driver.quit();
	}

}
