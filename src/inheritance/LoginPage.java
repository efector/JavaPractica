package inheritance;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends ListOfElements {
	
        WebDriver driver;
        
        public LoginPage (WebDriver driver) {
        	this.driver = driver;
        }      
		
		public void setEmail(String usrEmail) {
			driver.findElement(email).sendKeys(usrEmail);
		}
		
		public void setPassword(String pswd) {
			driver.findElement(password).sendKeys(pswd);
		}
		
		public void setSignIn () {
			driver.findElement(signIn).click();
		}
		
		public void loginImdb (String eml, String pass) {
			this.setEmail(eml);
			this.setPassword(pass);
			this.setSignIn();
		}
		
	}



