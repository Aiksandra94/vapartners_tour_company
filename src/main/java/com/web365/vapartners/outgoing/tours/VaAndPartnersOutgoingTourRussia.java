package com.web365.vapartners.outgoing.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourRussiaConstants. *;

public class VaAndPartnersOutgoingTourRussia extends VaAndPartnersBasePage {

	public VaAndPartnersOutgoingTourRussia(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = RUSSIA_OUTGOING_TOURS_XPATH)
    public WebElement outgoingToures;
	
	@FindBy(xpath = RUSSIA_MORE_BUTTON)
	public WebElement moreButton;
	
	@FindBy(xpath = RUSSIA_TOUR_FORM)
	public WebElement russiaForm;
	
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
	
	
	public VaAndPartnersOutgoingTourBali goToMore() {
	outgoingToures.click();
	return new VaAndPartnersOutgoingTourBali(this.driver);
		
	}
}
