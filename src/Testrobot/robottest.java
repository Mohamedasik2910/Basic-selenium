package Testrobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robottest {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.	VK_TAB);
		Thread.sleep(1000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
	}

}
