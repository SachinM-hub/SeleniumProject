package OBJECTRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgHomePage {
	/**
	 * this is pom class for orgHomePage
	 */
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement newOrgBtn;
	
	
	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

/**
 * this is to go to new org pag
 * @return
 */
	public WebElement getNewOrgBtn() {
		return newOrgBtn;
	}
	public void ClickOnNeworgBtn() {
		newOrgBtn.click();
	}

}
