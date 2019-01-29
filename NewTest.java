package test.webSeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;
  @Test
  public void testEasy() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\JuanPabloDurante\\Desktop\\eclipse-workspace\\chome.driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("JuanSenior");
	  String title = driver.getTitle();
	  //Assert.assertTrue(title.contains("Demo Guru99 Page"));
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
