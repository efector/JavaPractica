package enacapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbHomePage {
	
	   WebDriver driver;

	    By userNameElement = By.xpath("//*[@id=\"navUserMenu\"]/p/a");


	    public ImdbHomePage(WebDriver driver){

	        this.driver = driver;
	
	    }
	
	public String getHomePageUserName () {
		return driver.findElement(userNameElement).getText();
	}

}

