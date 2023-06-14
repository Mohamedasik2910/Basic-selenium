package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdrop2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button#btndropdown")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Clear']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button#btndropdown")).click();
		Thread.sleep(2000);
		
		List<WebElement>opt=driver.findElements(By.cssSelector("ul.dropdown-menu>li>label.radio-btn"));
		for (WebElement el : opt) {
			System.out.println(el.getText());
			if(el.getText().equals("CSS"))
			{
				el.click();
				Thread.sleep(1000);
			}
			
			else if(el.getText().equals("JavaScript"))
			{
				el.click();
				Thread.sleep(1000);
			}

			else if(el.getText().equals("Bootstrap"))
			{
				el.click();
				Thread.sleep(1000);
			}
		}

	}

}
