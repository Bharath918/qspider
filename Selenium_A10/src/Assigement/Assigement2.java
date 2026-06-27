package Assigement;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Assigement2 {
		public static void main(String[] args) {
		     WebDriver driver  = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("https://demowebshop.tricentis.com/");
		     
		     driver.findElement(By.className("ico-register")).click();
		     driver.findElement(By.id("gender-male")).click();
		     driver.findElement(By.id("FirstName")).sendKeys("BHARATH");
		     driver.findElement(By.id("LastName")).sendKeys("M");
		     driver.findElement(By.id("Email")).sendKeys("bharath@gmail.com");
		     driver.findElement(By.id("Password")).sendKeys("REDDY");
		     driver.findElement(By.id("ConfirmPassword")).sendKeys("REDDY");
		}

	
	
}

