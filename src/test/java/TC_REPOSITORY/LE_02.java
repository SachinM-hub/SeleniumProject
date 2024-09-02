package TC_REPOSITORY;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.HomePage;
import GenericUtility.JavaUtility;
import OBJECTRepository.CreateNewLeadPage;
import OBJECTRepository.LeadsHomePage;

public class LE_02 extends BaseClass{
	
	@Test
	public void le_02Case() throws Exception {
		 JavaUtility JUTIL =new JavaUtility();
		 int num = JUTIL.getRandomNumber(1000);
		 GenericUtility.ExcelUtility EUTIL= new GenericUtility.ExcelUtility();
		 String FIRSTNAME = EUTIL.readDataFromEXcel("Leads",6,1);
		 String LASTNAME = EUTIL.readDataFromEXcel("Leads",6,2);
		 String COMPANY = EUTIL.readDataFromEXcel("Leads",6,3);
		 String TTE = EUTIL.readDataFromEXcel("Leads",6,4);
		 String PHN = EUTIL.readDataFromEXcel("Leads",6,5);
		 String MOB = EUTIL.readDataFromEXcel("Leads",6,6);
		 String EML = EUTIL.readDataFromEXcel("Leads",6,7);
		 String NOE = EUTIL.readDataFromEXcel("Leads",6,8);
		 String STR = EUTIL.readDataFromEXcel("Leads",6,9);
		 String POB = EUTIL.readDataFromEXcel("Leads",6,10);
		 String POC = EUTIL.readDataFromEXcel("Leads",6,11);
		 String CTY = EUTIL.readDataFromEXcel("Leads",6,12);
		 String CNTRY = EUTIL.readDataFromEXcel("Leads",6,13);
		 String STE = EUTIL.readDataFromEXcel("Leads",6,14);
		HomePage hp= new HomePage(driver);
		hp.clickonLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		Thread.sleep(4000);
		lp.clickOnNewLeadBtn();
		Thread.sleep(4000);
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY, TTE, PHN, MOB, EML, NOE, STR, POB, POC, CTY, CNTRY, STE);
		Thread.sleep(4000);
		

   }
}
