package enacapsulation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	
	@BeforeTest
  public void beforeTest() {
		LaunchBrowser firefox = new LaunchBrowser();
		firefox.launchFirefox();
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}	
    @Test
  public void f() {
	    driver.get("https://www.imdb.com");
		
		driver.findElement(By.xpath("//*[@id=\"nblogin\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div/a[4]")).click();
		
	    Login log = new Login(driver);
		log.loginImdb("user.testing.qa1@gmail.com", "test1234");
		 
		
        ImdbHomePage homePage = new ImdbHomePage(driver);
		
		Assert.assertTrue(homePage.getHomePageUserName().contains("George"));
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
