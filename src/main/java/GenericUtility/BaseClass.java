package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import GenericUtility.SeleniumUtility;

public class BaseClass {
	 public WebDriver driver = null;
	SeleniumUtility SUTIL = null;
	PropertiesUtility PUTIL = new PropertiesUtility();
	
	@BeforeSuite(alwaysRun= true)
	public void CreateConnection() {
	System.out.println("connection established");
}
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception {
		String Url = PUTIL.getDataFromProperties("url");
		SUTIL = new SeleniumUtility();
		driver= new ChromeDriver();
		SUTIL.implicitWait(driver ,10);
		SUTIL.maximizeWindow(driver);
		Thread.sleep(3000);
		driver.get(Url);
		System.out.println("launching successfull!!");
		
}
	@BeforeMethod(alwaysRun = true)
	public void loginApp() throws Exception{
	String USERNAME = PUTIL.getDataFromProperties("username");
	String PASSWORD = PUTIL.getDataFromProperties("password");
	LoginPage lp = new LoginPage(driver); 
	Thread.sleep(3000);
	lp.loginOperation(USERNAME, PASSWORD);
	Thread.sleep(3000);
	System.out.println("login successfull!!");
	}
	
	@AfterClass(alwaysRun = true)
	public void logoutApp() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("logout successfull!!");
	}
	@AfterClass(alwaysRun= true)
	public void closeAPP() {
		driver.close();
		System.out.println("closed successfully!!");
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeConnection() {
		System.out.println("connection closed successfull!!");
		
	}
}
	
