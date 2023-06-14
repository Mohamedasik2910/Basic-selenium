package Autocomplete;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.channel.ServerChannel;

public class Testautocomplete {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.cssSelector("input[name='q']"));
		search.sendKeys("Mobile");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		List<WebElement>opt=driver.findElements(By.cssSelector("ul.G43f7e>li"));
		for (WebElement el : opt) {
		System.out.println(el.getText());
		
		  if(el.getText().equals("mobile tracker"))
		  
		  { 
			  el.click(); 
		  break;
		  
		  
		  }
		 
			
		}
	}
}


