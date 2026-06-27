package Popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnFileUploadPopups {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
		
		File f = new File("file:///C:/Users/manju/OneDrive/Desktop/Bharath%20Reddy.pdf");
		
		String abs = f.getAbsolutePath();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(abs);

	}

}
