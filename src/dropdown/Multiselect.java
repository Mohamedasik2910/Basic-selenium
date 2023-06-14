package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(1000);
		driver.manage().window().maximize();
        WebElement op=driver.findElement(By.cssSelector("iframe#iframeResult"));
        driver.switchTo().frame(op);
        WebElement opr=driver.findElement(By.cssSelector("select#cars"));
        Select mbr=new Select(opr);
        mbr.selectByIndex(2);
        Thread.sleep(2000);
        mbr.selectByValue("saab");
        Thread.sleep(2000);
        mbr.selectByVisibleText("Audi");
        Thread.sleep(2000);
        
        System.out.println("--Select All option--");
        List<WebElement>allopt=mbr.getOptions();
        for (WebElement el : allopt) {
        System.out.println(el.getText());
			
		}
        System.out.println("--Select Selected Option--");
        List<WebElement>selopt=mbr.getAllSelectedOptions();
        for (WebElement el : selopt) {
        	System.out.println(el.getText());
			
		}
        mbr.deselectByIndex(2);
        Thread.sleep(2000);
        mbr.deselectByValue("saab");
        Thread.sleep(2000);
        mbr.deselectByVisibleText("Audi");
        
	}

}
