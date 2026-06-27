package Assigement;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchRedBus {
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");
//			System.out.println("the souce code of redbus");
//			System.out.println(driver.getPageSource());
		
			
			
			
			
			String title = driver.getTitle();
			System.out.println(title);
			if (title.equals("Bus Booking Online and Train Tickets at Lowest Price - redBus")) {
				System.out.println("WP is displayed");
				
				
				Point position = driver.manage().window().getPosition();
				System.out.println(position.getX());
				System.out.println(position.getY());
				
				 Dimension size = driver.manage().window().getSize();
				 System.out.println(size.height);
				 System.out.println(size.width);
				 
				 driver.quit();
			}

		}
	}