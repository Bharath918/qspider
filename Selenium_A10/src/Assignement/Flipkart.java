package Assignement;

import java.time.Duration;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("mobiles",Keys.ENTER);
		
		driver.findElement(By.xpath("(//div[text()='Bank Offer'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement discount = driver.findElement(By.xpath("(//div[contains(text(),'%')])[3]"));
	      String dis = discount.getText();
    System.out.println(dis);
	}

}