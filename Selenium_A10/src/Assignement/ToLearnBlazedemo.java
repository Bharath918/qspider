package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBlazedemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		WebElement price = driver.findElement(By.xpath("//td[text()='Aer Lingus']/following-sibling::td[3]"));
		System.out.println(price.getText());

	}

}
