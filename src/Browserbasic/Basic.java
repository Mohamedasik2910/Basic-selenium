package Browserbasic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("---remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(opt);
		
	driver.get("https://www.instagram.com/");
	Thread.sleep(4000);
	//Navigate 
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(4000);
	
	//Navigate to next
	driver.navigate().to("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
	Thread.sleep(4000);
	
	//Back to first
	driver.navigate().back();
	Thread.sleep(4000);
	
	//forward
	driver.navigate().forward();
	Thread.sleep(4000);
	
	//Refresh the window
	driver.navigate().refresh();
	Thread.sleep(4000);
		
	//Maximize the window
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	//Resize the window
	Dimension d=new Dimension(720,820);
	driver.manage().window().setSize(d);
	Thread.sleep(4000);
	
	//Minimize the window
	driver.manage().window().minimize();
	Thread.sleep(4000);
	
	//full screen
	driver.manage().window().fullscreen();
	Thread.sleep(4000);
	
	//Close the window
	driver.close();
	}

}
