package OBJECTRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement fname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath = "//input[@name='designation']")
	private WebElement title;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='noofemployees']")
	private WebElement NoOfEmployees;
	
	@FindBy(xpath = "//textarea[@name='lane']")
	private WebElement Street;
	
	@FindBy(xpath = "//input[@name='pobox']")
	private WebElement poBox;
	
	@FindBy(xpath = "//input[@name='code']")
	private WebElement postalCode;
	
	@FindBy(xpath = "//input[@name='city']")
	private WebElement City;
	
	@FindBy(xpath = "//input[@name='country']")
	private WebElement Country;
	
	@FindBy(xpath = "//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath = "(//input[@title=\"Save [Alt+S]\"])[2]")
	private WebElement saveBtn;
    

	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getFname() {
		return fname;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getCompany() {
		return company;
	}


	public WebElement getTitle() {
		return title;
	}


	public WebElement getPhone() {
		return phone;
	}


	public WebElement getMobile() {
		return mobile;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getNoOfEmployees() {
		return NoOfEmployees;
	}


	public WebElement getStreet() {
		return Street;
	}


	public WebElement getPoBox() {
		return poBox;
	}


	public WebElement getPostalCode() {
		return postalCode;
	}


	public WebElement getCity() {
		return City;
	}


	public WebElement getCountry() {
		return Country;
	}


	public WebElement getState() {
		return state;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}
     /**
      * this is for BL TC-01
      * @param fnme
      * @param lnme
      * @param com
      */
	public void createLead(String fnme , String lnme , String com) {
		fname.sendKeys(fnme);
		lastName.sendKeys(lnme);
		company.sendKeys(com);
		saveBtn.click();
	}
	/**
	 * BL TC-02
	 * @param fnme
	 * @param lnme
	 * @param com
	 * @param ttl
	 * @param phn
	 * @param mob
	 * @param mailId
	 * @param nofemp
	 * @param srt
	 * @param Pbx
	 * @param Pscd
	 * @param cty
	 * @param cnty
	 * @param st
	 */
	public void createLead(String fnme , String lnme , String com , String ttl , String phn , String mob , String mailId , String nofemp , 
			String srt ,String Pbx ,String Pscd , String cty , String cnty , String st  ) {
		fname.sendKeys(fnme);
		lastName.sendKeys(lnme);
		company.sendKeys(com);
		title.sendKeys(ttl);
		phone.sendKeys(phn);
		mobile.sendKeys(mob);
		email.sendKeys(mailId);
		NoOfEmployees.sendKeys(nofemp);
		Street.sendKeys(srt);
		poBox.sendKeys(Pbx);
		postalCode.sendKeys(Pscd);
		City.sendKeys(cty);
		Country.sendKeys(cnty);
		state.sendKeys(st);
		saveBtn.click();
	}
	/**
	 * CREATE LEADS PAGE TC-03
	 * @param fnme
	 * @param lnme
	 * @param com
	 * @param ttl
	 * @param phn
	 * @param mob
	 * @param mailId
	 * @param nofemp
	 */
	public void createLead(String fnme , String lnme , String com , String ttl , String phn , String mob , String mailId , String nofemp) {
		fname.sendKeys(fnme);
		lastName.sendKeys(lnme);
		company.sendKeys(com);
		title.sendKeys(ttl);
		phone.sendKeys(phn);
		mobile.sendKeys(mob);
		email.sendKeys(mailId);
		NoOfEmployees.sendKeys(nofemp);
		saveBtn.click();
	}
	/**
	 * TC-04
	 * @param fnme
	 * @param lnme
	 * @param com
	 * @param ttl
	 * @param phn
	 * @param mob
	 * @param mailId
	 * @param Pbx
	 * @param Pscd
	 * @param cty
	 * @param cnty
	 * @param st
	 */
	public void createLead(String fnme , String lnme , String com , String ttl , String phn , String mob , String mailId ,
			String Pbx ,String Pscd , String cty , String cnty , String st  ) {
		fname.sendKeys(fnme);
		lastName.sendKeys(lnme);
		company.sendKeys(com);
		title.sendKeys(ttl);
		phone.sendKeys(phn);
		mobile.sendKeys(mob);
		email.sendKeys(mailId);
		poBox.sendKeys(Pbx);
		postalCode.sendKeys(Pscd);
		City.sendKeys(cty);
		Country.sendKeys(cnty);
		state.sendKeys(st);
		saveBtn.click();
	}
}
	
