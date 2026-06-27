package synchronization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait {

	public static void main(String[] args) throws IOException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//img[@alt='iphone']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("111111");
		
		
//		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
//		
//		File temp = ele.getScreenshotAs(OutputType.FILE);
//		File perm = new File("./ScreenShots/"+time+".png");
//		FileHandler.copy(temp, perm);
		
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root')]"));
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		
		WebElement pri = driver.findElement(By.xpath("//p[text()='Not Deliveriable.']"));
		System.out.println(pri.getText());
		
	}

}