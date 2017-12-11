package polymorphism;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PolyTest {
  
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
		   System.setProperty("webdriver.gecko.driver", "/Users/yuri_naida/Documents/workspace_personal/selenium/geckodriver");
		   driver = new FirefoxDriver();	

			  
  }
	@Test
	  public void userNameVerification() {
		driver.get("https://www.imdb.com");
			  
		driver.findElement(By.linkText("Other Sign in options")).click();
		driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div/a[4]")).click();
		
		Login log = new Login(driver);
		log.login("user.testing.qa1@gmail.com", "test1234");
		log.checkText("George");
		
	  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
