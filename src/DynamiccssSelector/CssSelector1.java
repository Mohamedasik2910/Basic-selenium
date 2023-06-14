package DynamiccssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//Tag name and Id
		driver.findElement(By.cssSelector("input#email")).sendKeys("Tag Name and Id");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(3000);
		
		//Tag Name and Class Name
		driver.findElement(By.cssSelector("input.form-username")).sendKeys("Tag Name and Class Name");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(3000);
		
		//Tag Name and Attribute
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Tag Name and Attribute");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(3000);
		
		//Tag Name, Id and Attribute
		driver.findElement(By.cssSelector("input#email[placeholder='Username']")).sendKeys("Tag Name, Id and Attribute");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(3000);
		
		//Tag Name, Class and Attribute
		driver.findElement(By.cssSelector("input.form-username[placeholder='Username']")).sendKeys("Tag Name, Class Name and Attribute");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(3000);
		
		//Starts With
		driver.findElement(By.cssSelector("input[placeholder^='Us']")).sendKeys("Starts-With");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(3000);
		
		//Ends With
		driver.findElement(By.cssSelector("input[placeholder$='me']")).sendKeys("Ends With");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(3000);
		
		//Contains
		driver.findElement(By.cssSelector("input[placeholder*='er']")).sendKeys("Contains");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
