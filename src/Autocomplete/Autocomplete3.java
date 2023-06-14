package Autocomplete;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import listener.Acitivitycapture;

public class Autocomplete3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//Acitivitycapture
		Acitivitycapture acp=new Acitivitycapture();
		EventFiringWebDriver ef=new EventFiringWebDriver(driver);
		ef.register(acp);
		driver=ef;
		driver.get("https://www.snapdeal.com/?utm_source=admitad_846&utm_campaign=ab747be3c1ecc19bbdcac0dfc22c780e&utm_content=admitad_846&publisher_id=586854");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		Thread.sleep(4000);

		driver.findElement(By.cssSelector("input[name='keyword']")).sendKeys("gents");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		List<WebElement> opt = driver.findElements(By.cssSelector("ul.suggestionList_menu>li"));

		for (WebElement el : opt) {

			System.out.println(el.getText());

			if (el.getText().equals("Gents Bag")) {
				el.click();
				break;

			}

		}

		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement click = driver.findElement(By.xpath("//span[text()='Trousers & Chinos']"));
		js.executeScript("arguments[0].click()", click);

		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(1000);

		// javascript
		driver.findElement(By.xpath("//a[text()='Baby & Kids']")).click();
		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,1700)");
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		// Mousesingleclick
		WebElement single = driver.findElement(By.xpath("//span[text()='Electronics']"));
		WebElement next = driver.findElement(By.xpath("//span[text()='Sports, Fitness & Outdoor']"));
		WebElement com = driver.findElement(By.xpath("//span[text()='Computers & Gaming']"));
		WebElement book = driver.findElement(By.xpath("//span[text()='Books, Media & Music']"));

		Actions act = new Actions(driver);

		act.click(single).build().perform();
		Thread.sleep(1000);
		act.click(next).build().perform();
		Thread.sleep(1000);
		act.click(com).build().perform();
		Thread.sleep(1000);
		act.click(book).build().perform();
		Thread.sleep(1000);

		driver.navigate().refresh();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input#pincode-check-nba")).sendKeys("624001");
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(1000);

		
		  JavascriptExecutor je=(JavascriptExecutor)driver; 
		  //WebElement sub=driver.findElement(By.xpath("//button[text()='Subscribe']"));
		  WebElement sub1=driver.findElement(By.cssSelector("button.subscribeBtn"));
		 
		  je.executeScript("arguments[0].scrollIntoView(true)", sub1);
		 

	}

}
