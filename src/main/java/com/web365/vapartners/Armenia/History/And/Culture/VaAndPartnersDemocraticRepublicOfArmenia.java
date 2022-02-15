package com.web365.vapartners.Armenia.History.And.Culture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersDemocraticRepublicOfArmeniaConstants. *;
public class VaAndPartnersDemocraticRepublicOfArmenia extends VaAndPartnersBasePage {

	public VaAndPartnersDemocraticRepublicOfArmenia(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ARMENIA_BUTTON_XPATH)
	public WebElement armeniaButton;
	
	@FindBy(xpath = HISTORY_AND_CULTURE_BUTTON)
	public WebElement historyCulture;
	
	@FindBy(xpath = ANTIQUITY_IMAGE)
	public WebElement antiqImg;
	
	@FindBy(xpath = DEMOCRATIC_REPUBLIC_OF_ARMENIA)
	public WebElement dra;
	
	@FindBy(xpath = DEMOCRATIC_REPUBLIC_IMAGE)
	public WebElement republicImg;
	
	public VaAndPartnersDemocraticRepublicOfArmenia goToDemocraticRepublicOfArmenia() {
		armeniaButton.click();
		return new VaAndPartnersDemocraticRepublicOfArmenia(this.driver);
		
	
	}
	

}
