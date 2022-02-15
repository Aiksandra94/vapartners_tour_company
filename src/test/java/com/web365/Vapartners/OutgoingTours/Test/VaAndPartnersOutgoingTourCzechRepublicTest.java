
package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourCzechRepublic;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourCzechRepublicTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourCzechRepublic outgoingTourCzechRepublic = home.goToOutgoingTourCzechRepublic(); 
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourCzechRepublic.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourCzechRepublic.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourCzechRepublic.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourCzechRepublic.czechForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourCzechRepublic.name.click();
		outgoingTourCzechRepublic.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourCzechRepublic.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourCzechRepublic.phone.click();
		outgoingTourCzechRepublic.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourCzechRepublic.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourCzechRepublic.email.click();
		outgoingTourCzechRepublic.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourCzechRepublic.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourCzechRepublic.message.click();
		outgoingTourCzechRepublic.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourCzechRepublic.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourCzechRepublic.toOrder.click();
		Thread.sleep(2000);
	}
	}


