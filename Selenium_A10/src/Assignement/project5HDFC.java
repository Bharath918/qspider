package Assignement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class project5HDFC {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.hdfc.bank.in/");
		
		driver.findElement(By.xpath("//button[@aria-label='Login']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='dropdown_list'])[2]")).click();

		Thread.sleep(4000);

		Set<String> allwinids = driver.getWindowHandles();
		for (String id : allwinids) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if (url.equals(
					"https://netbankingforbusiness.hdfc.bank.in/login?icid=website_organic_nav_login-netbankingforbusiness:link:netbankingforbusiness")) {
				driver.findElement(By.id("login_username")).sendKeys("rahu1234");
				driver.findElement(By.id("login_password")).sendKeys("jbdnjnowenij");
				driver.findElement(By.xpath(" //span[contains(text(), 'Sign In ')]")).click();
			}
		}

	}

}
