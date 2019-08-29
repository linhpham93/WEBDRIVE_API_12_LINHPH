package selenium_api;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic_02_XPath_Css_Part_I {
	WebDriver driver;
	

  @BeforeClass
  public void beforeClass() {
	  driver= new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://live.guru99.com/");
  }
  
  @Test
  public void TC_01 () throws Exception {
	  driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
	  // Tìm 1 element có id = email - Sau khi tim được dữ liệu vào cho element này
	  driver.findElement(By.id("email")).sendKeys("ID_email@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("email")).clear();
	  
	  driver.findElement(By.className("validate-email")).sendKeys("Class_email@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("email")).clear();
	  
	  driver.findElement(By.name("login[username]")).sendKeys("name_email@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("email")).clear();
	  
	  //work with link
	  driver.findElement(By.linkText("SITE MAP")).click();
	  driver.findElement(By.partialLinkText("ADVANCED SEARCH")).click();
	  driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
	  //sleep cung 5s
	  Thread.sleep(5000);
  }
  // Post-condition
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
