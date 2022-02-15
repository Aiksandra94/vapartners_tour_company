package com.web365.vapartners.Armenia.History.And.Culture;

import static com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersHistoryAndCultureAntiquityConstants.*;

import org.openqa.selenium.WebDriver;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.home.VaAndPartnersHomePage;
public class VaAndPartnersHistoryAndCultureAntiquity extends VaAndPartnersHomePage {


	

	public VaAndPartnersHistoryAndCultureAntiquity(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = ARMENIA_BUTTON_XPATH)
	public WebElement historyCulture;
	@FindBy(xpath = HISTORY_AND_CULTURE)
	public WebElement historyAndCulture;
	@FindBy(xpath = ANTIQUITY_IMAGE)
	public WebElement antiqImage;
	
	
	public VaAndPartnersHistoryAndCultureAntiquity moveToArmenia() {
		historyCulture.click();
		return new VaAndPartnersHistoryAndCultureAntiquity(this.driver);
	}
	

		
	

	

	
}

