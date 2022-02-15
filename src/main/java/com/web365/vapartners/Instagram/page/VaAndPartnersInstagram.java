package com.web365.vapartners.Instagram.page;

import com.web365.vapartners.page.home.VaAndPartnersHomePage;

import static com.web365.vapartners.Instagram.page.VaAndPartnersInstagramConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class VaAndPartnersInstagram extends VaAndPartnersHomePage {

	public VaAndPartnersInstagram(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = INSTAGRAM_PAGE_XPATH)
	public WebElement instagramPage;
	
	@FindBy(xpath = INSTAGRAM_SIGN_UP_XPATH)
	public WebElement instagramSighUp;
	
	@FindBy(xpath = INSTAGRAM_LOGO_XPATH)
	public WebElement instagramLogo;
	
	@FindBy(xpath = INSTAGRAM_SWICH_ACCOUNT)
	public WebElement instagramSwithAccount;
	
	@FindBy(xpath = INSTAGRAM_SIGNUP_LOGO)
	public WebElement signUpLogo;
	
	@FindBy(xpath = INSTAGRAM_SIGNUP_EMAIL_XPATH)
	public WebElement sighupEmail;
	
	@FindBy(xpath = INSTAGRAM_SIGN_UP_DISPLAY_XPATH)
	public WebElement signUpDisplay;
	
	@FindBy(xpath = MOBILE_NUMBER_OR_EMAIL_XPATH)
	public WebElement mobileNumberOrEmail;
	
	@FindBy(xpath = FULL_NAME_XPATH)
	public WebElement fullName;
	
	@FindBy(xpath = USERNAME_XPATH)
	public WebElement username;
	
	@FindBy(xpath = PASSWORD_XPATH)
	public WebElement password;
	
	
	
	public VaAndPartnersInstagram goToInstaagraPage() {
		instagramPage.click();
		return new VaAndPartnersInstagram(this.driver);
	}
	
	

}
