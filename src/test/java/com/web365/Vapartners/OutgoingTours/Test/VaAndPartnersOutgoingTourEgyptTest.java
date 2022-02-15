package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourEgypt;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourEgyptTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourEgypt outgoingTourEgypt = home.goToOutgoingTourEgypt();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourEgypt.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourEgypt.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourEgypt.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourEgypt.spainForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourEgypt.name.click();
		outgoingTourEgypt.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourEgypt.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourEgypt.phone.click();
		outgoingTourEgypt.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourEgypt.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourEgypt.email.click();
		outgoingTourEgypt.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourEgypt.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourEgypt.message.click();
		outgoingTourEgypt.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourEgypt.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourEgypt.toOrder.click();
		Thread.sleep(2000);

}
}
