 package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locate {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---remote-allow-origins=*");
		WebDriver drive=new ChromeDriver(opt);
		drive.get("http://triotend.com/tts/site/login");
		drive.manage().window().maximize();
		Thread.sleep(1000);
		
		//Insert user name by id Locators
		
		drive.findElement(By.id("email")).sendKeys("triotend@gmail.com");
		Thread.sleep(1000);
		
		//Insert Password by cssSelector Locators
        
		drive.findElement(By.cssSelector("#password")).sendKeys("triotend");
		Thread.sleep(1000);
        
        //Submit Button by Tag Locators
        
        drive.findElement(By.tagName("button")).click();
		
		//Maximize window
         drive.manage().window().maximize();

        //By class name Locators
        drive.findElement(By.className("topuser-image")).click();
        Thread.sleep(3000);
      
        
        //Logout By Xpath Locators
        drive.findElement(By.xpath("//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li[4]/ul/li/div/div[4]/a[3]")).click();
        Thread.sleep(1000);
        drive.close();
	
	}

}
