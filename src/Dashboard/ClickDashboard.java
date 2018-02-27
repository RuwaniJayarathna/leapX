package Dashboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ClickDashboard {
	WebDriver driver=new FirefoxDriver();
	
	
@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2,TimeUnit.MINUTES);
	
}
@Test
public void test() throws Exception{
	login();
	click_Dashboard();
	
}
public void login() throws Exception{
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
public void click_Dashboard() throws Exception {
	driver.findElement(By.xpath("html/body/div[2]/aside[1]/section/ul/li[1]/a")).click();
	Thread.sleep(3000);
}

public void click_ManageUsers() throws Exception{
	driver.findElement(By.xpath("html/body/div[2]/aside[2]/section[2]/div[2]/div[1]/span[2]/a")).click();
	
}


@AfterClass	
public void end() throws Exception{
	driver.quit();
}
	

}
