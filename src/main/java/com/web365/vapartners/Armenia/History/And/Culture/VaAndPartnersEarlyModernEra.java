package com.web365.vapartners.Armenia.History.And.Culture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersEarlyModernEraConstants. *; 
public class VaAndPartnersEarlyModernEra extends VaAndPartnersBasePage {

	public VaAndPartnersEarlyModernEra(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = ARMENIA_BUTTON_XPATH)
	public WebElement armeniaButton;
	
	@FindBy(xpath = HISTORY_AND_CULTURE)
	public WebElement historyCulture;
	
	@FindBy(xpath = EARLY_MODERN_ERA)
	public WebElement earlyModernEra;
	
	@FindBy(xpath = EARLY_MODERN_ERA_IMG)
	public WebElement earlyEraImg;
	
	public VaAndPartnersEarlyModernEra moveToArmenia() {
		historyCulture.click();
		return new VaAndPartnersEarlyModernEra(this.driver);
	}

}
