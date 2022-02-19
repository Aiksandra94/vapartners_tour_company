package com.web365.vapartners.page.home;

import org.openqa.selenium.WebDriver;








import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web.vapartners.page.menu.VaAndPartnersAboutUsPage;
import com.web.vapartners.page.menu.VaAndPartnersGalleryPage;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersCultureOfArmenia;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersDemocraticRepublicOfArmenia;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersEarlyModernEra;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersHistoryAndCultureAntiquity;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersHistoryAndCultureMiddleAges;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersSovietArmenia;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersWorldWar1AndTheArmenianGenocide;
import com.web365.vapartners.Facebook.Page.VaAndPartnersFacebookPage;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingAntiquarianTour;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingArmeniaGharabaghTour;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingArmeniaShortTour;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingColorsOfArmeniaTour;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingCulturalTour;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingDiscoverArmeniaTour;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingFamTripToArmenia;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingHoneymoonInArmeniaTour;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingPetroglyphTourInArmenia;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingRecognazeArmeniaTour;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmeniaGeorgia;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmenianFairyTale;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingUniqueArmeniaWithSafariTour;
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

	public VaAndPartnersHistoryAndCultureAntiquity moveToArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersHistoryAndCultureAntiquity(this.driver);
	}
	
	public VaAndPartnersHistoryAndCultureAntiquity moveToArmenia1() {
		armeniaBtn.click();
		return new VaAndPartnersHistoryAndCultureAntiquity(this.driver);
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
	
	
	
	
	
	public VaAndPartnersIncomingTourArmeniaGeorgia goToIncomingTourArmeniaGeorgia() {
		incomingTours.click();
		return new VaAndPartnersIncomingTourArmeniaGeorgia(this.driver);
	}
	
	public VaAndPartnersIncomingTourArmenianFairyTale goToIncomingTourArmenianFairyTale() {
		incomingTours.click();
		return new VaAndPartnersIncomingTourArmenianFairyTale(this.driver);
	}
	
	public VaAndPartnersIncomingCulturalTour goToIncomingCulturalTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingCulturalTour(this.driver);
	}

	public VaAndPartnersIncomingArmeniaShortTour goToIncomingArmeniaShortTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingArmeniaShortTour(this.driver);
	}

	public VaAndPartnersIncomingDiscoverArmeniaTour goToincomingDiscoverArmeniaTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingDiscoverArmeniaTour(this.driver);
	}

	public VaAndPartnersIncomingArmeniaGharabaghTour goToIncomingArmeniaGharabaghTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingArmeniaGharabaghTour(this.driver);
	}

	public VaAndPartnersIncomingRecognazeArmeniaTour goToIncomingRecognazeArmeniaTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingRecognazeArmeniaTour(this.driver);
	}

	public VaAndPartnersIncomingUniqueArmeniaWithSafariTour goToIncomingUniqueArmeniaWithSafariTours() {
		incomingTours.click();
		return new VaAndPartnersIncomingUniqueArmeniaWithSafariTour(this.driver);
	}

	public VaAndPartnersIncomingAntiquarianTour goToIncomingAntiquarianTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingAntiquarianTour(this.driver);
	}

	public VaAndPartnersIncomingFamTripToArmenia goToIncomingFamTripToArmenia() {
		incomingTours.click();
		return new VaAndPartnersIncomingFamTripToArmenia(this.driver);
	}

	public VaAndPartnersIncomingColorsOfArmeniaTour goToIncomingColorsOfArmeniaTour() {
		incomingTours.click();
		return new VaAndPartnersIncomingColorsOfArmeniaTour(this.driver);
	}

	public VaAndPartnersIncomingHoneymoonInArmeniaTour goToIncomingHoneymoonInArmenia() {
		incomingTours.click();
		return new VaAndPartnersIncomingHoneymoonInArmeniaTour(this.driver);
	}

	public VaAndPartnersIncomingPetroglyphTourInArmenia goToIncomingPetroglyphTourInArmenia() {
		incomingTours.click();
		return new VaAndPartnersIncomingPetroglyphTourInArmenia(this.driver);
	}

	
	
	
	

	public VaAndPartnersHistoryAndCultureMiddleAges goToHistoryAndCulture() {
		armeniaBtn.click();
		return new VaAndPartnersHistoryAndCultureMiddleAges(this.driver);
	}

	public VaAndPartnersHistoryAndCultureAntiquity goToHistoryAndCulture1() {
		armeniaBtn.click();
		return new VaAndPartnersHistoryAndCultureAntiquity(this.driver);
	}

	public VaAndPartnersEarlyModernEra goToEarlyModernEra() {
		armeniaBtn.click();
		return new VaAndPartnersEarlyModernEra(this.driver);
	}

	public VaAndPartnersWorldWar1AndTheArmenianGenocide goToWordWar1AndTheArmenianGenocide() {
		armeniaBtn.click();
		return new VaAndPartnersWorldWar1AndTheArmenianGenocide(this.driver);
	}

	public VaAndPartnersDemocraticRepublicOfArmenia goToDemocraticRepublicOfArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersDemocraticRepublicOfArmenia(this.driver);
	}

	public VaAndPartnersSovietArmenia goToSovietArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersSovietArmenia(this.driver);
	}

	public VaAndPartnersCultureOfArmenia goToCultureArmenia() {
		armeniaBtn.click();
		return new VaAndPartnersCultureOfArmenia(this.driver);
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
	
	

	






	


}

	
	

	


	
	


	

	

	

