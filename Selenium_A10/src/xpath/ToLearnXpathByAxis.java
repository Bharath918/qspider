package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxis {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/manju/OneDrive/Desktop/Movie.html");
		
		WebElement c1 = driver.findElement(By.xpath("//td[text()='Dhurandhar']/following-sibling::td[2]"));
		
		System.out.println("collection of dhurandhar :"+c1.getText());

        WebElement c2 = driver.findElement(By.xpath("//td[text()='Toxic']/following-sibling::td[2]"));
		
		System.out.println("collection of Toxic :"+c2.getText());
		
		
        WebElement c3 = driver.findElement(By.xpath("//td[text()='Youth']/following-sibling::td[2]"));
		
		System.out.println("collection of Youth :"+c3.getText());
		
		
		System.out.println("..............................................................................");
		
		WebElement i1 = driver.findElement(By.xpath("//td[text()='Dhurandhar']/following-sibling::td[1]"));
		System.out.println("IMDB Ratings of dhurandhar :"+i1.getText());
		
		WebElement i2 = driver.findElement(By.xpath("//td[text()='Toxic']/following-sibling::td[1]"));
		System.out.println("IMDB Ratings of Toxic :"+i2.getText());
		
		WebElement i3 = driver.findElement(By.xpath("//td[text()='Youth']/following-sibling::td[1]"));
        System.out.println("IMDB Ratings of Youth :"+i3.getText());
        
        System.out.println("..............................................................................");
        
        
		
	}

}
