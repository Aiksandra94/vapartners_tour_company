package com.web365.vapartners.Armenian.Information;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;

public class VaAndPartnersGeneralInformation extends VaAndPartnersBasePage {

	public VaAndPartnersGeneralInformation(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public static final String ARMENIA = "//a[text() ='Armenia']";
	
	
	@FindBy(xpath = ARMENIA)
	public WebElement armenia;
	
	public VaAndPartnersGeneralInformation moveToArmenia() {
		moveToElement(armenia);
		return new VaAndPartnersGeneralInformation(this.driver);

}

	}

