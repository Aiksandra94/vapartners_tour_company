package com.web365.vapartners.incoming.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingCulturalTourConstants. *;
public class VaAndPartnersIncomingCulturalTour extends VaAndPartnersBasePage {

	public VaAndPartnersIncomingCulturalTour(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = INCOMING_TOUR_XPATH)
    public WebElement incomingTour;
	
	@FindBy(xpath = CULTURAL_MORE_BUTTON_XPATH)
	public WebElement more;
	
	@FindBy(xpath = CULTURAL_ORDR_FORM_XPATH)
	public WebElement orderForm;
	
	@FindBy(xpath = NAME)
	public WebElement name;
	
	@FindBy(xpath = PHONE)
	public WebElement phone;
	
	@FindBy(xpath = EMAIL)
	public WebElement email;
	
	@FindBy(xpath = MESSAGE)
	public WebElement message;
	
	@FindBy(xpath = TO_ORDER)
	public WebElement order;
	
	public VaAndPartnersIncomingCulturalTour goToMore() {
		incomingTour.click();
		return new VaAndPartnersIncomingCulturalTour(this.driver);
	}
	}
	
	
	

