package polymorphism;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends LoginElements{
	
	WebDriver driver;
	
	public Login (WebDriver driver) {
		this.driver = driver;
	}  
	
	public void setWait () {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
	public void login (String eml, String pass) {
		this.setEmail(eml);
		this.setPassword(pass);
		this.setSignIn();
	}
    @Override
	public void checkText (String text) {
		if (driver.getPageSource().contains(text)){
			System.out.println(text + " is present. PASS");
		}
		else System.out.println(text + " is NOT present. FAIL");
		
	}
	
}
