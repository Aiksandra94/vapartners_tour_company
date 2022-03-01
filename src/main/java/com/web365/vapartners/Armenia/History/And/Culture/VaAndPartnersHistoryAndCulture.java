package com.web365.vapartners.Armenia.History.And.Culture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTours;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;
import static com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersHistoryAndCultureConstants. *;
public class VaAndPartnersHistoryAndCulture extends VaAndPartnersHomePage {

	public VaAndPartnersHistoryAndCulture(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = ARMENIA_BUTTON_XPATH)
	public WebElement armeniaBtn;
	
	@FindBy(xpath = HISTORY_AND_CULTURE_BUTTON)
	public WebElement historyAndCulture;
	
	@FindBy(xpath = ANTIQUITY_IMAGE)
	public WebElement antiqImage;
	
	@FindBy(xpath = MIDDLE_AGES_BUTTON)
	public WebElement middleAges;
	
	@FindBy(xpath = MIDDLE_AGES_TEXT)
	public WebElement middleAgesText;
	
	@FindBy(xpath = EARLY_MODERN_ERA)
	public WebElement earlyModernEra;
	
	@FindBy(xpath = EARLY_MODERN_ERA_IMG)
	public WebElement earlyEraImg;
	
	@FindBy(xpath = WORD_WAR_GENOCIDE)
	public WebElement wordWarGenocide;
	
	@FindBy(xpath = WAR_GENOCIDE_IMG)
	public WebElement warGenocideImg;
	
	@FindBy(xpath = DEMOCRATIC_REPUBLIC_OF_ARMENIA)
	public WebElement dra;
	
	@FindBy(xpath = DEMOCRATIC_REPUBLIC_IMAGE)
	public WebElement republicImg;
	
	@FindBy(xpath = SOVIET_ARMENIA)
	public WebElement sovietArm;
	
	@FindBy(xpath = SOVIET_ARMENIA_IMAGE)
	public WebElement sovetArmImg;

	@FindBy(xpath = CULTURE_OF_ARMENIA)
	public WebElement cultureArm;
	
	@FindBy(xpath = CULTURE_OF_ARMENIA_IMAGE)
	public WebElement cultureArmImg;
	
	public VaAndPartnersIncomingTours moveToArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

}
