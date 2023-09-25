package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.ProductsPage;
import Pages.cartPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.overviewPage;
import Pages.productDetailsPage;
import ReadData.readTestData;


public class myTestCases extends BaseTest {
	
	//How to run all Two Test Cases/classes in one time using suite (myTestCases and loginScenerios), for that we need to convert into xml file. RightClick in any (myTestCases) TestNg convert to TestNg. so it will create testng.xml file.
		
	@Test
	public void shopping() throws InterruptedException {
		
		new loginPage(driver).enterUsername(new readTestData().getuserName()); // For storing/maintain the TestData like(userName, Password, info details, errorMsgs etc..)we can create a separate file and we can maintain there, for that we need to create package in src/main/resources. Example, imagine if we have 100 TestCases we can't go and change userName, password in every TestCase, better we can go that file and change it. 
		new loginPage(driver).enterPassword("secret_sauce");
		new loginPage(driver).loginButton();
		new ProductsPage(driver).clickbackPack();
		Thread.sleep(2000);
		new productDetailsPage(driver).clickAddtoCart();
		new productDetailsPage(driver).clickbackToProductsPage();
		new ProductsPage(driver).clickFleeceJacket();
		Thread.sleep(2000);
		new productDetailsPage(driver).clickAddtoCart();
		new productDetailsPage(driver).clickCart();
		new cartPage(driver).clickCheckOut();
		new infoPage(driver).enterDetails();
		new overviewPage(driver).clickFinish();
		new completePage(driver).getSuccessMsg();
		String expectedStatus = "THANK YOU FOR YOUR ORDER";
		String actualStatus = new completePage(driver).getSuccessMsg();
		Assert.assertEquals(expectedStatus, actualStatus);
			
	}
	
}
