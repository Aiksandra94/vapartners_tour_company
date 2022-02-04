package com.web365.vapartners.page.home;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web.vapartners.page.menu.VaAndPartnersAboutUsPage;
import com.web.vapartners.page.menu.VaAndPartnersGalleryPage;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmeniaGeorgia;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmenianFairyTale;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourGeorgia;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourIsrael;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourJordan;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourSrilanka;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourThailand;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourUae;
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
	
	public VaAndPartnersOutgoingTourIsrael goToOutgoingTourIsrael() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTourIsrael(this.driver);
		
		
	}
	
	public VaAndPartnersOutgoingTourUae goToOutgoingTourUae() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTourUae(this.driver);
	}
	
	
	public VaAndPartnersOutgoingTourJordan goToOtgoingTourJordan() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTourJordan(this.driver);
		
	}
	
	public VaAndPartnersOutgoingTourThailand goToOtgoingTourThailand() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTourThailand(this.driver);
	}
	
	public VaAndPartnersOutgoingTourSrilanka goToOutgoingTourSrilanka() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTourSrilanka(this.driver);
	}
	
	public VaAndPartnersIncomingTourArmeniaGeorgia goToIncomingTourArmeniaGeorgia() {
		incomingTours.click();
		return new VaAndPartnersIncomingTourArmeniaGeorgia(this.driver);
	}
	
	public VaAndPartnersIncomingTourArmenianFairyTale goToIncomingTourArmenianFairyTale() {
		incomingTours.click();
		return new VaAndPartnersIncomingTourArmenianFairyTale(this.driver);
	}
	
	public VaAndPartnersOutgoingTourGeorgia goToOutgoingTourGeorgia() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTourGeorgia(this.driver);
	}
	
	


	

	

	
}
