package com.web365.Vapartners.ArmenianInformation.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersHistoryAndCulture;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersHistoryAndCultureTest extends VapartnersTourBaseTest {
	
	

	@Test
	public void historyAndCultureAntiquity() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());	
		
		VaAndPartnersHistoryAndCulture historyAndCulture = home.goToHistoryAndCultureAntiquity();
	    Thread.sleep(3000);
	    historyAndCulture.armeniaBtn.click();
		Assert.assertTrue(historyAndCulture.historyAndCulture.isDisplayed());
		Thread.sleep(3000);
		historyAndCulture.historyAndCulture.click();
		Thread.sleep(3000);
		Assert.assertTrue(historyAndCulture.antiqImage.isDisplayed());
		Thread.sleep(3000);
	}
	
	
	@Test 
	public void historyAndCultureMiddleAges() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());	
		
		VaAndPartnersHistoryAndCulture historyAndCulture = home.goToHistoryAndCultureMiddleAges();
		Thread.sleep(3000);
		Assert.assertTrue(historyAndCulture.armeniaBtn.isDisplayed());
		historyAndCulture.armeniaBtn.click();
		Thread.sleep(5000);
		Assert.assertTrue(historyAndCulture.historyAndCulture.isDisplayed());
		historyAndCulture.historyAndCulture.click();
		Thread.sleep(3000);
		historyAndCulture.middleAges.click();
		Thread.sleep(3000);
		Assert.assertTrue(historyAndCulture.middleAgesText.isDisplayed());
		Thread.sleep(3000);
	}
	
	@Test 
	public void historyAndCultureEarlyModernEra() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		VaAndPartnersHistoryAndCulture earlyModernEra = home.goToHistoryAndCultureMiddleAges();
		Thread.sleep(3000);
		Assert.assertTrue(earlyModernEra.armeniaBtn.isDisplayed());
		Thread.sleep(3000);
		earlyModernEra.armeniaBtn.click();
		Thread.sleep(3000);
		earlyModernEra.historyAndCulture.click();
		Assert.assertTrue(earlyModernEra.earlyModernEra.isDisplayed());
		Thread.sleep(3000);
		earlyModernEra.earlyModernEra.click();
		Thread.sleep(3000);
		Assert.assertTrue(earlyModernEra.earlyEraImg.isDisplayed());
		Thread.sleep(3000);
	}
	
	@Test 
	public void historyAndCultureWorldWar1AndTheArmenianGenocide() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		VaAndPartnersHistoryAndCulture wordWar1AndTheArmenianGenocide = home.goToHistoryAndCultureWordWar1AndTheArmenianGenocide();
		Thread.sleep(3000);
		Assert.assertTrue(wordWar1AndTheArmenianGenocide.armeniaBtn.isDisplayed());
		Thread.sleep(3000);
		wordWar1AndTheArmenianGenocide.armeniaBtn.click();
		Thread.sleep(3000);
		Assert.assertTrue(wordWar1AndTheArmenianGenocide.historyAndCulture.isDisplayed());
		Thread.sleep(3000);
		wordWar1AndTheArmenianGenocide.historyAndCulture.click();
		Thread.sleep(3000);
		Assert.assertTrue(wordWar1AndTheArmenianGenocide.antiqImage.isDisplayed());
		Thread.sleep(3000);
		wordWar1AndTheArmenianGenocide.wordWarGenocide.click();
		Thread.sleep(3000);
		Assert.assertTrue(wordWar1AndTheArmenianGenocide.warGenocideImg.isDisplayed());
		Thread.sleep(3000);
	}
	
	@Test 
	public void historyAndCultureDemocraticRepublicOfArmenia() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		VaAndPartnersHistoryAndCulture democraticRepublicOfArmenia = home.goToHistoryAndCultureDemocraticRepublicOfArmenia();
		Thread.sleep(3000);
		Assert.assertTrue(democraticRepublicOfArmenia.armeniaBtn.isDisplayed());
		Thread.sleep(3000);
		democraticRepublicOfArmenia.armeniaBtn.click();
		Thread.sleep(3000);
		Assert.assertTrue(democraticRepublicOfArmenia.historyAndCulture.isDisplayed());
		Thread.sleep(3000);
		democraticRepublicOfArmenia.historyAndCulture.click();
		Thread.sleep(3000);
		Assert.assertTrue(democraticRepublicOfArmenia.antiqImage.isDisplayed());
		Thread.sleep(3000);
		democraticRepublicOfArmenia.dra.click();
		Thread.sleep(3000);
		Assert.assertTrue(democraticRepublicOfArmenia.republicImg.isDisplayed());
		
	}
	
	
	@Test
	public void historyAndCultureSovietArmenia() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		VaAndPartnersHistoryAndCulture sovietArmenia  = home.goToHistoryAndCultureSovietArmenia();
		Thread.sleep(3000);
		Assert.assertTrue(sovietArmenia.armeniaBtn.isDisplayed());
		Thread.sleep(3000);
		sovietArmenia.armeniaBtn.click();
		Assert.assertTrue(sovietArmenia.historyAndCulture.isDisplayed());
		Thread.sleep(3000);
		sovietArmenia.historyAndCulture.click();
		Thread.sleep(3000);
		Assert.assertTrue(sovietArmenia.antiqImage.isDisplayed());
		Thread.sleep(3000);
		sovietArmenia.sovietArm.click();
		Thread.sleep(3000);
		Assert.assertTrue(sovietArmenia.sovetArmImg.isDisplayed());
		
	}
	
	
	@Test
	public void historyAndCultureOfArmenia() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		VaAndPartnersHistoryAndCulture cultureArmenia  = home.goToHistoryAndCultureOfArmenia();
		Thread.sleep(3000);
		Assert.assertTrue(cultureArmenia.armeniaBtn.isDisplayed());
		Thread.sleep(3000);
		cultureArmenia.armeniaBtn.click();
		Assert.assertTrue(cultureArmenia.historyAndCulture.isDisplayed());
		Thread.sleep(3000);
		cultureArmenia.historyAndCulture.click();
		Thread.sleep(3000);
		Assert.assertTrue(cultureArmenia.antiqImage.isDisplayed());
		Thread.sleep(3000);
		cultureArmenia.cultureArm.click();
		Thread.sleep(3000);
		Assert.assertTrue(cultureArmenia.cultureArmImg.isDisplayed());
}
}


