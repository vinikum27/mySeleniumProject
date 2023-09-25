package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ProductsPage;
import Pages.loginPage;
import ReadData.readTestData;

public class loginScenerios extends BaseTest {
	
	//How to run all Two Test Cases/classes in one time using suite (myTestCases and loginScenerios), for that we need to convert into xml file. RightClick in any (loginScenerios) TestNg convert to TestNg. so it will create testng.xml file.
	
//First way we need to create object & Reference variable.
	
	loginPage lp; //Here lp means Reference variable
	
	@Test
	public void invalidUsername() {
		lp = new loginPage(driver); //Here lp means object of the loginPage, why object? because we are using "new" keyword and className, we are using the driver from parent (BeforeAndAfter) class. According to Inheritance we can use anything from parent class.
		lp.enterUsername("6783982");
		lp.enterPassword("secret_sauce");
		lp.loginButton();
		String expectedError = "Epic sadface: Username and password do not match any user in this service";
		String actualError = lp.getErrorMsg();
		Assert.assertEquals(actualError, expectedError);
		
	}
	
//Second way no need to create object or Reference variable, when we use "new" keyword
	
	@Test
    public void invalidpassword() {
		String uname = new readTestData().getuserName(); // or we can use like password, no need to write separate string
		new loginPage(driver).enterUsername(uname); 
		new loginPage(driver).enterPassword(new readTestData().getinvalidPwd());;
		new loginPage(driver).loginButton();
		String expectedError = new readTestData().getErr();
		String actualError = new loginPage(driver).getErrorMsg();
		Assert.assertEquals(actualError, expectedError);
		
	}
    
	@Test
    public void emptyLogin() {
		new loginPage(driver).enterUsername(""); //Java 8 New method
		new loginPage(driver).enterPassword("");;
		new loginPage(driver).loginButton();
		String expectedError = new readTestData().getEmptyErr();
		String actualError = new loginPage(driver).getErrorMsg();
		Assert.assertEquals(actualError, expectedError); //pass or fail decision
		
	}
    
	@Test
    public void validLogin() {
		new loginPage(driver).enterUsername("standard_user"); //Java 8 New method
		new loginPage(driver).enterPassword("secret_sauce");;
		new loginPage(driver).loginButton();
		String actual= new ProductsPage(driver).getHeading();
		String expected = "Products";
		Assert.assertEquals(actual, expected);
		
		
	}

}
