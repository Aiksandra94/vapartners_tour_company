package com.web365.vapartners.incoming.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmenianFairyTaleConstants. *;

public class VaAndPartnersIncomingTourArmenianFairyTale extends VaAndPartnersBasePage {

	public VaAndPartnersIncomingTourArmenianFairyTale(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	
	@FindBy(xpath = INCOMING_TOURS)
	public WebElement incomingTours;
	
	@FindBy(xpath = MORE_BUTTON)
	public WebElement more;
	
	@FindBy(xpath = ARMENIAN_FAIRY_TALE)
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
        incomingTours.click();
		return new VaAndPartnersIncomingTourArmenianFairyTale(this.driver);
	}

}
