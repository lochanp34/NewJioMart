package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SingUpPage {


    //Variable Declaration 

			 
	 @FindBy(xpath="(//p//span)[7]")
	 private WebElement TextMassage;
	  
	 @FindBy(xpath="//input[@name='name']")
	   private WebElement fullName;
	   
	   @FindBy(xpath="//input[@name='email']")
	   private WebElement email;
	   
	   @FindBy(xpath="//input[@id='password']")
	   private WebElement password;
	   

	   @FindBy(xpath="//button[@class='_1wktrlf _1im0dc8']")
	   private WebElement CrossButton;
	   
	   
	   WebDriver driver;
	
	   //Variable initialization
        public SingUpPage (WebDriver driver) {
        PageFactory.initElements( driver, this); 
        this.driver=driver;
	   }
	     
	   //Variable used    
        
        public String getTextMassageOfSignUpPage() {
        	String text = TextMassage.getText();
        	return text;
        }
        
	   public void sendFullName() {
	   fullName.sendKeys("Lochan Jibhau Patil");
	   }   
	    public void sendEmailId() {
	    	email.sendKeys("lochanp34@gmail.com");
	    } 
         public void sendPassword() {
        	 password.sendKeys("Lochanp11121997");
    
	   }

          public void clickOnCrossBotton() {
        	  CrossButton.click();
          }
        public String getUrlOfSingUpPage() {
        	String url = driver .getCurrentUrl();
        	return url;
        
		}

}
//Thread.sleep(2000);
//	WebElement fullName = driver .findElement(By.xpath("//input[@name='name']"));
//	fullName.sendKeys("lochan jibhau patil");
//	 Thread.sleep(2000);
//    WebElement email = driver .findElement(By.xpath("//input[@name='email']"));
//    email.sendKeys("lochanp34@gmail.com");
//    Thread.sleep(2000);
//	WebElement password  = driver . findElement (By.xpath("	//input[@id='password']"));
//	password.sendKeys("9307099328");
//	 Thread.sleep(2000);