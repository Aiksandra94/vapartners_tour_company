package com.web365.vapartners.outgoing.tours;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingToursConstants. *;

public class VaAndPartnersOutgoingTours extends VaAndPartnersBasePage {

	public VaAndPartnersOutgoingTours(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = OUTGOING_TOURS_XPATH)
    public WebElement outgoingTours;
	
	
	
	@FindBy(xpath = UAE_MORE_BUTTON)
	public WebElement moreButton1;
	
	@FindBy(xpath = JORDAN_MORE_BUTTON)
	public WebElement moreButton2;
	
	@FindBy(xpath = THAILAND_MORE_BUTTON)
	public WebElement moreButton3;
	
	@FindBy(xpath = SRILANKA_MORE_BUTTON)
	public WebElement moreButton4;
	
	@FindBy(xpath = ISRAEL_MORE_BUTTON)
	public WebElement moreButton5;
	
	@FindBy(xpath = GEORGIA_MORE_BUTTON)
	public WebElement moreButton6;
	
	@FindBy(xpath = BULGARIA_MORE_BUTTON)
	public WebElement moreButton7;
	
	@FindBy(xpath = ITALY_MORE_BUTTON)
	public WebElement moreButton8;
	
	@FindBy(xpath = GRECCE_MORE_BUTTON)
	public WebElement moreButton9;
	
	@FindBy(xpath = CYPRUS_MORE_BUTTON)
	public WebElement moreButton10;
	
	@FindBy(xpath = FRANCE_MORE_BUTTON)
	public WebElement moreButton11;
	
	@FindBy(xpath = NORWAY_MORE_BUTTON)
	public WebElement moreButton12;
	
	@FindBy(xpath = CZECH_REPUBLIC_MORE_BUTTON)
	public WebElement moreButton13;
	
	@FindBy(xpath = SPAIN_MORE_BUTTON)
	public WebElement moreButton14;
	
	@FindBy(xpath = EGYPT_MORE_BUTTON)
	public WebElement moreButton15;
	
	@FindBy(xpath = SINGAPORE_MORE_BUTTON)
	public WebElement moreButton16;
	
	@FindBy(xpath = MALDIVES_MORE_BUTTON)
	public WebElement moreButton17;
	
	@FindBy(xpath = BALI_MORE_BUTTON)
	public WebElement moreButton18;
	
	@FindBy(xpath = RUSSIA_MORE_BUTTON)
	public WebElement moreButton19;
	
	@FindBy(xpath = UKRAINE_MORE_BUTTON)
	public WebElement moreButton20;
	
	
	
	@FindBy(xpath = TOUR_CONT_INF_FORM_XPATH)
	public WebElement contForm;
	
	@FindBy(xpath = INFORMATION_NAME_XPATH)
	public WebElement name;
	
	@FindBy(xpath = INFORMATION_PHONE_XPATH)
	public WebElement phone;
	
	@FindBy(xpath = INFORMATION_EMAIL_XPATH)
	public WebElement email;
	
	@FindBy(xpath = INFORMATION_MESSAGE_XPATH)
	public WebElement message;
	
	@FindBy(xpath = TO_ORDER_BUTTON_XPATH)
	public WebElement toOrder;
	
	
	public VaAndPartnersOutgoingTours goToMore() {
	outgoingTours.click();
	return new VaAndPartnersOutgoingTours(this.driver);
		
	}

	

}
