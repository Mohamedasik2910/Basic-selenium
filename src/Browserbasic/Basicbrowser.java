package Browserbasic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basicbrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---remote-allow-origins=*");
		WebDriver drive=new ChromeDriver(opt);
		//WebDriver drive=new FirefoxDriver();
		//open application
		drive.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		//Navigate to next application
		drive.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//Navigate back
		drive.navigate().back();
		Thread.sleep(3000);
		
		//Navigate forward
		drive.navigate().forward();
		Thread.sleep(3000);
		
		//refresh
		drive.navigate().refresh();
		Thread.sleep(3000);
		
		//Maximize
		drive.manage().window().maximize();
		Thread.sleep(3000);
		
		//Resize
		Dimension d=new Dimension(450, 750);
		drive.manage().window().setSize(d);
		Thread.sleep(3000);
		
		//minimize
		drive.manage().window().minimize();
		Thread.sleep(3000);
		
		//full screen
		drive.manage().window().fullscreen();
		Thread.sleep(3000);
		
		//close
		drive.close();
				

	}

}
