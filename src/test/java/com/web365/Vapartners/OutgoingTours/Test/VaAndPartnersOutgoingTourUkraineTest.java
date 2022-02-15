package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourUkraine;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourUkraineTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		
		VaAndPartnersOutgoingTourUkraine outgoingTourUkraine = home.goToOutgoingTourUkrain();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourUkraine.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourUkraine.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourUkraine.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourUkraine.ukrainForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourUkraine.name.click();
		outgoingTourUkraine.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourUkraine.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourUkraine.phone.click();
		outgoingTourUkraine.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourUkraine.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourUkraine.email.click();
		outgoingTourUkraine.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourUkraine.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourUkraine.message.click();
		outgoingTourUkraine.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourUkraine.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourUkraine.toOrder.click();
		Thread.sleep(2000);

}
	}


