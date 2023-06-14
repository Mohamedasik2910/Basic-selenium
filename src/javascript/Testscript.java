package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.stratford.edu/");
		driver.manage().window().maximize();
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		WebElement op=driver.findElement(By.xpath("//a[text()='Program Change Request']"));
		js.executeScript("arguments[0].click()", op);
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		//Scroll
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		
		WebElement bt=driver.findElement(By.cssSelector("a.btn-default"));
		js.executeScript("arguments[0].scrollIntoView(true)", bt);
		

	}

}
