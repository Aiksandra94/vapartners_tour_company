package com.web365.vapartners.incoming.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmeniaGeorgiaConstants. *;
public class VaAndPartnersIncomingTourArmeniaGeorgia extends VaAndPartnersBasePage {

	public VaAndPartnersIncomingTourArmeniaGeorgia(WebDriver driver) {
		super(driver);
		this.driver = driver;
      
	}
	
	@FindBy(xpath = INCOMING_TOURS)
	public WebElement incomingTours;
	
	@FindBy(xpath = MORE_BUTTON)
	public WebElement more;
	
	@FindBy(xpath = ARMENIA_GEORGIA)
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
	
	public VaAndPartnersIncomingTourArmeniaGeorgia goToMore() {
        incomingTours.click();
		return new VaAndPartnersIncomingTourArmeniaGeorgia(this.driver);
	}
}
	
	
	
	
	
	
	
	
