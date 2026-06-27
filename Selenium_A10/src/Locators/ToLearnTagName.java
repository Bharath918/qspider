package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {
public static void main(String[] args) throws InterruptedException {
	
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://demowebshop.tricentis.com/");
//	
//    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//    System.out.println(allLinks.size());
//    for(WebElement ele:allLinks) {
//    	
//           String names = ele.getText();
//           System.out.println(names);
    
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	Thread.sleep(5000);
	 List<WebElement> allLinkg = driver.findElements(By.tagName("img"));
	 
	System.out.println(allLinkg.size());
	
    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
    System.out.println(allLinks.size());
    for(WebElement ele:allLinks) {
    	
           String names = ele.getText();
           System.out.println(names);   
    }
      driver.close();
}
}
