package Fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileuploadrobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
			WebDriver driver=new ChromeDriver();
			driver.get("http://triotendtech.in/treecutting/documents.html");
			Thread.sleep(2000);
			WebElement single=driver.findElement(By.cssSelector("input#picture"));
			
			Actions act=new Actions(driver);
	        act.click(single).build().perform();
	        
	           StringSelection str=new StringSelection("E:\\file\\java_tutorial.pdf");
	           Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	           Robot rb=new Robot();
           
           rb.keyPress(KeyEvent.VK_ENTER);
           rb.keyRelease(KeyEvent.VK_ENTER);
           
           rb.keyPress(KeyEvent.VK_CONTROL);
           rb.keyPress(KeyEvent.VK_V);
           
           rb.keyRelease(KeyEvent.VK_CONTROL);
           rb.keyRelease(KeyEvent.VK_V);
           
           rb.keyPress(KeyEvent.VK_ENTER);
           rb.keyRelease(KeyEvent.VK_ENTER);
           Thread.sleep(4000);
           //driver.findElement(By.cssSelector("input#submit")).click();
           driver.findElement(By.xpath("//button[text()='Reset']")).click();
	}

}
