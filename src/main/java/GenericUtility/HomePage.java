package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leads;
    @FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement org;
    @FindBy(xpath = "(//td[@class='small'])[1]")
	private WebElement preferences;
    @FindBy(xpath="//img[@alt='Create Lead...']")
    private WebElement createLeads;
    @FindBy(xpath = "(//a[text()='Sign Out'])[1]")
	private WebElement signoutOption;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getPreferences() {
		return preferences;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
	/**
	 * this is business lib to click on leads 
	 */
	public void clickonLeads() {
		leads.click();
	}
	/**
	 * this is business lib to click on create leads
	 * @return
	 */
	public WebElement getCreateLeads() {
		return createLeads;
	}

	/**
	 * this is business lib to click on org
	 * 
	 */
	public void clickonorg() {
		org.click();
	}
	/**
	 * this is business lib to logout
	 * @throws Exception
	 */
	public void logoutOperation(WebDriver driver) throws Exception {
		SeleniumUtility SUTIL = new SeleniumUtility();
		
		SUTIL.moveToAnElement(driver,preferences);
		Thread.sleep(3000);
		SUTIL.moveToAnElement(driver, signoutOption);
		Thread.sleep(3000);
		SUTIL.clickOnAnElement(driver,signoutOption );
	}

}
