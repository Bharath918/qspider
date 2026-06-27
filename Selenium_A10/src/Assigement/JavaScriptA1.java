package Assigement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptA1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles",Keys.ENTER);
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].value='mobiles'",text);
            WebElement click = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
           
           WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
  	 
   	    wait.until(ExpectedConditions.elementToBeClickable(click));
   	    click.click();
		 WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Motorola razr')]"));
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()", ele);

	}

	

	
	}