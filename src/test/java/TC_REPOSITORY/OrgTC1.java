package TC_REPOSITORY;

import org.openqa.selenium.WebDriver;

import GenericUtility.ExcelUtility;
import GenericUtility.HomePage;
import GenericUtility.JavaUtility;
import OBJECTRepository.LeadsHomePage;
import OBJECTRepository.OrgHomePage;

public class OrgTC1 {

	
	public void OrgTC01Case() throws Exception {
	     JavaUtility JUTIL =new JavaUtility();
		 int num = JUTIL.getRandomNumber(1000);
		 ExcelUtility EUTIL= new ExcelUtility();
		 String FIRSTNAME = EUTIL.readDataFromEXcel("Organisations",3,2);
		 String LASTNAME = EUTIL.readDataFromEXcel("Organisations",3,3);
		 String COMPANY = EUTIL.readDataFromEXcel("Oraganisations",3,4);
		 
		 WebDriver driver=null;
		HomePage hp= new HomePage(driver);
			hp.clickonorg();
			OrgHomePage org = new OrgHomePage(driver);
			org.ClickOnNeworgBtn();
			Createorg
			
  }
}
