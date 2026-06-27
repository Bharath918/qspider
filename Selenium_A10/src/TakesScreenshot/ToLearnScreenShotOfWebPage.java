package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnScreenShotOfWebPage {
       public static void main(String[] args) throws IOException {
	
    	   WebDriver driver = new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.get("https://www.amazon.in/");
    	   
    	   TakesScreenshot ts = (TakesScreenshot)driver;
    	   File temp = ts.getScreenshotAs(OutputType.FILE);
    	   File perm = new File("./ScreenShots/image.png");
    	   FileHandler.copy(temp, perm);
}
}
