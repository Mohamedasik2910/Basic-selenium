package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement frm=driver.findElement(By.cssSelector("iframe#iframeResult"));
		driver.switchTo().frame(frm);
		WebElement br=driver.findElement(By.cssSelector("select#cars"));
		 Select sdrp=new Select(br);
		
		
		sdrp.selectByIndex(3);
		Thread.sleep(2000);
		sdrp.selectByValue("saab");
		Thread.sleep(2000);
		sdrp.selectByVisibleText("Opel");
		driver.findElement(By.cssSelector("body > form > input[type=submit]")).click();

	}

}
