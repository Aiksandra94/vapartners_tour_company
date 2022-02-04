package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourSrilanka;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersSrilankaTourTest  extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTours() throws InterruptedException {
	    
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourSrilanka outgoingTourSrilanka = home.goToOutgoingTourSrilanka();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourSrilanka.outgoingTours.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourSrilanka.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourSrilanka.moreButton.click();
		Thread.sleep(3000); 
		Assert.assertTrue(outgoingTourSrilanka.name.isDisplayed());
		Thread.sleep(3000);
		outgoingTourSrilanka.name.click();
		outgoingTourSrilanka.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSrilanka.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSrilanka.phone.click();
		outgoingTourSrilanka.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSrilanka.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSrilanka.email.click();
		outgoingTourSrilanka.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSrilanka.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSrilanka.message.click();
		outgoingTourSrilanka.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSrilanka.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSrilanka.toOrder.click();
		Thread.sleep(2000);
		
}



}


