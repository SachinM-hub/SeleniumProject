package OBJECTRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsHomePage {
  /**
   * this is a pom class for leads home page
   */
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createNewLeadButton;
	
	
	public LeadsHomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	
	}

	public WebElement getCreateNewLeadButton() {
		return createNewLeadButton;
	}

	public void clickOnNewLeadBtn() {
		createNewLeadButton.click();
	}
}
