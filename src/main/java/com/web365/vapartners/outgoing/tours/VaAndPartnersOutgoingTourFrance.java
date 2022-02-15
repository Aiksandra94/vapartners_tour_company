package com.web365.vapartners.outgoing.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;

import static com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourFranceConstants. *;
public class VaAndPartnersOutgoingTourFrance extends VaAndPartnersBasePage {

	


	public VaAndPartnersOutgoingTourFrance(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FRANCE_OUTGOING_TOURS_XPATH)
    public WebElement outgoingToures;
	
	@FindBy(xpath = FRANCE_MORE_BUTTON)
	public WebElement moreButton;
	
	@FindBy(xpath = FRANCE_TOUR_FORM)
	public WebElement franceForm;
	
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
	
	
	public VaAndPartnersOutgoingTourFrance goToMore() {
	outgoingToures.click();
	return new VaAndPartnersOutgoingTourFrance(this.driver);
		
	}

	
}
