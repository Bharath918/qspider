package Assignement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abhibusassignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Leaving From']")).sendKeys("hydrabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[contains(@class,'collection-item auto')])[2]")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Going To']")).sendKeys("banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[contains(@class,'collection-item auto')])[1]")).click();
		
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
              
		Thread.sleep(2000);
	
		List<WebElement> BusNames = driver.findElements(By.xpath("//h5[@class='title']"));
		
		for(WebElement buses:BusNames) {
			System.out.println(buses.getText());
		}
		
		Thread.sleep(2000);
		
		
		List<WebElement> price = driver.findElements(By.xpath("//span[contains(@class,'fare text-neutral')]"));
		for(WebElement prices:price) {
			System.out.println(prices.getText());
		}
		
	
		List<WebElement> depart = driver.findElements(By.xpath("//span[contains(@class,'departure-time text')]"));
		for(WebElement departure:depart) {
			
			System.out.println("Departure time "+departure.getText());
		}
		
		
		
		List<WebElement> arri = driver.findElements(By.xpath("//span[contains(@class,'arrival-time text')]"));
		for(WebElement arrival:arri) {
			System.out.println("Arrival time "+arrival.getText());
		}
		
		
		List<WebElement> seat = driver.findElements(By.xpath(" //div[contains(@class,'row seat-info bd-su')]"));
		for(WebElement seats:seat) {
			System.out.println(seats.getText());
		}
		
	}

}
