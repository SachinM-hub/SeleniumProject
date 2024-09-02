package TC_REPOSITORY;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;

import GenericUtility.HomePage;
import GenericUtility.JavaUtility;
import OBJECTRepository.CreateNewLeadPage;
import OBJECTRepository.LeadsHomePage;
@Listeners(GenericUtility.ListenersImplementationClass.class)
public class LE_01 extends BaseClass {
	
	
	@Test(retryAnalyzer= GenericUtility.RetryAnalyserImPlementationclass.class)
 public void le_01Case() throws Exception {
     JavaUtility JUTIL =new JavaUtility();
	 int num = JUTIL.getRandomNumber(1000);
	 GenericUtility.ExcelUtility EUTIL= new GenericUtility.ExcelUtility();
	 String FIRSTNAME = EUTIL.readDataFromEXcel("Leads",2,1);
	 String LASTNAME = EUTIL.readDataFromEXcel("Leads",2,2);
	 String COMPANY = EUTIL.readDataFromEXcel("Leads",2,3);
	HomePage hp= new HomePage(driver);
	Thread.sleep(2000);
	hp.clickonLeads();
	LeadsHomePage lp = new LeadsHomePage(driver);
	Thread.sleep(4000);
	lp.clickOnNewLeadBtn();
	CreateNewLeadPage cn = new CreateNewLeadPage(driver);
	cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY);
	 Thread.sleep(4000);
}
}
	
