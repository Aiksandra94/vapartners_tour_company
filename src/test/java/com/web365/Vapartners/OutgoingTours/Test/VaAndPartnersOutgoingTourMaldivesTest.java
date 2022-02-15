package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourMaldives;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourMaldivesTest extends VapartnersTourBaseTest {

	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourMaldives outgoingTourMaldives = home.goToOutgoingTourMaldives();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourMaldives.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourMaldives.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourMaldives.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourMaldives.maldivesForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourMaldives.name.click();
		outgoingTourMaldives.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourMaldives.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourMaldives.phone.click();
		outgoingTourMaldives.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourMaldives.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourMaldives.email.click();
		outgoingTourMaldives.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourMaldives.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourMaldives.message.click();
		outgoingTourMaldives.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourMaldives.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourMaldives.toOrder.click();
		Thread.sleep(2000);

}
}
