package Dynamicxpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath2 {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		
		//Time duration
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Last()
		driver.findElement(By.xpath("(//input[@type='text'])[last()]")).sendKeys("last");
		driver.findElement(By.xpath("(//input[@type='text'])[last()-1]")).sendKeys("last");
		//driver.findElement(By.xpath("(//input[@type='text'])[last()-2]")).sendKeys("last");
		
		//Position()
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Position");
		
		//Index
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Index");
		
		//following
		driver.findElement(By.xpath("//input[@name='fullName']/following::input[@name='username']")).sendKeys("Following");
		//driver.findElement(By.xpath("//input[@name='emailOrPhone']/following::input[@name='fullName']")).sendKeys("Fullname Following");
		
		//preceding
		driver.findElement(By.xpath("//input[@name='username']/preceding::input[@name='fullName']")).sendKeys("Preceding");
		
	}

}
