package Assigement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		
		Set<String> allwinids = driver.getWindowHandles();
		
		for(String id:allwinids) {
			
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.equals("https://x.com/nopCommerce")) {
			System.out.println("displayed");
			driver.findElement(By.xpath("//span[text()='Create account']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='username_or_email']")).sendKeys("89561234");
			
		}
		}
	}

}
