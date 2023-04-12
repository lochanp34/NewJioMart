package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.FrontPage;
import Page.SingUpPage;


public class VerifyUrlOfSignUpPageOfCousera {
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
}
 
 @BeforeMethod
public void GoToTheSingUpPage() {
       System.out.println("Before Method");
       driver = new ChromeDriver();
	   driver. get("https://www.coursera.org");
	   FrontPage frontPage = new FrontPage (driver);
	   frontPage.clickJoinForFree();
	   
 }
 @Test
 public void VerifyUrlOfSignUpPage() {
	 System.out.println("Test1");
	 SingUpPage singUpPage = new SingUpPage (driver);
	 String Expectedurl = singUpPage.getUrlOfSingUpPage();
		             
	 String Actualurl = "https://www.coursera.org/?authMode=signup";
                
		if  (Expectedurl.equals(Actualurl)) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
	   
 }
 @Test
 public void VerifyTextMassageOfSignUpPage() {
	  System.out.println("Test2");
	SingUpPage singUpPage = new SingUpPage (driver);
	   String ExpectedTextMassage = singUpPage.getTextMassageOfSignUpPage();
	   
	   String ActualTextMassage = "Learn on your own time from top universities and businesses.";
	   
		if  (ExpectedTextMassage.equals(ActualTextMassage)) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
	   
        }
		@AfterMethod()
	    public void Logout () {
		System.out.println("After Method");	

	    }
		@AfterClass()
		public void closedBrowse() {
	   	System.out.println("After Class");
    	 driver.quit();
			
		}
	  }



























//
//
//WebDriver driver;
//
//@BeforeClass 
//public void openTheBrowser() {
//	 System.out.println("Before Class");
//	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayur\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//ChromeOptions ops =  new ChromeOptions();
//ops.addArguments("--remote-allow-origins=*");
//driver = new ChromeDriver(ops);
//driver.manage().window().maximize();
//driver . manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//}
//
//@BeforeMethod
//public void GoToTheSingUpPage() {
//      System.out.println("Before Method");
//      driver = new ChromeDriver();
//	   driver. get("https://www.coursera.org");
//	   FrontPage frontPage = new FrontPage (driver);
//	   frontPage.clickJoinForFree();
//	   
//}
//@Test
//public void VerifyUrlOfSignUpPage() {
//	 System.out.println("Test1");
//	 SingUpPage singUpPage = new SingUpPage (driver);
//	 String Expectedurl = singUpPage.getUrlOfSingUpPage();
//		             
//	 String Actualurl = "https://www.coursera.org/?authMode=signup";
//               
//		if  (Expectedurl.equals(Actualurl)) {
//			System.out.println("PASSED");
//		}
//		else {
//			System.out.println("FAILED");
//		}
//	   
//}
//@Test
//public void VerifyTextMassageOfSignUpPage() {
//	  System.out.println("Test2");
//	SingUpPage singUpPage = new SingUpPage (driver);
//	   String ExpectedTextMassage = singUpPage.getTextMassageOfSignUpPage();
//	   
//	   String ActualTextMassage = "Learn on your own time from top universities and businesses.";
//	   
//		if  (ExpectedTextMassage.equals(ActualTextMassage)) {
//			System.out.println("PASSED");
//		}
//		else {
//			System.out.println("FAILED");
//		}
//	   
//       }
//		@AfterMethod()
//	    public void Logout () {
//		System.out.println("After Method");	
//
//	    }
//		@AfterClass()
//		public void closedBrowse() {
//	   	System.out.println("After Class");
//   	 driver.quit();
//			
//		}
//	  }
//
//
//
//
//
//
//




























