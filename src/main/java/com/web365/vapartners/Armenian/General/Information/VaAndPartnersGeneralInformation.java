package com.web365.vapartners.Armenian.General.Information;

import static com.web365.vapartners.Armenian.General.Information.VaAndPartnersGeneralInformationConstants.*;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.home.VaAndPartnersHomePage;


public class VaAndPartnersGeneralInformation extends VaAndPartnersHomePage {

	

	public VaAndPartnersGeneralInformation(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}


@FindBy(xpath = GENERAL_INFORMATION_XPATH)
public WebElement genInform;
@FindBy(xpath = LANGUAGES_IMAGE_XPATH)
public WebElement langImg;
@FindBy(xpath = ARMENIA_LOCATION)
public WebElement armLocation;


    public VaAndPartnersGeneralInformation moveToArmenia3() {
	genInform.click();
	return new VaAndPartnersGeneralInformation(this.driver);
	
	
	}
}


