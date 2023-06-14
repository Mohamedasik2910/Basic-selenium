package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootsrapdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Click List
        driver.findElement(By.cssSelector("button#btndropdown")).click();
        Thread.sleep(2000);
        //click Clear button
        driver.findElement(By.cssSelector("button.close-dropdown")).click();
        Thread.sleep(2000);
        //Click button
        driver.findElement(By.cssSelector("button#btndropdown")).click();
        Thread.sleep(2000);
        List<WebElement>opt=driver.findElements(By.cssSelector("ul.dropdown-menu>li>label.radio-btn"));
        for (WebElement el : opt) {
			System.out.println(el.getText());
			if(el.getText().equals("HTML"))
			{
				el.click();
				Thread.sleep(1000);
			}
			else if(el.getText().equals("CSS"))
			{
			el.click();	
			Thread.sleep(1000);
			}
			else if(el.getText().equals("Bootstrap"))
					{
				el.click();
				Thread.sleep(1000);
					}}
			driver.findElement(By.cssSelector("button.save")).click();
			}
			
			 
			}
		
        
	
