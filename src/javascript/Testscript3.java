package javascript;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript3 {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.snapdeal.com/");
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 Thread.sleep(2000);
	
	 WebElement click=driver.findElement(By.xpath("//span[text()='Trousers & Chinos']"));
	 js.executeScript("arguments[0].click()", click);
	 driver.navigate().back();
	 Thread.sleep(1000);
	 
	
	js.executeScript("window.scrollBy(0,200)");
	 
	 
	 

	}

}
