package inheritance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class EnheitanceTest {
	
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "/Users/yuri_naida/Documents/workspace_personal/selenium/geckodriver");
	  driver = new FirefoxDriver();
  }	
  @Test
  public void f() {
	 driver.get("https://www.imdb.com"); 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	 driver.findElement(By.linkText("Other Sign in options")).click();
	 driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div/a[4]")).click();
	 
	 LoginPage log = new LoginPage(driver);
	 log.loginImdb("user.testing.qa1@gmail.com", "test1234");
	 
	 String userName =  driver.findElement(By.xpath("//*[@id=\"navUserMenu\"]/p/a")).getText();
		
	 Assert.assertEquals(userName, "George");

  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
