package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Dimension size = driver.findElement(By.xpath("//input[@value='Search']")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		System.out.println(".....................................................................");
		
		Point coordinates = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		System.out.println(coordinates.getX());
		System.out.println(coordinates.getY());

	}

}
