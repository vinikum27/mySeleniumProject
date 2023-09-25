package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest { //Why we are creating BaseTest (parent) class, because every Test case class should not have repeat below codes and we need to extend in child class(myTestCases).
	
	WebDriver driver; //driver has to be declare in only one time in (Pages(basePage) & TestCases(BaseTestr))
	
	@BeforeClass
	public void Before() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void After() {
		driver.quit();	}
	

}
