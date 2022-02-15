package com.web365.vapartners.Armenia.History.And.Culture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersCultureOfArmeniaConstants. *;
public class VaAndPartnersCultureOfArmenia extends VaAndPartnersBasePage {

	public VaAndPartnersCultureOfArmenia(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ARMENIA_BUTTON_XPATH)
	public WebElement armeniaButton;
	
	@FindBy(xpath = HISTORY_AND_CULTURE_BUTTON)
	public WebElement historyCulture;
	
	@FindBy(xpath = ANTIQUITY_IMAGE)
	public WebElement antiqImg; 
	
	@FindBy(xpath = CULTURE_OF_ARMENIA)
	public WebElement cultureArm;
	
	@FindBy(xpath = CULTURE_OF_ARMENIA_IMAGE)
	public WebElement cultureArmImg;
	
	public VaAndPartnersCultureOfArmenia goToCultureOfArmenia() {
	armeniaButton.click();
	return new VaAndPartnersCultureOfArmenia(this.driver);
	
	
}
}
