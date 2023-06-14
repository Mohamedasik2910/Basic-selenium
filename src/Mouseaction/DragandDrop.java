package Mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		
		WebElement frm=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frm);
		WebElement source=driver.findElement(By.cssSelector("div#draggable"));
		WebElement dest=driver.findElement(By.cssSelector("div#droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, dest).build().perform();
		

	}

}
