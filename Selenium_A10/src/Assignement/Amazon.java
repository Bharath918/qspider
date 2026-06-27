package Assignement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://www.amazon.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("asus vivobook",Keys.ENTER);
		 
		 
		 List<WebElement> laptops = driver.findElements(By.xpath("//span[contains(text(),'Vivobook 16 Laptop')]"));
		 for(WebElement laptop:laptops) {
			 System.out.println(laptop.getText());
		 }
		 
		 
		 List<WebElement> prices = driver.findElements(By.xpath("//span[contains(text(),'Vivobook 16 Laptop')]/../../../..//span[contains(text(),'INR')]"));
		  for(WebElement price:prices) {
			  System.out.println(price.getText());
		  }
	}

}
