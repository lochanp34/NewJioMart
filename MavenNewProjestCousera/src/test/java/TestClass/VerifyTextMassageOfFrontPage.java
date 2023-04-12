package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.FrontPage;

public class VerifyTextMassageOfFrontPage {

	
	
	WebDriver driver;
	
	 @BeforeClass 
    public void openTheBrowser() {
    System.out.println("Before Class");
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayur\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeOptions ops =  new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(ops);
	driver.manage().window().maximize();
	driver . manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	driver . manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	driver . manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	 @BeforeMethod
	 public void GoToTheFrontPage() {
	       System.out.println("Before Method");
	       System.out.println("Before Method1");
	          //driver = new ChromeDriver();
	 	   driver. get("https://www.coursera.org");
	 	   FrontPage frontPage = new FrontPage (driver);
	 	   //frontPage.clickJoinForFree();
	 	   
	  }
	 @Test
		public void verfiymassageonForontPage() {
	    System.out.println("Test 1");
	    FrontPage frontPage = new FrontPage (driver);
	    String actualMassage =  frontPage.getTextOfFrontPage();
		String expectedMassage = "Learn without limits";
		if  (actualMassage.equals(expectedMassage)) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
		}
}











//
//
//
//
//
//
//
//
//
//
//
//WebDriver driver;
//
// @BeforeClass 
//public void openTheBrowser() {
//System.out.println("Before Class");
//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayur\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//ChromeOptions ops =  new ChromeOptions();
//ops.addArguments("--remote-allow-origins=*");
// driver = new ChromeDriver(ops);
//driver.manage().window().maximize();
//driver . manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//}
// @BeforeMethod
// public void GoToTheFrontPage() {
//       System.out.println("Before Method");
//       //driver = new ChromeDriver();
// 	   driver. get("https://www.coursera.org");
// 	   FrontPage frontPage = new FrontPage (driver);
// 	   //frontPage.clickJoinForFree();
// 	   
//  }
// @Test
//	public void verfiymassageonForontPage() {
//    System.out.println("Test 1");
//    FrontPage frontPage = new FrontPage (driver);
//    String actualMassage =  frontPage.getTextOfFrontPage();
//	String expectedMassage = "Learn without limits";
//	if  (actualMassage.equals(expectedMassage)) {
//		System.out.println("PASSED");
//	}
//	else {
//		System.out.println("FAILED");
//	}
//	}
//}
