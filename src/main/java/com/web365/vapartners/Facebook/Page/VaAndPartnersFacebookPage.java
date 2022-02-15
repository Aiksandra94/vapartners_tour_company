package com.web365.vapartners.Facebook.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;

public class VaAndPartnersFacebookPage extends VaAndPartnersBasePage {

	public VaAndPartnersFacebookPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public static final String FACEBOOK_PAGE_XPATH = "//a[@href='https://www.facebook.com/vapartnerstravel/']";
	public static final String USERNAME_XPATH = "//input[@placeholder='Email or phone number']"; 
	public static final String PASSWORD_XPATH = "//input[@type='password']";
	public static final String LOG_IN_BUTTON_XPATH = "//button[@id='loginbutton']";

	 @FindBy(xpath = FACEBOOK_PAGE_XPATH)
	 public WebElement facebook;
	 
	 @FindBy(xpath = USERNAME_XPATH)
	 public WebElement username;
	 
	 @FindBy(xpath = PASSWORD_XPATH) 
	 public WebElement password;
	 
	 @FindBy(xpath = LOG_IN_BUTTON_XPATH)
	 public WebElement logIn;
	 
	 
	 public VaAndPartnersFacebookPage goToFacebook() {
		 facebook.click();
		 return new VaAndPartnersFacebookPage(this.driver);
		 
	 }
	 
	
	

}
