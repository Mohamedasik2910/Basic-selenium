package Keyaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testkey {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);

	}

}
