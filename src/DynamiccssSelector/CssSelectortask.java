package DynamiccssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectortask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		

		//Enter User Name by Tag and Id
		driver.findElement(By.cssSelector("input#email")).sendKeys("triotend@gmail.com");
		Thread.sleep(1000);
		
		//Enter Password by Tag and attribute
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("triotend");
		Thread.sleep(1000);
		
		//Click submit button by Tag and Class Name
		driver.findElement(By.cssSelector("button.btn")).click();
		Thread.sleep(1000);
		/*
		 * //Direct Child
		 * driver.findElement(By.cssSelector("ul.sidebar-menu>li")).click();
		 * Thread.sleep(1000);
		 * 
		 * //Nth Child
		 * driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(9)")).click()
		 * ; Thread.sleep(2000);
		 */
		
		//Sub-Child
		driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(10)")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.cssSelector("ul.menu-open>li:nth-child(2)")).click();
		//js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(16)")).click();
		
	
		

	}

}
