package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourRussia;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourRussiaTest extends VapartnersTourBaseTest {

	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourRussia outgoingTourRussia = home.goToOutgoingTourRussia();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourRussia.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourRussia.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourRussia.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourRussia.russiaForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourRussia.name.click();
		outgoingTourRussia.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourRussia.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourRussia.phone.click();
		outgoingTourRussia.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourRussia.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourRussia.email.click();
		outgoingTourRussia.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourRussia.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourRussia.message.click();
		outgoingTourRussia.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourRussia.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourRussia.toOrder.click();
		Thread.sleep(2000);

}
}
