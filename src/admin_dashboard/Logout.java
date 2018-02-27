package admin_dashboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Logout {

	WebDriver driver=new FirefoxDriver();
	
	
	@BeforeGroups
	public void begin() throws Exception{
		driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
		
	}
	
	@Test
	public void Test() throws Exception{
	Login();	
	click_username();	
	dashboard();
	click_username();
	click_profile();
	change_password();
	click_username();
	singout();
	
	
		
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
	
	public void click_username() throws Exception{
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		
	}
	public void dashboard() throws Exception{
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[3]/ul/li[2]/div/a")).click();
		Thread.sleep(3000);
	}
	
	public void click_profile() throws Exception{
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[3]/ul/li[3]/div[1]/a")).click();
		
		//click on change password
		driver.findElement(By.xpath(".//*[@id='change_password_link']")).click();
		Thread.sleep(3000);
		
	}
	public void change_password() throws Exception{
		
	if(!(driver.findElement(By.className("alert-danger")).isDisplayed())){
		System.out.println("-----Here-------");
	
		driver.findElement(By.xpath(".//*[@id='curent-password']")).clear();
		driver.findElement(By.xpath(".//*[@id='curent-password']")).sendKeys("ruwa1992");
		driver.findElement(By.xpath(".//*[@id='new-password']")).clear();
		driver.findElement(By.xpath(".//*[@id='new-password']")).sendKeys("maduj1992");
		driver.findElement(By.xpath(".//*[@id='repeat-password']")).clear();
		driver.findElement(By.xpath(".//*[@id='repeat-password']")).sendKeys("maduj1992");
		driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
		Thread.sleep(5000);
		}
	else{
		System.out.println("not visible");
	}
	}
	
	public void singout() throws Exception{
		driver.findElement(By.xpath("html/body/header/nav/div/ul/li[3]/ul/li[3]/div[2]/a")).click();
	}
	
	
	
	
	@AfterClass
	public void end() throws Exception{
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
}
