package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.annauniv.edu/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement opt=driver.findElement(By.xpath("//a[text()='AU-RU Urban Energy Centre']"));
		js.executeScript("arguments[0].click()", opt);
	
	
		
		
		

	}

}
