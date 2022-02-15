package com.web365.vapartners.incoming.tours;

import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingCulturalTourConstants.EMAIL;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingCulturalTourConstants.MESSAGE;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingCulturalTourConstants.NAME;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingCulturalTourConstants.PHONE;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingCulturalTourConstants.TO_ORDER;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingFamTripToArmeniaConstants.INCOMING_TOUR_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingPetroglyphTourInArmeniaConstants. *;
public class VaAndPartnersIncomingPetroglyphTourInArmenia extends VaAndPartnersBasePage {

	public VaAndPartnersIncomingPetroglyphTourInArmenia(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	

	@FindBy(xpath = INCOMING_TOUR_XPATH)
	public WebElement incomingTour;
	
	@FindBy(xpath = PETROGLYPH_TOUR_IN_ARMENIA_MORE_BUTTON_XPATH)
	public WebElement more;
	
	@FindBy(xpath = PETROGLYPH_TOUR_ORDER_FORM_XPATH)
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
