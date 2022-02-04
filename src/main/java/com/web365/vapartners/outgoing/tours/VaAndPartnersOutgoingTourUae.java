package com.web365.vapartners.outgoing.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;

public class VaAndPartnersOutgoingTourUae extends VaAndPartnersBasePage {

	public VaAndPartnersOutgoingTourUae(WebDriver driver) {
		super(driver);
	    this.driver = driver;
	}
	
	public static final String OUTGOING_TOURS_XPATH = "//a[@href='/Packages/Tours?id=87']";
	public static final String MORE_BUTTON = "//a[@href='/Packages/Tour?id=454']";
	public static final String UAE_TOUR = "//div[@class='tour_cont_form']";
	public static final String NAME = "//input[@placeholder='Name *']";
	public static final String PHONE = "//input[@placeholder='Phone *']";
	public static final String EMAIL = "//input[@placeholder='Email *']";
	public static final String MESSAGE = "//textarea[@placeholder='Message']";
	public static final String TO_ORDER = "//button[@class='btn btn-default']";
	
	@FindBy(xpath = OUTGOING_TOURS_XPATH)
    public WebElement outgoingToures;
	
	@FindBy(xpath = MORE_BUTTON)
	public WebElement moreButton;
	
	@FindBy(xpath = UAE_TOUR)
	public WebElement uaeTour;
	
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
	
	
	public VaAndPartnersOutgoingTourUae goToMore() {
	outgoingToures.click();
	return new VaAndPartnersOutgoingTourUae(this.driver);
		
	}

}
