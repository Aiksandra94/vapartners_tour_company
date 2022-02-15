package com.web365.vapartners.incoming.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.incoming.tours.VaAndPartnersIncomingColorsOfArmeniaTourConstants. *;
public class VaAndPartnersIncomingColorsOfArmeniaTour extends VaAndPartnersBasePage {

	public VaAndPartnersIncomingColorsOfArmeniaTour(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = INCOMING_TOUR_XPATH)
	public WebElement incomingTours;
	
	@FindBy(xpath = COLORS_OF_ARMENIA_MORE_BUTTON_XPATH)
	public WebElement more;
	
	@FindBy(xpath = COLOR_OF_ARMENIA_ORDR_FORM_XPATH)
	public WebElement orderForm;
	
	@FindBy(xpath = NAME)
	public WebElement name;
	
	@FindBy(xpath = PHONE)
	public WebElement phone;
	
	@FindBy(xpath = EMAIL)
	public WebElement email;
	
	@FindBy(xpath = MESSAGE)
	public WebElement message;
	
	@FindBy(xpath = TO_ORDER)
	public WebElement order;
	
	public VaAndPartnersIncomingRecognazeArmeniaTour goToMore() {
		incomingTours.click();
		return new VaAndPartnersIncomingRecognazeArmeniaTour(this.driver);
	}
	
	

}
