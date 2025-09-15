package test;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "hellouser";
		String pass = "typing";
		
		// Launch the Google.com
		WebDriver driver = new ChromeDriver();
						
		//Launch the browser
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
						
//		//User Name field
//		WebElement UserName = driver.findElement(By.id("email"));
//				
//		// Password field
//		WebElement Password = driver.findElement(By.name("pass"));
//				
//		// Login Button
//		WebElement LoginBtn = driver.findElement(By.name("login"));
//				
//		//Enter Username
//		UserName.sendKeys(name);
//				
//		//Enter Password
//		Password.sendKeys(pass);
//				
//		//Click the login Button
//		LoginBtn.click();
//				
//		//Close the browser
//		//driver.close();
//		
//		//Using LinkText
//		//WebElement ForgotPass = driver.findElement(By.linkText("Forgotten passwword?"));
//		
//		//ForgotPass.click();
//		
//		WebElement ForgotPassNew = driver.findElement(By.linkText("Forgotten"));
//		
//		ForgotPassNew.click();
		
		//Tag Name
		
		WebElement Header = driver.findElement(By.tagName("H2"));
		System.out.println(Header.getText());
		
		

	}

}
