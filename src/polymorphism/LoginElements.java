package polymorphism;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElements {
	
	WebDriver driver;
	
	public void LoginElements(WebDriver driver) {
		this.driver = driver;
	}
	
	By fbEmail = By.xpath("//*[@id=\"email\"]");
	By fbpassword = By.xpath("//*[@id=\"pass\"]");
	By fbsignIn = By.xpath("//*[@id=\"loginbutton\"]");
	
	By amEmail = By.xpath("//*[@id=\"ap_email\"]");
	By ampassword = By.xpath("//*[@id=\"ap_password\"]");
	By amsignIn = By.xpath("//*[@id=\"signInSubmit\"]");	
	
	By email = By.xpath("//*[@id=\"ap_email\"]");
	By password = By.xpath("//*[@id=\"ap_password\"]");
	By signIn = By.xpath("//*[@id=\"signInSubmit\"]");
	
	public void checkText (String text) {
		driver.getPageSource().contains(text);
	}
	
	

}
