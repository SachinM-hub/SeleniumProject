package TC_REPOSITORY;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenericUtility.ExcelUtility;
import GenericUtility.HomePage;
import GenericUtility.JavaUtility;
import OBJECTRepository.CreateNewLeadPage;
import OBJECTRepository.LeadsHomePage;

public class LE_03 {
	@Test
	public void le_03Case() throws Exception {
		 JavaUtility JUTIL =new JavaUtility();
		 int num = JUTIL.getRandomNumber(1000);
		 ExcelUtility EUTIL= new ExcelUtility();
		 String FIRSTNAME = EUTIL.readDataFromEXcel("Leads",10,2);
		 String LASTNAME = EUTIL.readDataFromEXcel("Leads",10,3);
		 String COMPANY = EUTIL.readDataFromEXcel("Leads",10,4);
		 String TTE = EUTIL.readDataFromEXcel("Leads",10,5);
		 String PHN = EUTIL.readDataFromEXcel("Leads",10,6);
		 String MOB = EUTIL.readDataFromEXcel("Leads",10,7);
		 String EML = EUTIL.readDataFromEXcel("Leads",10,8);
		 String NOE = EUTIL.readDataFromEXcel("Leads",10,9);
		

		WebDriver driver=null;
		HomePage hp= new HomePage(driver);
			hp.clickonLeads();
			LeadsHomePage lp = new LeadsHomePage(driver);
			lp.clickOnNewLeadBtn();
			CreateNewLeadPage cn = new CreateNewLeadPage(driver);
			cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY, TTE, PHN, MOB, EML, NOE);
		
			Thread.sleep(4000);
			

	   }
	}
		 
		 

