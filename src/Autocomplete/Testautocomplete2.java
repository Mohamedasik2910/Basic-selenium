package Autocomplete;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testautocomplete2 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.cssSelector("input[name='q']")).sendKeys("as");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	List<WebElement>opt=driver.findElements(By.cssSelector("ul.G43f7e>li"));
     for (WebElement el : opt) {
	System.out.println(el.getText());
	if(el.getText().equals("astrology"))
	{
		el.click();
		break;
	}
	
}
	
			

	}

}
