package com.web365.vapartners.page.home;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web.vapartners.page.menu.VaAndPartnersAboutUsPage;
import com.web.vapartners.page.menu.VaAndPartnersGalleryPage;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersHistoryAndCulture;
import com.web365.vapartners.Facebook.Page.VaAndPartnersFacebookPage;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTours;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTours;
import com.web365.vapartners.page.base.VaAndPartnersBasePage;

import static com.web365.vapartners.page.home.VaAndPartnersHomePageConstants.*;




public class VaAndPartnersHomePage extends VaAndPartnersBasePage  {

	
public VaAndPartnersHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}	
			
	@FindBy(xpath=LOGO_XPATH)
	public WebElement logo;
	
	@FindBy(xpath=OUTGOING_TOURS)
	public WebElement outgoingTours; 
	
	@FindBy(xpath=INGCOMING_TOURS)	
	public WebElement incomingTours;
	
	@FindBy(xpath=GALLERY)
	public WebElement gallery;
	
	@FindBy(xpath=ABOUT_US)
	public WebElement aboutUs;

	@FindBy(xpath=ARMENIA_BATTON_XPATH)
	public WebElement armeniaBtn;
	
	@FindBy(xpath = FACEBOOK_XPATH)
	public WebElement facebook;
	
	@FindBy(xpath = FACEBOOK_LOG_IN_XPATH)
	public WebElement facebookLogIn;
	
	@FindBy(xpath = FACEBOOK_LOG_IN_PAGE_XPATH)
	public WebElement facebookLogInPage;
	 
	 @FindBy(xpath = USERNAME_XPATH)
	 public WebElement username;
	 
	 @FindBy(xpath = PASSWORD_XPATH) 
	 public WebElement password;
	 
	 @FindBy(xpath = LOG_IN_BUTTON_XPATH)
	 public WebElement logIn;
	 
	 @FindBy(xpath = FACEBOOK_WEB_PAGE_XPATH)
	 public WebElement facebookWebPage;


	 
	public VaAndPartnersFacebookPage goToFacebook() {
		facebook.click();
		return new VaAndPartnersFacebookPage(this.driver);
	}

	public VaAndPartnersIncomingTours moveToArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}
	
	public VaAndPartnersIncomingTours moveToArmenia1() {
		armeniaBtn.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}
	
	public VaAndPartnersHomePage logoClick() {
		logo.click();
		return new VaAndPartnersHomePage(this.driver);
	}
		

	public VaAndPartnersGalleryPage goToGallery() {
		gallery.click();
		return new 	VaAndPartnersGalleryPage (this.driver);
	}

	public VaAndPartnersAboutUsPage goToAboutUs() {
		aboutUs.click();
		return new VaAndPartnersAboutUsPage(this.driver);
	}
	
	
	
	
	
	public VaAndPartnersIncomingTours goToHistoryAndCulture() {
		armeniaBtn.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	

	public VaAndPartnersIncomingTours goToEarlyModernEra() {
		armeniaBtn.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToWordWar1AndTheArmenianGenocide() {
		armeniaBtn.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToDemocraticRepublicOfArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToSovietArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToCultureArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourGeorgia() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourIsrael() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourUae() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOtgoingTourJordan() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOtgoingTourThailand() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOtgoingTourSrilanka() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourBulgaria() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourItaly() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourGrecce() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourCyprus() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourFrance() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourNorway() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourCzechRepublic() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver) ;
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourSpain() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourEgypt() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourSingapore() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourMaldives() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourBali() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourRussia() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	public VaAndPartnersOutgoingTours goToOutgoingTourUkrain() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTours(this.driver);
	}

	
	
	
	
	public VaAndPartnersIncomingTours goToIncomingTourArmeniaGeorgia() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingTourArmenianFairyTale() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingCulturalTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingArmeniaShortTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToincomingDiscoverArmeniaTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingArmeniaGharabaghTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingRecognazeArmeniaTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingCultural5Tour() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingUniqueArmeniaWithSafariTours() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingAntiquarianTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingFamTripToArmenia() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingColorsOfArmeniaTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingHoneymoonInArmenia() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}

	public VaAndPartnersIncomingTours goToIncomingPetroglyphTourInArmenia() {
		incomingTours.click();
		return new VaAndPartnersIncomingTours(this.driver);
	}
	
	public VaAndPartnersHistoryAndCulture goToHistoryAndCultureAntiquity() {
		armeniaBtn.click();
		return new VaAndPartnersHistoryAndCulture(this.driver);
	}

	public VaAndPartnersHistoryAndCulture goToHistoryAndCultureMiddleAges() {
		armeniaBtn.click();
		return new VaAndPartnersHistoryAndCulture(this.driver);
	}
	
	public VaAndPartnersHistoryAndCulture goToHistoryAndCultureEarlyModernEra() {
		armeniaBtn.click();
		return new VaAndPartnersHistoryAndCulture(this.driver);
	}

	public VaAndPartnersHistoryAndCulture goToHistoryAndCultureWordWar1AndTheArmenianGenocide() {
		armeniaBtn.click();
		return new VaAndPartnersHistoryAndCulture(this.driver);
	}

	public VaAndPartnersHistoryAndCulture goToHistoryAndCultureDemocraticRepublicOfArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersHistoryAndCulture(this.driver);
	}

	public VaAndPartnersHistoryAndCulture goToHistoryAndCultureSovietArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersHistoryAndCulture(this.driver);
	}

	public VaAndPartnersHistoryAndCulture goToHistoryAndCultureOfArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersHistoryAndCulture(this.driver);
	}
	
	
	
	
	

	






	


}

	
	

	


	
	


	

	

	

