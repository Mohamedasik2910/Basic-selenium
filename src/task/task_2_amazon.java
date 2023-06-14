package task;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task_2_amazon {

	public static void main(String[] args) throws InterruptedException {
		
		//Script for Open chrome and Amazon url
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(60));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//Script for Open All tab
		WebElement fc=driver.findElement(By.cssSelector("a#nav-hamburger-menu"));
		Actions act=new Actions(driver);
		 wt.until(ExpectedConditions.elementToBeClickable(fc));
		 act.click(fc).build().perform();
		 Thread.sleep(2000);
		
		 //Script for open Shoes Menu
		 WebElement men=driver.findElement(By.xpath("//a[text()='Shoes']"));
		 js.executeScript("arguments[0].click()", men);
		 js.executeScript("window.scrollBy(0,400)");
		 Thread.sleep(4000);
		 driver.findElement(By.cssSelector("button#a-autoid-22-announce")).click();
		 Thread.sleep(4000);
         
		// Scroll Down 
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(2000);
		
		//select the shoes
		WebElement getname1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[11]/div/div/div/div/div[2]/div[2]/h2/a")); 
		getname1.click();
		
		//Get window id and switch to next window
		String pid=driver.getWindowHandle();
		System.out.println(pid);
		Set<String>wid=driver.getWindowHandles();
		List<String>winid=new ArrayList<String>(wid);
		driver.switchTo().window(winid.get(1));
		Thread.sleep(1000);
		String pd2=driver.getWindowHandle();
		System.out.println(pd2);
		Thread.sleep(2000);
       
		//Click Add cart button
		driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
        Thread.sleep(2000);
       
        //View Cart detail
        driver.findElement(By.cssSelector("div#nav-cart-text-container")).click();
		Thread.sleep(2000);
		
       //Print product name
		WebElement pro1=driver.findElement(By.cssSelector("span.a-truncate-cut"));
		System.out.println("In Cart the Prdt name is:"+pro1.getText());
        Thread.sleep(2000);
		
        //switch to main window
        driver.switchTo().window(winid.get(0));
        WebElement getname2=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[11]/div/div/div/div/div[2]/div[2]/h2/a"));
		System.out.println("In main Window the Prdt name is:"+getname2.getText());
		
		

	}

}
