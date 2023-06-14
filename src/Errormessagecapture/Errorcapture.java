package Errormessagecapture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Errorcapture {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://triotend.com/tts/site/login");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("input#email")).sendKeys("triotend@gmail.com");
		 driver.findElement(By.cssSelector("input#password")).sendKeys("trioten");
		 driver.findElement(By.cssSelector("button.btn")).click();
		 WebElement el=driver.findElement(By.cssSelector("div.alert-danger"));
		 
		 System.out.println(el.isDisplayed());
		

	}

}
