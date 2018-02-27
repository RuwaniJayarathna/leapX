package admin_dashboard;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bookmarks {
	WebDriver driver=new FirefoxDriver();

	@BeforeClass
	public void begin() throws Exception {
		driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
	  }
	
	@Test
	public void test() throws Exception{
		Login();
		Click_Bookmark_Icon();
		view_all_bookmarks();
		
	}
	public void Login() throws Exception {
		driver.get("https://clms.net");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/header/nav/div/ul/li/a")).click();
		//driver.findElement(By.linkText(""))
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("madurika");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("ruwa1992");
		driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
		
		
		
		Thread.sleep(2000);
	  }
	public void Click_Bookmark_Icon() throws Exception{
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[2]/a/i")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[2]/ul/li[2]/div/ul/li[1]/a/h3")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='modal-bookmark']/div/div/div[1]/button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[2]/a/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[2]/ul/li[2]/div/ul/li[2]/a/h3")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='modal-bookmark']/div/div/div[1]/button")).click();
		
	}
		
	
	public void view_all_bookmarks() throws Exception{
		
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[2]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[2]/ul/li[3]/a")).click();
		Thread.sleep(5000);
	}
	
	
	  @AfterClass
	  public void end() throws Exception {
	    driver.quit();
	  }
	
	
	

	
	
	
	
}
