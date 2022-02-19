package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;




import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTours;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;


public class VaAndPartnersOutgoingToursTest  extends VapartnersTourBaseTest {

	@Test
	public void testVapartnersOutgoingTours() throws InterruptedException {
	
	
	VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
    home = home.logoClick();
	Assert.assertTrue(home.outgoingTours.isDisplayed());
	
	
	VaAndPartnersOutgoingTours outgoingTourUae = home.goToOutgoingTourUae();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourUae.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourUae.moreButton1.isDisplayed());
	Thread.sleep(3000);
	outgoingTourUae.moreButton1.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourUae.contForm.isDisplayed());
	Thread.sleep(3000);
	outgoingTourUae.name.click();
	outgoingTourUae.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourUae.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourUae.phone.click();
	outgoingTourUae.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourUae.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourUae.email.click();
	outgoingTourUae.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourUae.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourUae.message.click();
	outgoingTourUae.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourUae.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourUae.toOrder.click();
	Thread.sleep(2000);
	
	
	
	
	
	
	VaAndPartnersOutgoingTours outgoingTourJordan = home.goToOtgoingTourJordan();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourJordan.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourJordan.moreButton2.isDisplayed());
	Thread.sleep(3000);
	outgoingTourJordan.moreButton2.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourJordan.contForm.isDisplayed());
	Thread.sleep(3000);
	outgoingTourJordan.name.click();
	outgoingTourJordan.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourJordan.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourJordan.phone.click();
	outgoingTourJordan.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourJordan.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourJordan.email.click();
	outgoingTourJordan.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourJordan.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourJordan.message.click();
	outgoingTourJordan.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourJordan.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourJordan.toOrder.click();
	Thread.sleep(2000);
	
	
	
	
	
	VaAndPartnersOutgoingTours outgoingTourThailand = home.goToOtgoingTourThailand();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourThailand.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourThailand.moreButton3.isDisplayed());
	Thread.sleep(3000);
	outgoingTourThailand.moreButton3.click();
	Thread.sleep(3000); 
	Assert.assertTrue(outgoingTourThailand.contForm.isDisplayed());
	Thread.sleep(3000);
	outgoingTourThailand.name.click();
	outgoingTourThailand.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourThailand.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourThailand.phone.click();
	outgoingTourThailand.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourThailand.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourThailand.email.click();
	outgoingTourThailand.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourThailand.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourThailand.message.click();
	outgoingTourThailand.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourThailand.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourThailand.toOrder.click();
	Thread.sleep(2000);
	
	
	
	
	
	VaAndPartnersOutgoingTours outgoingTourSrilanka = home.goToOtgoingTourSrilanka();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourSrilanka.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourSrilanka.moreButton4.isDisplayed());
	Thread.sleep(3000);
	outgoingTourSrilanka.moreButton4.click();
	Thread.sleep(3000); 
	Assert.assertTrue(outgoingTourSrilanka.contForm.isDisplayed());
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
	
	
	
	
	
	VaAndPartnersOutgoingTours outgoingTourIsrael = home.goToOutgoingTourIsrael();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourIsrael.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourIsrael.moreButton5.isDisplayed());
	Thread.sleep(3000);
	outgoingTourIsrael.moreButton5.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourIsrael.contForm.isDisplayed());
	Thread.sleep(3000);
	outgoingTourIsrael.name.click();
	outgoingTourIsrael.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourIsrael.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourIsrael.phone.click();
	outgoingTourIsrael.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourIsrael.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourIsrael.email.click();
	outgoingTourIsrael.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourIsrael.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourIsrael.message.click();
	outgoingTourIsrael.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourIsrael.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourIsrael.toOrder.click();
	Thread.sleep(2000);
	

	VaAndPartnersOutgoingTours outgoingTourGeorgia = home.goToOutgoingTourGeorgia();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourGeorgia.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourGeorgia.moreButton6.isDisplayed());
	Thread.sleep(3000);
	outgoingTourGeorgia.moreButton6.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourGeorgia.contForm.isDisplayed());
	Thread.sleep(3000);
	outgoingTourGeorgia.name.click();
	outgoingTourGeorgia.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGeorgia.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGeorgia.phone.click();
	outgoingTourGeorgia.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGeorgia.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGeorgia.email.click();
	outgoingTourGeorgia.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGeorgia.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGeorgia.message.click();
	outgoingTourGeorgia.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGeorgia.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGeorgia.toOrder.click();
	Thread.sleep(2000);
	
	
	
	VaAndPartnersOutgoingTours outgoingTourBulgaria = home.goToOutgoingTourBulgaria();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourBulgaria.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourBulgaria.moreButton7.isDisplayed());
	Thread.sleep(3000);
	outgoingTourBulgaria.moreButton7.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourBulgaria.contForm.isDisplayed());
	Thread.sleep(3000);
	outgoingTourBulgaria.name.click();
	outgoingTourBulgaria.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourBulgaria.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourBulgaria.phone.click();
	outgoingTourBulgaria.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourBulgaria.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourBulgaria.email.click();
	outgoingTourBulgaria.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourBulgaria.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourBulgaria.message.click();
	outgoingTourBulgaria.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourBulgaria.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourBulgaria.toOrder.click();
	Thread.sleep(2000);
	
	
	
	
	
	VaAndPartnersOutgoingTours outgoingTourItaly = home.goToOutgoingTourItaly();	
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourItaly.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourItaly.moreButton8.isDisplayed());
	Thread.sleep(3000);
	outgoingTourItaly.moreButton8.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourItaly.contForm.isDisplayed());
	Thread.sleep(3000);
	outgoingTourItaly.name.click();
	outgoingTourItaly.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourItaly.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourItaly.phone.click();
	outgoingTourItaly.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourItaly.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourItaly.email.click();
	outgoingTourItaly.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourItaly.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourItaly.message.click();
	outgoingTourItaly.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourItaly.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourItaly.toOrder.click();
	Thread.sleep(2000);
	
	
	
	
	
	VaAndPartnersOutgoingTours outgoingTourGrecce = home.goToOutgoingTourGrecce();	
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourGrecce.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourGrecce.moreButton9.isDisplayed());
	Thread.sleep(3000);
	outgoingTourGrecce.moreButton9.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourGrecce.contForm.isDisplayed());
	Thread.sleep(3000);
	outgoingTourGrecce.name.click();
	outgoingTourGrecce.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGrecce.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGrecce.phone.click();
	outgoingTourGrecce.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGrecce.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGrecce.email.click();
	outgoingTourGrecce.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGrecce.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGrecce.message.click();
	outgoingTourGrecce.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGrecce.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGrecce.toOrder.click();
	Thread.sleep(2000);
	
	
	
	
	VaAndPartnersOutgoingTours outgoingTourCyprus = home.goToOutgoingTourCyprus();	
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourCyprus.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourCyprus.moreButton10.isDisplayed());
	Thread.sleep(3000);
	outgoingTourCyprus.moreButton10.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourCyprus.contForm.isDisplayed());
	Thread.sleep(3000);
	outgoingTourCyprus.name.click();
	outgoingTourCyprus.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourCyprus.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourCyprus.phone.click();
	outgoingTourCyprus.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourCyprus.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourCyprus.email.click();
	outgoingTourCyprus.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourCyprus.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourCyprus.message.click();
	outgoingTourCyprus.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourCyprus.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourCyprus.toOrder.click();
	Thread.sleep(2000);
	
	
	
	
	
	VaAndPartnersOutgoingTours outgoingTourFrance = home.goToOutgoingTourFrance();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourFrance.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourFrance.moreButton11.isDisplayed());
	Thread.sleep(3000);
	outgoingTourFrance.moreButton11.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourFrance.contForm.isDisplayed());
	Thread.sleep(3000);
	outgoingTourFrance.name.click();
	outgoingTourFrance.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourFrance.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourFrance.phone.click();
	outgoingTourFrance.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourFrance.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourFrance.email.click();
	outgoingTourFrance.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourFrance.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourFrance.message.click();
	outgoingTourFrance.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourFrance.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourFrance.toOrder.click();
	Thread.sleep(2000);
	
	
	VaAndPartnersOutgoingTours outgoingTourNorway = home.goToOutgoingTourNorway(); 
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourNorway.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourNorway.moreButton12.isDisplayed());
	Thread.sleep(3000);
	outgoingTourNorway.moreButton12.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourNorway.name.isDisplayed());
	Thread.sleep(3000);
	outgoingTourNorway.name.click();
	outgoingTourNorway.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourNorway.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourNorway.phone.click();
	outgoingTourNorway.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourNorway.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourNorway.email.click();
	outgoingTourNorway.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourNorway.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourNorway.message.click();
	outgoingTourNorway.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourNorway.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourNorway.toOrder.click();
	Thread.sleep(2000);
	
	
	
	
	VaAndPartnersOutgoingTours outgoingTourCzechRepublic = home.goToOutgoingTourCzechRepublic(); 
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourCzechRepublic.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourCzechRepublic.moreButton13.isDisplayed());
	Thread.sleep(3000);
	outgoingTourCzechRepublic.moreButton13.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourCzechRepublic.contForm.isDisplayed());
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
	
	
	
	VaAndPartnersOutgoingTours outgoingTourSpain = home.goToOutgoingTourSpain(); 
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourSpain.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourSpain.moreButton14.isDisplayed());
	Thread.sleep(3000);
	outgoingTourSpain.moreButton14.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourSpain.contForm.isDisplayed());
	Thread.sleep(3000);
	outgoingTourSpain.name.click();
	outgoingTourSpain.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourSpain.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourSpain.phone.click();
	outgoingTourSpain.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourSpain.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourSpain.email.click();
	outgoingTourSpain.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourSpain.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourSpain.message.click();
	outgoingTourSpain.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourSpain.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourSpain.toOrder.click();
	Thread.sleep(2000);
	
	
	
	VaAndPartnersOutgoingTours outgoingTourEgypt = home.goToOutgoingTourEgypt();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourEgypt.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourEgypt.moreButton15.isDisplayed());
	Thread.sleep(3000);
	outgoingTourEgypt.moreButton15.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourEgypt.contForm.isDisplayed());
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

	