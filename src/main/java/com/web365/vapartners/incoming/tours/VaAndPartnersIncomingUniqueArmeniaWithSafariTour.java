package com.web365.vapartners.incoming.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;

import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmenianFairyTaleConstants.EMAIL;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmenianFairyTaleConstants.MESSAGE;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmenianFairyTaleConstants.NAME;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmenianFairyTaleConstants.PHONE;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmenianFairyTaleConstants.TO_ORDER;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingUniqueArmeniaWithSafariTourConstants. *;
public class VaAndPartnersIncomingUniqueArmeniaWithSafariTour extends VaAndPartnersBasePage{

	public VaAndPartnersIncomingUniqueArmeniaWithSafariTour(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = INCOMING_TOUR_XPATH)
	public WebElement incomingTour;
	
	@FindBy(xpath = UNIQUE_ARMENIA_WITH_SAFARI_MORE_BUTTON_XPATH)
	public WebElement more;
	
	@FindBy(xpath = ARMENIA_WITH_SAFARI_ORDR_FORM_XPATH)
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
        incomingTour.click();
		return new VaAndPartnersIncomingTourArmenianFairyTale(this.driver);
	}

}
