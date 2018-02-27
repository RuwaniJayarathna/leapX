package admin_dashboard;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class notification_button {
  WebDriver driver = new FirefoxDriver();
		
  @BeforeClass
  public void begin() throws Exception {
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
  }

  @Test
  public void test() throws Exception {
	Login();
	click_notification_icon();
    
    
  }
  
  public void Login() throws Exception {
	driver.get("https://clms.net");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/header/nav/div/ul/li/a")).click();
	//driver.findElement(By.linkText(""))
	Thread.sleep(3000);
	driver.findElement(By.id("userName")).clear();
	driver.findElement(By.id("userName")).sendKeys("madurika");
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("ruwa1992");
	driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
	
	
	
	Thread.sleep(3000);
  }
  
  public void click_notification_icon() throws Exception {
	driver.findElement(By.xpath("html/body/header/nav/div/ul/li[1]/a")).click();	
	
		
		Thread.sleep(3000);
	  }
  

  @AfterClass
  public void end() throws Exception {
    driver.quit();
  }
}
