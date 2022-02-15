package com.web365.vapartners.Armenia.History.And.Culture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;

import static com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersSovietArmeniaConstants. *;
public class VaAndPartnersSovietArmenia extends VaAndPartnersBasePage {

	public VaAndPartnersSovietArmenia(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = ARMENIA_BUTTON_XPATH)
	public WebElement armeniaButton;
	
	@FindBy(xpath = HISTORY_AND_CULTURE_BUTTON)
	public WebElement historyCulture;
	
	@FindBy(xpath = ANTIQUITY_IMAGE)
	public WebElement antiqImg;
	
	@FindBy(xpath = SOVIET_ARMENIA)
	public WebElement sovietArm;
	
	@FindBy(xpath = SOVIET_ARMENIA_IMAGE)
	public WebElement sovetArmImg;
	
	public VaAndPartnersSovietArmenia goToSovietArmenia() {
		armeniaButton.click();
		return new VaAndPartnersSovietArmenia(this.driver);
	}
	

}
