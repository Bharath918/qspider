package Assigement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("// a[text() = 'Facebook']")).click();
		
		Set<String> allwinids = driver.getWindowHandles();
		
		for(String id:allwinids) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.equals("https://www.facebook.com/nopCommerce")) {
				System.out.println("displayed");
				
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("bharath@gmail.com");
				driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("bharath@123");
			}
		}

	}

}
