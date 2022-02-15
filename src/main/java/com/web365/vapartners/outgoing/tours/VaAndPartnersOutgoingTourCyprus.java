package com.web365.vapartners.outgoing.tours;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourCyprusConstants. *;
import com.web365.vapartners.page.base.VaAndPartnersBasePage;

public class VaAndPartnersOutgoingTourCyprus extends VaAndPartnersBasePage  {

	public VaAndPartnersOutgoingTourCyprus(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	@FindBy(xpath = CYPRUS_OUTGOING_TOURS_XPATH)
    public WebElement outgoingToures;
	
	@FindBy(xpath = CYPRUS_MORE_BUTTON)
	public WebElement moreButton;
	
	@FindBy(xpath = CYPRUS_TOUR_FORM)
	public WebElement cyprusForm;
	
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
	
	
	public VaAndPartnersOutgoingTourCyprus goToMore() {
	outgoingToures.click();
	return new VaAndPartnersOutgoingTourCyprus(this.driver);
		
	}


}
