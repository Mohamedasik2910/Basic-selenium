package Fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autoitupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotendtech.in/treecutting/documents.html");
		Thread.sleep(2000);
		WebElement single=driver.findElement(By.cssSelector("input#picture"));
		
		Actions act=new Actions(driver);
        act.click(single).build().perform();
        Thread.sleep(1000);
        
        Runtime.getRuntime().exec("./src/Exefile/Fileupload.exe"+" "+"E:\\file\\java_tutorial.pdf");
       
        


	}

}
