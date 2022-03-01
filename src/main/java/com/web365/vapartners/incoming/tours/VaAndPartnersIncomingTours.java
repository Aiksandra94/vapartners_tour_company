package com.web365.vapartners.incoming.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingToursConstants. *;

public class VaAndPartnersIncomingTours extends VaAndPartnersBasePage {

	public VaAndPartnersIncomingTours(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	
	@FindBy(xpath = INCOMING_TOUR_XPATH)
    public WebElement incomingTours;
	
	@FindBy(xpath = ARMENIAN_AND_GEORGIA_COMBINDED_TOUR_MORE_BUTTON_XPATH)
	public WebElement armGeorgiaMore;
	
	@FindBy(xpath = ARMENIAN_FAIRY_TALE_MORE_BUTTON_XPATH)
	public WebElement armFairyTaleMore;
	
	@FindBy(xpath = CULTURAL_TOUR_MORE_BUTTON_XPATH)
	public WebElement culturalMore;
	
	@FindBy(xpath = ARMENIA_SHORT_TOUR_MORE_XPATH)
	public WebElement armShortMore;
	
	@FindBy(xpath = DISCOVER_ARMENIA_TOUR_MORE_BUTTON_XPATH)
	public WebElement discoverArmMore;
	
	@FindBy(xpath = ARMENIA_GHARABAGH_TOUR_MORE_XPATH)
	public WebElement armGharabaghMore;
	
	@FindBy(xpath = RECOGNIZE_ARMENIA_MORE_BUTTON_XPATH)
	public WebElement RecognizeArmMore;
	
	@FindBy(xpath = CULTURAL_TOUR_5DAYS_MORE_BUTTON_XPATH)
	public WebElement cultural5More;
	
	@FindBy(xpath = UNIQUE_ARMENIA_WITH_SAFARI_TOUR_MORE_BUTTON_XPATH)
	public WebElement uniqueArmMore;
	
	@FindBy(xpath = ANTIQUARIAN_TOUR_MORE_BUTTON_XPATH)
	public WebElement antiquarianMore;
	
	@FindBy(xpath = FAM_TRIP_TO_ARMENIA_MORE_BUTTON_XPATH)
	public WebElement famArmMore;
	
	@FindBy(xpath = COLORS_OF_ARMENIA_MORE_BUTTON_XPATH)
	public WebElement colorsArmMore;
	
	@FindBy(xpath = HONEYMOON_IN_ARMENIA_MORE_BUTTON_XPATH )
	public WebElement honeymoonArmMore;
	
	@FindBy(xpath = PETROGLYPH_TOUR_IN_ARMENIA_MORE_BUTTON_XPATH)
	public WebElement PetroglyphArmMore;
	
	
	
	@FindBy(xpath = TOUR_CONT_INF_FORM_XPATH)
	public WebElement infForm;
	
	@FindBy(xpath = INFORMATION_NAME_XPATH)
	public WebElement name;
	
	@FindBy(xpath = INFORMATION_PHONE_XPATH)
	public WebElement phone;
	
	@FindBy(xpath = INFORMATION_EMAIL_XPATH)
	public WebElement email;
	
	@FindBy(xpath = INFORMATION_MESSAGE_XPATH)
	public WebElement message;
	
	@FindBy(xpath = TO_ORDER_BUTTON_XPATH)
	public WebElement order;
	
	public VaAndPartnersIncomingTours goToMore() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}
}
