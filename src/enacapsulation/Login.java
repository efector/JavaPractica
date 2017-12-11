package enacapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	By email = By.xpath("//*[@id=\"ap_email\"]");
	By password = By.xpath("//*[@id=\"ap_password\"]");
	By signIn = By.xpath("//*[@id=\"signInSubmit\"]");
	
	public Login (WebDriver driver) {
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
