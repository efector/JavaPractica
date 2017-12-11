package inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListOfElements {
	
	WebDriver driver;
	
	By email = By.xpath("//*[@id=\"ap_email\"]");
	By password = By.xpath("//*[@id=\"ap_password\"]");
	By signIn = By.xpath("//*[@id=\"signInSubmit\"]");

}
