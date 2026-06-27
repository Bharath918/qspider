package webdriverMethods;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class ToLearnGetMethod {
//public static void main(String[] args) {
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.myntra.com/");
//	//https://www.myntra.com/
//	
//	String url = driver.getCurrentUrl();
//	System.out.println(url);
//	
//	if(url.equals("https://www.myntra.com/")) {
//	System.out.println("welcome page is displayed");
//	  
//} else {
//	System.out.println("welcome page is not displayed");
//}}}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//https://www.flipkart.com/
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	if(url.equals("https://www.flipkart.com/")) {
	System.out.println("welcome page is displayed");
	  
} else {
	System.out.println("welcome page is not displayed");
}}}
