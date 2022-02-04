package com.web365.base;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VapartnersTourBaseTest  {
	
	protected WebDriver driver;
	
   @BeforeClass
   public void openVapartnersTours() {
	   //if chromedriver.exe is not located in C:\Windows directory than
	   //System.setProperty("webdriver.chrome.driver"),  "C:\Users\Aliksandra\Downloads\Chromedriver_32\MyLocationForChromedriverExe\chromedriver.exe"
	driver = new ChromeDriver();  
	driver.get("http://www.vapartners.am");
	
   }
   
   @AfterClass
   public void tearDown() {
	   driver.close();
	   driver.quit();
	}
   
   
   
   
   }


	

