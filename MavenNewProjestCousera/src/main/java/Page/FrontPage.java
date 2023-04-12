package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontPage {
	 WebDriver driver;
	       //Variable Declaration 
	       @FindBy(xpath="	 //h1[text()='Learn without limits']")
	      private WebElement Text;
	
		   @FindBy(xpath="(//span[text()='Join for Free'])[1]")
		   private WebElement JoinForFree;
		 
		   
		   //Variable initialization
	       public FrontPage (WebDriver driver) {
	       PageFactory.initElements( driver, this); 
	       this.driver=driver;
		   }
		     
		   //Variable used    
		   public void clickJoinForFree() {
		   JoinForFree.click();
		   }
		   public String getTextOfFrontPage() {
			   String s = Text.getText();
			   return s;
		   }

}

