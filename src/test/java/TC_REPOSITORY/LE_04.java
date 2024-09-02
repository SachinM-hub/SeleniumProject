package TC_REPOSITORY;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.HomePage;
import GenericUtility.JavaUtility;
import OBJECTRepository.CreateNewLeadPage;
import OBJECTRepository.LeadsHomePage;

public class LE_04 extends  BaseClass{
	@Test
	public void le_04Case() throws Exception {
		 JavaUtility JUTIL =new JavaUtility();
		 int num = JUTIL.getRandomNumber(1000);
		 GenericUtility.ExcelUtility EUTIL= new GenericUtility.ExcelUtility();
		 String FIRSTNAME = EUTIL.readDataFromEXcel("Leads",13,2);
		 String LASTNAME = EUTIL.readDataFromEXcel("Leads",13,3);
		 String COMPANY = EUTIL.readDataFromEXcel("Leads",13,4);
		 String TTE = EUTIL.readDataFromEXcel("Leads",13,5);
		 String PHN = EUTIL.readDataFromEXcel("Leads",13,6);
		 String MOB = EUTIL.readDataFromEXcel("Leads",13,7);
		 String EML = EUTIL.readDataFromEXcel("Leads",13,8);
		 String POB = EUTIL.readDataFromEXcel("Leads",13,11);
		 String POC = EUTIL.readDataFromEXcel("Leads",13,12);
		 String CTY = EUTIL.readDataFromEXcel("Leads",13,13);
		 String CNTRY = EUTIL.readDataFromEXcel("Leads",13,14);
		 String STE = EUTIL.readDataFromEXcel("Leads",13,15);
		 
		 HomePage hp= new HomePage(driver);
			hp.clickonLeads();
			LeadsHomePage lp = new LeadsHomePage(driver);
			lp.clickOnNewLeadBtn();
			CreateNewLeadPage cn = new CreateNewLeadPage(driver);
			cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY, TTE, PHN, MOB, EML, POB, POC, CTY, CNTRY, STE);
			Thread.sleep(4000);
			

	   }
	

    }

