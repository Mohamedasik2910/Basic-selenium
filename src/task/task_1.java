package task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task_1 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		driver.get("http://triotend.com/tts/site/login");
		Thread.sleep(1000);

		driver.manage().window().maximize();
		Thread.sleep(1000);

		// Login with Username
		driver.findElement(By.cssSelector("input#email")).sendKeys("triotend@gmail.com");
		Thread.sleep(1000);

		// Login with Password
		driver.findElement(By.cssSelector("input#password")).sendKeys("triotend");
		Thread.sleep(1000);

		// Click Login Button
		driver.findElement(By.cssSelector("button.btn")).click();
		Thread.sleep(4000);

		// script to click on the front office menu
		driver.findElement(By.cssSelector("ul.sidebar-menu>li")).click();
		Thread.sleep(1000);

		// script to click on the visitor book
		driver.findElement(By.xpath("//a[text()=' Visitor Book']")).click();
		Thread.sleep(2000);

		// script to click on the Add visitor
		driver.findElement(By.cssSelector("a.btn-sm")).click();
		Thread.sleep(2000);

		// script to click on the dropdown box
		WebElement drp = driver.findElement(By.cssSelector("form#formadd select.form-control"));
		Select sdrp = new Select(drp);
		sdrp.selectByVisibleText("TO MEET DOCTOR");
		Thread.sleep(1000);

		// script to click on the Name box
		driver.findElement(By.cssSelector("form#formadd input[name='name']")).sendKeys("Vijay");
		Thread.sleep(1000);

		// script to click on the mob box
		driver.findElement(By.cssSelector("form#formadd input[name='contact']")).sendKeys("9500000000");
		Thread.sleep(1000);

		// script to click on the id box
		driver.findElement(By.cssSelector("form#formadd input[name='id_proof']")).sendKeys("ID_0001");
		Thread.sleep(1000);

		// script to click on the no of person box
		driver.findElement(By.cssSelector("form#formadd input[name='pepples']")).sendKeys("1");
		Thread.sleep(1000);

		// Script to click on the Date Box

		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement datepicker = driver.findElement(By.cssSelector("#date"));

		wt.until(ExpectedConditions.elementToBeClickable(datepicker));
		datepicker.click();
		datepicker1 dt = new datepicker1();
		dt.datpicker(driver, "29", 10, 1990);
		Thread.sleep(1000);

		// script to click on the note Textbox
		driver.findElement(By.cssSelector("form#formadd textarea[name='note']")).sendKeys("To Consult the doctor");
		Thread.sleep(1000);
		
		  // script to click on the file upload 
		  WebElement sing =driver.findElement(By.cssSelector("form#formadd input[name='file']"));
		  Actions act = new Actions(driver); 
		  act.click(sing).build().perform();
		  
		  // fileupload 
		  StringSelection str = new StringSelection("E:\\file\\java_tutorial.pdf");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		  Robot rb = new Robot();
		  
		  rb.keyPress(KeyEvent.VK_ENTER); 
		  rb.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  rb.keyPress(KeyEvent.VK_CONTROL); 
		  rb.keyPress(KeyEvent.VK_V);
		  Thread.sleep(2000);
		  
		  rb.keyRelease(KeyEvent.VK_CONTROL); 
		  rb.keyRelease(KeyEvent.VK_V);
		  Thread.sleep(2000);
		  
		  rb.keyPress(KeyEvent.VK_ENTER); 
		  rb.keyRelease(KeyEvent.VK_ENTER);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		
		  //script to click on the submit button
		
		 WebElement submit=driver.findElement(By.cssSelector("form#formadd div.box-footer>button"));
		 wt.until(ExpectedConditions.elementToBeClickable(submit));
		 submit.click();
		 
		 
		//WebElement close=driver.findElement(By.cssSelector("form#formadd div.modal-header>button"));
		 WebElement close=driver.findElement(By.cssSelector("form#formadd button.close"));
		wt.until(ExpectedConditions.elementToBeClickable(close));
		close.click();
				 
			
		
		 
			 
	

	}

}
