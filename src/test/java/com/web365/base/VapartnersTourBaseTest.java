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
	System.setProperty("webdrive.chrome.driver", "C:\\Users\\Aliksandra\\Downloads\\chromedriver_win32\\chromedriver.exe");	driver = new ChromeDriver();  
	driver.manage().window().maximize();
	driver.get("http://www.vapartners.am");
	System.out.println("this is before class  " + this.getClass().getSimpleName() );

   }
   
   @AfterClass
   public void tearDown() {
	   driver.close();
	   driver.quit();
	}
   
   
   
   
   }


	

