package com.web.vapartners.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;

public class VaAndPartnersAboutUsPage extends VaAndPartnersBasePage {
	


	public VaAndPartnersAboutUsPage (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
		public static final String ABOUT_TITLE_XPATH = "//div[@class='about_background']";
		
		@FindBy(xpath = ABOUT_TITLE_XPATH)
		public WebElement aboutTitle;


}
	

