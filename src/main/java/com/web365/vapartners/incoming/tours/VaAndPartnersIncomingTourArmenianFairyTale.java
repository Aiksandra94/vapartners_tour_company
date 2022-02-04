package com.web365.vapartners.incoming.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;

public class VaAndPartnersIncomingTourArmenianFairyTale extends VaAndPartnersBasePage {

	public VaAndPartnersIncomingTourArmenianFairyTale(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	 
	public static final String INCOMING_TOURS = "//a[@href='/Packages/Tours?id=90\']";
	public static final String MORE_BUTTON = "//a[@href='/Packages/Tour?id=481\']";
	public static final String ARMENIAN_FAIRY_TALE = "//div[@class='tour_cont_form']";
	public static final String NAME = "//input[@placeholder='Name *']";
	public static final String PHONE = "//input[@placeholder='Phone *']";
	public static final String EMAIL = "//input[@placeholder='Email *']";
	public static final String MESSAGE = "//textarea[@class='form-control']";
	public static final String TO_ORDER = "//button[@class='btn btn-default']";
	
	@FindBy(xpath = INCOMING_TOURS)
	public WebElement incomingTours;
	
	@FindBy(xpath = MORE_BUTTON)
	public WebElement more;
	
	@FindBy(xpath = ARMENIAN_FAIRY_TALE)
	public WebElement armeniaGeorgia;
	
	@FindBy(xpath = NAME)
	public WebElement name;
	
	@FindBy(xpath = PHONE)
	public WebElement phone;
	
	@FindBy(xpath = EMAIL)
	public WebElement email;
	
	@FindBy(xpath = MESSAGE)
	public WebElement message;
	
	@FindBy(xpath = TO_ORDER)
	public WebElement toOrder;
	
	public VaAndPartnersIncomingTourArmenianFairyTale goToMore() {
        incomingTours.click();
		return new VaAndPartnersIncomingTourArmenianFairyTale(this.driver);
	}

}
