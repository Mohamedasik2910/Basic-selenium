package printalllinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printlinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(4000);
		
		
	List<WebElement>el=driver.findElements(By.tagName("a"));
	
	for (WebElement op : el) {
		
		System.out.println(op.getText());
		System.out.println(op.getAttribute("href"));
	}

	}

}
