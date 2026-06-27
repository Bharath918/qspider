package IFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleIFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.rediff.com/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='Rediff Money Widget']"));
		driver.switchTo().frame(frame);
//		driver.switchTo().frame("moneyiframe");
		
	driver.findElement(By.xpath("//span[text()='BSE']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.partialLinkText("Sign in")).click();
	
		
		
		
	}

}