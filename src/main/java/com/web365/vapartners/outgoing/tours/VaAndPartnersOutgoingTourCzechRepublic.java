package com.web365.vapartners.outgoing.tours;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourCzechRepublicConstants. *;
public class VaAndPartnersOutgoingTourCzechRepublic extends VaAndPartnersBasePage {

	public VaAndPartnersOutgoingTourCzechRepublic(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = CZECH_OUTGOING_TOURS_XPATH)
    public WebElement outgoingToures;
	
	@FindBy(xpath = CZECH_MORE_BUTTON)
	public WebElement moreButton;
	
	@FindBy(xpath = CZECH_TOUR_FORM)
	public WebElement czechForm;
	
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
	
	
	public VaAndPartnersOutgoingTourCzechRepublic goToMore() {
	outgoingToures.click();
	return new VaAndPartnersOutgoingTourCzechRepublic(this.driver);
		
	}

}
