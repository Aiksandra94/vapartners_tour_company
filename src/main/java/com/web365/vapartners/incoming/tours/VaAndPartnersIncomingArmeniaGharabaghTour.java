package com.web365.vapartners.incoming.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingArmeniaGharabaghTourConstants. *;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingArmeniaSortTourConstants.EMAIL;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingArmeniaSortTourConstants.MESSAGE;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingArmeniaSortTourConstants.NAME;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingArmeniaSortTourConstants.PHONE;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingArmeniaSortTourConstants.TO_ORDER;
public class VaAndPartnersIncomingArmeniaGharabaghTour extends VaAndPartnersBasePage {


	public VaAndPartnersIncomingArmeniaGharabaghTour(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
		
		@FindBy(xpath = INCOMING_TOUR_XPATH)
		public WebElement incomingTour;
		
		@FindBy(xpath = ARMENIA_GHARABAGH_MORE_XPATH)
		public WebElement more;
		
		@FindBy(xpath = ARMENIA_GHARABAGH_TOUR_ORDR_FORM_XPATH)
		public WebElement orderForm;
		
		@FindBy(xpath = NAME)
		public WebElement name;
		
		@FindBy(xpath = PHONE)
		public WebElement phone;
		
		@FindBy(xpath = EMAIL)
		public WebElement email;
		
		@FindBy(xpath = MESSAGE)
		public WebElement message;
		
		@FindBy (xpath= TO_ORDER)
		public WebElement order;
		
		public VaAndPartnersIncomingArmeniaShortTour goToMore() {
			incomingTour.click();
			return new VaAndPartnersIncomingArmeniaShortTour(this.driver);
		}
		
		
	}


