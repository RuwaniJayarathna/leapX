package admin_dashboard;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import admin_dashboard.notification_button;


public class notification_viewPreviousNotifications extends notification_button {

	 //WebDriver driver = new FirefoxDriver();
	 
	  @BeforeClass
	  public void begin() throws Exception {
		driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
	  }

	  @Test
	  public void test1() throws Exception {
		
		notification_button temp = new notification_button();
		temp.test();
		click_previous_notifications();
		click_view_newTraining();
		tab_handling();
		click_notices();
		
		
	    
	    
	  }
	  /*
	  public void Login() throws Exception {
		driver.get("https://clms.net");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/header/nav/div/ul/li/a")).click();
		//driver.findElement(By.linkText(""))
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("madurika");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("jaye1234!");
		driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
		
		
		
		Thread.sleep(3000);
	  }
	  
	  
	  public void click_notification_icon() throws Exception {
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[1]/a")).click();	
		System.out.println("Here");
			
		Thread.sleep(2500);
		  }
	*/
	  public void click_previous_notifications() throws Exception {
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[1]/ul/li[3]/a")).click();	
			
				
		Thread.sleep(2500);
			  }
	  
	  public void click_view_newTraining() throws Exception {
			driver.findElement(By.xpath(".//*[@id='notifications']/div/div/div/div/a/strong")).click();	
			Thread.sleep(2500);
				  }
	  
	  public void tab_handling() throws Exception{
		  /*driver.findElement(By.xpath("html/body/div[2]/aside[2]/div/ul/li[1]/a")).click();	
			Thread.sleep(3000);
			*/	  

		  // switch to the previous tab
		  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		  //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "" + Keys.SHIFT + "" + Keys.TAB);
		  Thread.sleep(2000);
	  }
	  public void click_notices() throws Exception {
		driver.findElement(By.xpath("html/body/div[2]/aside[2]/div/ul/li[2]/a")).click();	
			
				
		Thread.sleep(2500);
			  }
	  
	
		
	  @AfterClass
	  public void end() throws Exception {
	    driver.quit();
	  }
}
