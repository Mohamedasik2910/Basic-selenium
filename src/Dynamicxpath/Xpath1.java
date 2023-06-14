package Dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("http://triotend.com/tts/site/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Absolute/single Slash xPath
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys("Absolute Attribute");
         Thread.sleep(4000);
         
         //Relative/Double slash Xpath
         driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
         Thread.sleep(4000);
         
         //Using Single Attribute
         driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Single Attribute");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//input[@id='email']")).clear();
         Thread.sleep(3000);
         
         //Using Multiple attribute
         driver.findElement(By.xpath("//input[@placeholder='Username'][@id='email']")).sendKeys("Multiple Attribute");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//input[@id='email']")).clear();
         Thread.sleep(3000);
         
         //Using And
         driver.findElement(By.xpath("//input[@placeholder='Username'and @id='email']")).sendKeys("And Method");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//input[@id='email']")).clear();
         Thread.sleep(3000);
         
         //Using OR
         driver.findElement(By.xpath("//input[@placeholder='Username' or id='email']")).sendKeys("Or Method");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//input[@id='email']")).clear();
         Thread.sleep(3000);
         
         //Using Contains
         driver.findElement(By.xpath("//input[contains(@placeholder,'name')]")).sendKeys("Contains");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//input[@id='email']")).clear();
         Thread.sleep(3000);
         
         //Using Starts
         driver.findElement(By.xpath("//input[starts-with(@placeholder,'Us')]")).sendKeys("Using Starts");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//input[@id='email']")).clear();
         Thread.sleep(3000);
        
         //User name and password entered
         driver.findElement(By.xpath("//input[starts-with(@placeholder,'Us')]")).sendKeys("triotend@gmail.com");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("triotend");
         Thread.sleep(2000); 
         
         //Using Text
         driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}

}
