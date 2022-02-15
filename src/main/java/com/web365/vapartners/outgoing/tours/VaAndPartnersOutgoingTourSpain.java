package com.web365.vapartners.outgoing.tours;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourSpainConstants. *;
public class VaAndPartnersOutgoingTourSpain extends VaAndPartnersBasePage {

	public VaAndPartnersOutgoingTourSpain(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = SPAIN_OUTGOING_TOURS_XPATH)
    public WebElement outgoingToures;
	
	@FindBy(xpath = SPAIN_MORE_BUTTON)
	public WebElement moreButton;
	
	@FindBy(xpath = SPAIN_TOUR_FORM)
	public WebElement spainForm;
	
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
	
	
	public VaAndPartnersOutgoingTourSpain goToMore() {
	outgoingToures.click();
	return new VaAndPartnersOutgoingTourSpain(this.driver);
		
	}

}
