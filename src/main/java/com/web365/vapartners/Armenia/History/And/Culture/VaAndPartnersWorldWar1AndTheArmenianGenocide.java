package com.web365.vapartners.Armenia.History.And.Culture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersWorldWar1AndTheArmenianGenocideConstants. *;
public class VaAndPartnersWorldWar1AndTheArmenianGenocide extends VaAndPartnersBasePage {

	public VaAndPartnersWorldWar1AndTheArmenianGenocide(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ARMENIA_BUTTON_XPATH)
	public WebElement armeniaButton;
	
	@FindBy(xpath = HISTORY_AND_CULTURE_BUTTON)
	public WebElement historyCulture;
	
	@FindBy(xpath = WORD_WAR_GENOCIDE)
	public WebElement wordWarGenocide;
	
	@FindBy(xpath = WAR_GENOCIDE_IMG)
	public WebElement warGenocideImg;
	
	public VaAndPartnersWorldWar1AndTheArmenianGenocide goToWorldWar1AndTheArmenianGenocide() {
		armeniaButton.click();
		return new VaAndPartnersWorldWar1AndTheArmenianGenocide(this.driver);
	}
	
}
