package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTours;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingToursTest extends VapartnersTourBaseTest {

	
	
	
	@Test
	public void incomingArmeniaAndGeorgia() throws InterruptedException {
	
	VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
    home = home.logoClick();
	Assert.assertTrue(home.incomingTours.isDisplayed());
	
	VaAndPartnersIncomingTours incomingTourArmeniaGeorgia = home.goToIncomingTourArmeniaGeorgia();
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.incomingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.armGeorgiaMore.isDisplayed());
	Thread.sleep(3000);
	incomingTourArmeniaGeorgia.armGeorgiaMore.click();
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.name.isDisplayed());
	Thread.sleep(3000);
	incomingTourArmeniaGeorgia.name.click();
	incomingTourArmeniaGeorgia.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.phone.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmeniaGeorgia.phone.click();
	incomingTourArmeniaGeorgia.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.email.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmeniaGeorgia.email.click();
	incomingTourArmeniaGeorgia.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.message.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmeniaGeorgia.message.click();
	incomingTourArmeniaGeorgia.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.order.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmeniaGeorgia.order.click();
	Thread.sleep(2000);
	// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed)
   } 
	
	
	
	
	
	@Test
	public void incomingArmeniaFairyTale() throws InterruptedException {
	
	VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
    home = home.logoClick();
	Assert.assertTrue(home.incomingTours.isDisplayed());
	
	VaAndPartnersIncomingTours incomingTourArmenianFairyTale = home.goToIncomingTourArmenianFairyTale();
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmenianFairyTale.incomingTours.isDisplayed());	
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmenianFairyTale.armFairyTaleMore.isDisplayed());
	Thread.sleep(3000);
	incomingTourArmenianFairyTale.armFairyTaleMore.click();
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmenianFairyTale.infForm.isDisplayed());
	Thread.sleep(3000);
	incomingTourArmenianFairyTale.name.click();
	incomingTourArmenianFairyTale.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmenianFairyTale.phone.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmenianFairyTale.phone.click();
	incomingTourArmenianFairyTale.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmenianFairyTale.email.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmenianFairyTale.email.click();
	incomingTourArmenianFairyTale.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmenianFairyTale.message.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmenianFairyTale.message.click();
	incomingTourArmenianFairyTale.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmenianFairyTale.order.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmenianFairyTale.order.click();
	Thread.sleep(2000);
	// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
   }
	
	
	
	
	
	@Test
	public void incomingCulturalTour() throws InterruptedException {

		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home=home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		VaAndPartnersIncomingTours incomingCulturalTour = home.goToIncomingCulturalTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingCulturalTour.incomingTours.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingCulturalTour.culturalMore.isDisplayed());
		Thread.sleep(3000);
		incomingCulturalTour.culturalMore.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingCulturalTour.infForm.isDisplayed());
		Thread.sleep(3000);
		incomingCulturalTour.name.click();
		incomingCulturalTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
	    incomingCulturalTour.phone.click();
	    incomingCulturalTour.phone.sendKeys("4404633690");
	    Thread.sleep(2000);
	    incomingCulturalTour.email.click();
	    incomingCulturalTour.email.sendKeys("aliksandra.galstyan1@gmial.com");
	    Thread.sleep(2000);
	    incomingCulturalTour.message.click();
	    incomingCulturalTour.message.sendKeys("Hello");
	    Thread.sleep(2000);
	    incomingCulturalTour.order.click();
	    //Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);.
	    //Order button isnt't work.
    }
	
	
	
	
	
	@Test
	public void incomingArmShortTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		VaAndPartnersIncomingTours incomingArmeniaShortTour = home.goToIncomingArmeniaShortTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingArmeniaShortTour.incomingTours.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingArmeniaShortTour.armShortMore.isDisplayed());
		Thread.sleep(3000);
		incomingArmeniaShortTour.armShortMore.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingArmeniaShortTour.infForm.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingArmeniaShortTour.name.isDisplayed());
		Thread.sleep(3000);
		incomingArmeniaShortTour.name.click();
		incomingArmeniaShortTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingArmeniaShortTour.phone.isDisplayed());
		Thread.sleep(2000);
		incomingArmeniaShortTour.phone.click();
		incomingArmeniaShortTour.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingArmeniaShortTour.email.isDisplayed());
		Thread.sleep(2000);
		incomingArmeniaShortTour.email.click();
		incomingArmeniaShortTour.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingArmeniaShortTour.message.isDisplayed());
		Thread.sleep(2000);
		incomingArmeniaShortTour.message.click();
		incomingArmeniaShortTour.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingArmeniaShortTour.order.isDisplayed());
		Thread.sleep(2000);
		incomingArmeniaShortTour.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
    }
	

	
	
	
	@Test
	public void incomingDiscoverArmeniaTour() throws InterruptedException {

		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home=home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());

		
		VaAndPartnersIncomingTours incomingDiscoverArmeniaTour = home.goToincomingDiscoverArmeniaTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingDiscoverArmeniaTour.incomingTours.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingDiscoverArmeniaTour.discoverArmMore.isDisplayed());
		Thread.sleep(3000);
		incomingDiscoverArmeniaTour.discoverArmMore.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingDiscoverArmeniaTour.infForm.isDisplayed());
		Thread.sleep(3000);
		incomingDiscoverArmeniaTour.name.click();
		incomingDiscoverArmeniaTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		incomingDiscoverArmeniaTour.phone.click();
		incomingDiscoverArmeniaTour.phone.sendKeys("4404633690");
	    Thread.sleep(2000);
	    incomingDiscoverArmeniaTour.email.click();
	    incomingDiscoverArmeniaTour.email.sendKeys("aliksandra.galstyan1@gmial.com");
	    Thread.sleep(2000);
	    incomingDiscoverArmeniaTour.message.click();
	    incomingDiscoverArmeniaTour.message.sendKeys("Hello");
	    Thread.sleep(2000);
	    incomingDiscoverArmeniaTour.order.click();
	   // Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
    }  

	
	
	
	
	@Test
	public void incomingArmeniaGharabaghTour() throws InterruptedException {
	
	VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
    home = home.logoClick();
	Assert.assertTrue(home.incomingTours.isDisplayed());
	
	
	VaAndPartnersIncomingTours incomingArmeniaGharabaghTour = home.goToIncomingArmeniaGharabaghTour();
	Thread.sleep(3000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.incomingTours.isDisplayed());	
	Thread.sleep(3000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.armGharabaghMore.isDisplayed());
	Thread.sleep(3000);
	incomingArmeniaGharabaghTour.armGharabaghMore.click();
	Thread.sleep(3000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.infForm.isDisplayed());
	Thread.sleep(3000);
	incomingArmeniaGharabaghTour.name.click();
	incomingArmeniaGharabaghTour.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.phone.isDisplayed());
	Thread.sleep(2000);
	incomingArmeniaGharabaghTour.phone.click();
	incomingArmeniaGharabaghTour.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.email.isDisplayed());
	Thread.sleep(2000);
	incomingArmeniaGharabaghTour.email.click();
	incomingArmeniaGharabaghTour.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.message.isDisplayed());
	Thread.sleep(2000);
	incomingArmeniaGharabaghTour.message.click();
	incomingArmeniaGharabaghTour.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.order.isDisplayed());
	Thread.sleep(2000);
	incomingArmeniaGharabaghTour.order.click();
	Thread.sleep(2000);
	// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
   }
	
	

	
	
	@Test
	public void incomingRecognizeArmeniaTour() throws InterruptedException {

		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home=home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());

		
		VaAndPartnersIncomingTours incomingRecognazeArmeniaTour = home.goToIncomingRecognazeArmeniaTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingRecognazeArmeniaTour.incomingTours.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingRecognazeArmeniaTour.RecognizeArmMore.isDisplayed());
		Thread.sleep(3000);
		incomingRecognazeArmeniaTour.RecognizeArmMore.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingRecognazeArmeniaTour.infForm.isDisplayed());
		Thread.sleep(3000);
		incomingRecognazeArmeniaTour.name.click();
		incomingRecognazeArmeniaTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		incomingRecognazeArmeniaTour.phone.click();
		incomingRecognazeArmeniaTour.phone.sendKeys("4404633690");
	    Thread.sleep(2000);
	    incomingRecognazeArmeniaTour.email.click();
	    incomingRecognazeArmeniaTour.email.sendKeys("aliksandra.galstyan1@gmial.com");
	    Thread.sleep(2000);
	    incomingRecognazeArmeniaTour.message.click();
	    incomingRecognazeArmeniaTour.message.sendKeys("Hello");
	    Thread.sleep(2000);
	    incomingRecognazeArmeniaTour.order.click();
	   // Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);    
     }
	
	
	
	
	
	@Test
	public void incomingCultural5Tours() throws InterruptedException {

		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home=home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
	
		
		VaAndPartnersIncomingTours incomingCultural5Tour = home.goToIncomingCultural5Tour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingCultural5Tour.incomingTours.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingCultural5Tour.cultural5More.isDisplayed());
		Thread.sleep(3000);
		incomingCultural5Tour.cultural5More.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingCultural5Tour.infForm.isDisplayed());
		Thread.sleep(3000);
		incomingCultural5Tour.name.click();
		incomingCultural5Tour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		incomingCultural5Tour.phone.click();
		incomingCultural5Tour.phone.sendKeys("4404633690");
	    Thread.sleep(2000);
	    incomingCultural5Tour.email.click();
	    incomingCultural5Tour.email.sendKeys("aliksandra.galstyan1@gmial.com");
	    Thread.sleep(2000);
	    incomingCultural5Tour.message.click();
	    incomingCultural5Tour.message.sendKeys("Hello");
	    Thread.sleep(2000);
	    incomingCultural5Tour.order.click();
	   // Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
    }
	
	
	
	
	
	@Test
	public void incomingUniqueArmeniaTour() throws InterruptedException {

		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home=home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());

		
		VaAndPartnersIncomingTours incomingUniqueArmeniaWithSafariTours = home.goToIncomingUniqueArmeniaWithSafariTours();
		Thread.sleep(3000);
		Assert.assertTrue(incomingUniqueArmeniaWithSafariTours.incomingTours.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingUniqueArmeniaWithSafariTours.uniqueArmMore.isDisplayed());
		Thread.sleep(3000);
		incomingUniqueArmeniaWithSafariTours.uniqueArmMore.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingUniqueArmeniaWithSafariTours.infForm.isDisplayed());
		Thread.sleep(3000);
		incomingUniqueArmeniaWithSafariTours.name.click();
		incomingUniqueArmeniaWithSafariTours.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		incomingUniqueArmeniaWithSafariTours.phone.click();
		incomingUniqueArmeniaWithSafariTours.phone.sendKeys("4404633690");
	    Thread.sleep(2000);
	    incomingUniqueArmeniaWithSafariTours.email.click();
	    incomingUniqueArmeniaWithSafariTours.email.sendKeys("aliksandra.galstyan1@gmial.com");
	    Thread.sleep(2000);
	    incomingUniqueArmeniaWithSafariTours.message.click();
	    incomingUniqueArmeniaWithSafariTours.message.sendKeys("Hello");
	    Thread.sleep(2000);
	    incomingUniqueArmeniaWithSafariTours.order.click();
	   // Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
    }
	
	
	
	
	
	@Test
	public void incomingAntiqurarianTour() throws InterruptedException {
		
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		VaAndPartnersIncomingTours incomingAntiquarianTour = home.goToIncomingAntiquarianTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingAntiquarianTour.incomingTours.isDisplayed());	
		Thread.sleep(3000);
		Assert.assertTrue(incomingAntiquarianTour.antiquarianMore.isDisplayed());
		Thread.sleep(3000);
		incomingAntiquarianTour.antiquarianMore.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingAntiquarianTour.infForm.isDisplayed());
		Thread.sleep(3000);
		incomingAntiquarianTour.name.click();
		incomingAntiquarianTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingAntiquarianTour.phone.isDisplayed());
		Thread.sleep(2000);
		incomingAntiquarianTour.phone.click();
		incomingAntiquarianTour.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingAntiquarianTour.email.isDisplayed());
		Thread.sleep(2000);
		incomingAntiquarianTour.email.click();
		incomingAntiquarianTour.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingAntiquarianTour.message.isDisplayed());
		Thread.sleep(2000);
		incomingAntiquarianTour.message.click();
		incomingAntiquarianTour.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingAntiquarianTour.order.isDisplayed());
		Thread.sleep(2000);
		incomingAntiquarianTour.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
      }
	
	
	
	
	
	@Test
	public void incomingFamTripToArmenia() throws InterruptedException {
		
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		
		VaAndPartnersIncomingTours incomingFamTripToArmenia = home.goToIncomingFamTripToArmenia();
		Thread.sleep(3000);
		Assert.assertTrue(incomingFamTripToArmenia.incomingTours.isDisplayed());	
		Thread.sleep(3000);
		Assert.assertTrue(incomingFamTripToArmenia.famArmMore.isDisplayed());
		Thread.sleep(3000);
		incomingFamTripToArmenia.famArmMore.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingFamTripToArmenia.infForm.isDisplayed());
		Thread.sleep(3000);
		incomingFamTripToArmenia.name.click();
		incomingFamTripToArmenia.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingFamTripToArmenia.phone.isDisplayed());
		Thread.sleep(2000);
		incomingFamTripToArmenia.phone.click();
		incomingFamTripToArmenia.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingFamTripToArmenia.email.isDisplayed());
		Thread.sleep(2000);
		incomingFamTripToArmenia.email.click();
		incomingFamTripToArmenia.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingFamTripToArmenia.message.isDisplayed());
		Thread.sleep(2000);
		incomingFamTripToArmenia.message.click();
		incomingFamTripToArmenia.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingFamTripToArmenia.order.isDisplayed());
		Thread.sleep(2000);
		incomingFamTripToArmenia.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
    }
	
	
	
	
	
	@Test 
	public void incomingColorsOfArmeniaTour() throws InterruptedException {
		
	
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		VaAndPartnersIncomingTours incomingColorsOfArmeniaTour = home.goToIncomingColorsOfArmeniaTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.incomingTours.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.colorsArmMore.isDisplayed());
		Thread.sleep(3000);
		incomingColorsOfArmeniaTour.colorsArmMore.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.infForm.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.name.isDisplayed());
		Thread.sleep(3000);
		incomingColorsOfArmeniaTour.name.click();
		incomingColorsOfArmeniaTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.phone.isDisplayed());
		Thread.sleep(2000);
		incomingColorsOfArmeniaTour.phone.click();
		incomingColorsOfArmeniaTour.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.email.isDisplayed());
		Thread.sleep(2000);
		incomingColorsOfArmeniaTour.email.click();
		incomingColorsOfArmeniaTour.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.message.isDisplayed());
		Thread.sleep(2000);
		incomingColorsOfArmeniaTour.message.click();
		incomingColorsOfArmeniaTour.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.order.isDisplayed());
		Thread.sleep(2000);
		incomingColorsOfArmeniaTour.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
   }

	
	
	
	
	@Test
	public void incomingHoneyMoonInArmenia() throws InterruptedException {
		
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
	
		VaAndPartnersIncomingTours incomingHoneymoonInArmenia = home.goToIncomingHoneymoonInArmenia();
		Thread.sleep(3000);
		Assert.assertTrue(incomingHoneymoonInArmenia.incomingTours.isDisplayed());	
		Thread.sleep(3000);
		Assert.assertTrue(incomingHoneymoonInArmenia.honeymoonArmMore.isDisplayed());
		Thread.sleep(3000);
		incomingHoneymoonInArmenia.honeymoonArmMore.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingHoneymoonInArmenia.infForm.isDisplayed());
		Thread.sleep(3000);
		incomingHoneymoonInArmenia.name.click();
		incomingHoneymoonInArmenia.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingHoneymoonInArmenia.phone.isDisplayed());
		Thread.sleep(2000);
		incomingHoneymoonInArmenia.phone.click();
		incomingHoneymoonInArmenia.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingHoneymoonInArmenia.email.isDisplayed());
		Thread.sleep(2000);
		incomingHoneymoonInArmenia.email.click();
		incomingHoneymoonInArmenia.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingHoneymoonInArmenia.message.isDisplayed());
		Thread.sleep(2000);
		incomingHoneymoonInArmenia.message.click();
		incomingHoneymoonInArmenia.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingHoneymoonInArmenia.order.isDisplayed());
		Thread.sleep(2000);
		incomingHoneymoonInArmenia.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	}
	
	
	
	
	
	@Test
	public void incomingPetroglyphInArmeniaTour() throws InterruptedException {
		
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		VaAndPartnersIncomingTours incomingPetroglyphTourInArmenia = home.goToIncomingPetroglyphTourInArmenia(); 
		Thread.sleep(3000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.incomingTours.isDisplayed());	
		Thread.sleep(3000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.PetroglyphArmMore.isDisplayed());
		Thread.sleep(3000);
		incomingPetroglyphTourInArmenia.PetroglyphArmMore.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.infForm.isDisplayed());
		Thread.sleep(3000);
		incomingPetroglyphTourInArmenia.name.click();
		incomingPetroglyphTourInArmenia.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.phone.isDisplayed());
		Thread.sleep(2000);
		incomingPetroglyphTourInArmenia.phone.click();
		incomingPetroglyphTourInArmenia.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.email.isDisplayed());
		Thread.sleep(2000);
		incomingPetroglyphTourInArmenia.email.click();
		incomingPetroglyphTourInArmenia.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.message.isDisplayed());
		Thread.sleep(2000);
		incomingPetroglyphTourInArmenia.message.click();
		incomingPetroglyphTourInArmenia.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.order.isDisplayed());
		Thread.sleep(2000);
		incomingPetroglyphTourInArmenia.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	}
	
	
	
}
