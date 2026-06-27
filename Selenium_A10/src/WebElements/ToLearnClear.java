package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='username']"));
		ele.clear();
		ele.sendKeys("Reddy");
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='password']"));
		ele2.clear();
		ele2.sendKeys("Reddy@123");
		
	}

}
