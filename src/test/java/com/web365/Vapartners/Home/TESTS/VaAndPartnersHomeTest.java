package com.web365.Vapartners.Home.TESTS;

import org.testng.Assert;



import org.testng.annotations.Test;

import com.web.vapartners.page.menu.VaAndPartnersAboutUsPage;
import com.web.vapartners.page.menu.VaAndPartnersGalleryPage;
import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersHomeTest extends VapartnersTourBaseTest {

	
	
	@Test
	public void testVapartnersTours() throws InterruptedException {
	    //1. Opens http://www.vapartners.am/ base on Base Test's before Test Method
		//2. Navigate to vapartners.am
		//3. Click on Logo
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		
		
		VaAndPartnersGalleryPage galleryPage = home.goToGallery();
		Assert.assertTrue(galleryPage.galleryTitle.isDisplayed());
		Thread.sleep(3000);
		
		
		
		VaAndPartnersAboutUsPage about = home.goToAboutUs();
		Thread.sleep(3000);
		Assert.assertTrue(about.aboutTitle.isDisplayed());
		Thread.sleep(3000);
		
		
		
			}
	

}
