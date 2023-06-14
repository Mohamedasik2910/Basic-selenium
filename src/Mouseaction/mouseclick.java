package Mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotendtech.in/treecutting/documents.html");
		Thread.sleep(2000);
		WebElement single=driver.findElement(By.cssSelector("input#picture"));
		Actions act=new Actions(driver);
        act.click(single).build().perform();

	}

}
