package OBJECTRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganisationPage {
    @FindBy(xpath = "//input[@name='accountname']")
    private WebElement orgName;
    
    @FindBy(xpath = "//input[@name='website']")
    private WebElement webSite;
    
    @FindBy(xpath = "//input[@name='employees']")
    private WebElement employees;
    
    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phn;
    
    @FindBy(xpath = "//input[@name='otherphone']")
    private WebElement otherPhn;
    
    @FindBy(xpath = "//input[@name='email1']")
    private WebElement email;
    
    
    @FindBy(xpath = "//textarea[@name='bill_street']")
    private WebElement billstreet;
    
    @FindBy(xpath = "//input[@name='bill_city']")
    private WebElement billingCity;
    
    @FindBy(xpath = "//input[@name='bill_state']")
    private WebElement billingstate;
    
    @FindBy(xpath = "//input[@title='Save [Alt+S]']")
    private WebElement saveBtn;
    
	public WebElement getOrgName() {
		return orgName;
	}


	public WebElement getWebSite() {
		return webSite;
	}



	public WebElement getEmployees() {
		return employees;
	}



	public WebElement getPhn() {
		return phn;
	}



	public WebElement getOtherPhn() {
		return otherPhn;
	}



	public WebElement getEmail() {
		return email;
	}



	public WebElement getBillstreet() {
		return billstreet;
	}



	public WebElement getBillingCity() {
		return billingCity;
	}



	public WebElement getBillingstate() {
		return billingstate;
	}



	public CreateOrganisationPage(WebDriver driver) {
       PageFactory.initElements(driver,this);

    }
	
	public WebElement getSaveBtn() {
			return saveBtn;
		}
	
	/**
	 * this business for org page Tc-01
	 * @param organisationName
	 * @param web
	 * @param emp
	 */
	
	public void createorganisation(String organisationName , String web , String emp ) {
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		saveBtn.click();
	}
	/**
	 * this is the business lib for Tc-02
	 * @param organisationName
	 * @param web
	 * @param billAd
	 * @param billCity
	 * @param billState
	 */
	public void createorganisation(String organisationName , String web ,String billAd , String billCity , String billState) {
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		billstreet.sendKeys(billAd);
		billingCity.sendKeys(billCity);
		billingstate.sendKeys(billState);
		saveBtn.click();
	}
	
/**
 * this is the business lib for Tc-03
 * @param organisationName
 * @param web
 * @param emp
 * @param phoneNumber
 * @param OtherPhone
 * @param mailId
 */
	public void createorganisation(String organisationName , String web , String emp , String phoneNumber , String OtherPhone , String mailId) {
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherPhn.sendKeys(OtherPhone);
		email.sendKeys(mailId);
		saveBtn.click();
		
	}
	/**
	 * this is bisness lib for Tc-04
	 * @param organisationName
	 * @param web
	 * @param emp
	 * @param phoneNumber
	 * @param OtherPhone
	 * @param mailId
	 * @param billAd
	 * @param billCity
	 * @param billState
	 */
		public void createorganisation(String organisationName , String web , String emp , String phoneNumber , String OtherPhone , String mailId, String billAd , String billCity , String billState) {
			orgName.sendKeys(organisationName);
			webSite.sendKeys(web);
			employees.sendKeys(emp);
			phn.sendKeys(phoneNumber);
			otherPhn.sendKeys(OtherPhone);
			email.sendKeys(mailId);
			billstreet.sendKeys(billAd);
			billingCity.sendKeys(billCity);
			billingstate.sendKeys(billState);
			saveBtn.click();
		}
	}
