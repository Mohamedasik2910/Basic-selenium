package listener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CssSelector2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---headless");
		
		WebDriver driver=new ChromeDriver(opt);
		
		Acitivitycapture acp=new Acitivitycapture();
		EventFiringWebDriver ef=new EventFiringWebDriver(driver);
		ef.register(acp);
		driver=ef;
		
		
		
		
		driver.get("http://triotend.com/tts/site/login");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Login
		driver.findElement(By.cssSelector("input#email")).sendKeys("triotend@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("triotend");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(("button.btn"))).click();
		Thread.sleep(1000);
		
		//Select Sidebar menu Direct Child
		driver.findElement(By.cssSelector("ul.sidebar-menu>li")).click();
		Thread.sleep(1000);
		
		//Select Nth Child
		driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(9)")).click();
		Thread.sleep(2000);
		
		//Select Subchild
		driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(10)")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.cssSelector("ul.treeview-menu.menu-open>li:nth-child(2)")).click();
		Thread.sleep(2000);
		
		//Logout
		
		driver.findElement(By.cssSelector("img.topuser-image")).click();
		Thread.sleep(2000);
		 //driver.findElement(By.xpath("//i[text()='Profile']"));
		 driver.findElement(By.xpath("//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li[4]/ul/li/div/div[4]/a[3]")).click();
		
		

	}

}
