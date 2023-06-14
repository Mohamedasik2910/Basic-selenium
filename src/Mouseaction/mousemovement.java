package Mouseaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovement {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://online.stratford.edu/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	//WebElement mov=driver.findElement(By.cssSelector("ul.nav>li:nth-child(4)"));
	  WebElement mov=driver.findElement(By.xpath("//a[text()='Resources']"));

	
	WebElement child=driver.findElement(By.xpath("//a[text()='Forms']"));
	
	
	WebElement subchild=driver.findElement(By.xpath("//a[text()='Program Change Request']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(mov).build().perform();
	Thread.sleep(2000);
	
	act.moveToElement(child).build().perform();
	Thread.sleep(2000);
	
	act.click(subchild).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input.ctl00_mainContent_lvLoginUser_ucLoginUser_lcLoginUser_UserName")).sendKeys("Welcome");
	
	
	
	}

}
