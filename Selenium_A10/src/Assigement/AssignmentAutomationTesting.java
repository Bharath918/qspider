package Assigement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentAutomationTesting {
public static void main(String[] args) throws IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	driver.switchTo().frame(0);

    WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));
    txtBox.sendKeys("Selenium");
    
    File temp = txtBox.getScreenshotAs(OutputType.FILE);
	
	File perm = new File("./ScreenShots/time.png");
	FileHandler.copy(temp, perm);
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	
	WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerframe);
	
	WebElement innerframe = driver.findElement(By.xpath("//iframe"));
	driver.switchTo().frame(innerframe);
	
	WebElement innerbox = driver.findElement(By.xpath("//input[@type='text']"));
	innerbox.sendKeys("Automation");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	   File temp1 = ts.getScreenshotAs(OutputType.FILE);
	   File perm1 = new File("./ScreenShots/image.png");
	   FileHandler.copy(temp1, perm1);

}
}
