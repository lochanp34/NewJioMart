package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Page.FrontPage;
import Page.SingUpPage;

class TestClassOfCousera {
	
        static WebDriver driver;

	    public static void main(String[] args) throws InterruptedException { 
		 
		System.setProperty("webdriver.chrome .driver", "C:\\Users\\Mayur\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   
		ChromeOptions ops =  new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
    	
    	WebDriver driver = new ChromeDriver(ops);
    	
         driver. get("https://www.coursera.org/");
	
         driver.manage().window().maximize();
	     driver . manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         
         FrontPage frontPage = new FrontPage (driver);
         frontPage.clickJoinForFree();
		
         Thread.sleep(3000);
         SingUpPage singUpPage = new SingUpPage(driver);
         singUpPage.sendFullName();
         singUpPage.sendPassword();
         singUpPage.getTextMassageOfSignUpPage();
         
	    }
}