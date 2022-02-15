package com.web365.vapartners.Armenia.History.And.Culture;

import static com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersHistoryAndCultureMiddleAgesConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;

public class VaAndPartnersHistoryAndCultureMiddleAges extends VaAndPartnersBasePage {

	public VaAndPartnersHistoryAndCultureMiddleAges(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ARMENIA_BUTTON_XPATH)
	public WebElement armeniaButton;
	
	@FindBy(xpath = HISTORY_AND_CULTURE)
	public WebElement historyAndCulture;
	
	@FindBy(xpath = ANTIQUITY_IMAGE)
	public WebElement antiquityImage;
	
	@FindBy(xpath = MIDDLE_AGES_BUTTON)
	public WebElement middleAges;
	
	@FindBy(xpath = MIDDLE_AGES_TEXT)
	public WebElement middleAgesText;

	
	public VaAndPartnersHistoryAndCultureMiddleAges goToHistoryAndCultur() {
		armeniaButton.click();
		return new VaAndPartnersHistoryAndCultureMiddleAges(this.driver);
	}
	
	
}
