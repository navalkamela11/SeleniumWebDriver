package test;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SwagLabLogin {
	

	public static void main(String[] args) {
		
		String uname = "standard_user";
		String pwd = "secret_sauce";
		
		
		// TODO Auto-generated method stub
		
		// Launch the Google.com
		WebDriver driver = new ChromeDriver();
				
		//Launch the browser
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Fetch name and password
		
		WebElement Cred = driver.findElement(By.className("login_credentials"));
		
		System.out.println(Cred.getText());
				
		//User Name field
		WebElement UserName = driver.findElement(By.id("user-name"));
		
		// Password field
		WebElement Password = driver.findElement(By.name("password"));
		
		// Login Button
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		
		//Enter Username
		UserName.sendKeys(uname);
		
		//Enter Password
		Password.sendKeys(pwd);
		
		//Click the login Button
		LoginBtn.click();
		
		//Close the browser
		driver.close();
		
	}

}
