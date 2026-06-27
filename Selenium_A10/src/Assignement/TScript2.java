package Assignement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import POM.RegisterPage;
import POM.WelcomePage;

public class TScript2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis=new FileInputStream("./TestData/CommonData.Properties");
		Properties pop=new Properties();
		pop.load(fis);
		
		String url = pop.getProperty("url");
		System.out.println(url);
		String gender = pop.getProperty("Gender");
		String Fst = pop.getProperty("firstname");
		String Lst = pop.getProperty("lastname");
		String email = pop.getProperty("email");
		String pass = pop.getProperty("password");
		String Cpass = pop.getProperty("confirmpassword");
		
		driver.get(url);
		WelcomePage wp=new WelcomePage(driver);
		wp.getReglink().click();
		RegisterPage rgp=new RegisterPage(driver);
		
		rgp.getGender().click();
		rgp.getFirstName().sendKeys(Fst);
		rgp.getLastName().sendKeys(Lst);
		rgp.getEmail().sendKeys(email);
		rgp.getPassword().sendKeys(pass);
		rgp.getConfirmPassword().sendKeys(Cpass);
		rgp.getRegister_button().click();

		TakesScreenshot ts = (TakesScreenshot)driver;
 	   File temp = ts.getScreenshotAs(OutputType.FILE);
 	   File perm = new File("./ScreenShots/image.png");
 	   FileHandler.copy(temp, perm);
	}

}
