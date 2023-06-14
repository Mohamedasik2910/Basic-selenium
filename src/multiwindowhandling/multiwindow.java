package multiwindowhandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		Thread.sleep(1000);
		WebElement frm=driver.findElement(By.cssSelector("iframe#iframeResult"));
		driver.switchTo().frame(frm);
		
		String pid=driver.getWindowHandle();
		System.out.println(pid);
		
		driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		Set<String>winid=driver.getWindowHandles();
		List<String>win=new ArrayList<String>(winid);
		driver.switchTo().window(win.get(1));
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#search2")).sendKeys("JAVA");
		Thread.sleep(2000);
		
		
		driver.switchTo().window(win.get(0));
		String pid1=driver.getWindowHandle();
		System.out.println(pid1);

	}

}
