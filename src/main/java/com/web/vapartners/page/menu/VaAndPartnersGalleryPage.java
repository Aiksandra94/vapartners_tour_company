package com.web.vapartners.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;

public class VaAndPartnersGalleryPage extends VaAndPartnersBasePage {


public VaAndPartnersGalleryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
   public static final String GALLERY_TITLE_XPATH = "//img[@src='/img/gallery/1.jpg']";
	
	@FindBy(xpath = GALLERY_TITLE_XPATH)
	public WebElement galleryTitle;
	
}