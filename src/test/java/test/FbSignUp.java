package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FbSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			

			// Launch the Google.com (link)
			WebDriver driver = new ChromeDriver();
							
			//Launch the browser
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			WebElement SignUp = driver.findElement(By.linkText("Create new account"));
			SignUp.click();
			
			// First Name
			WebElement FirstName = driver.findElement(By.cssSelector("input[name=firstname]"));
			FirstName.sendKeys("Camilla");
			
			
			// Last Name
			WebElement LastName = driver.findElement(By.cssSelector("input[name=lastname]"));
			LastName.sendKeys("Naval");
						
			
			// Enter Date
			
			WebElement Date = driver.findElement(By.cssSelector("select#day"));
			Select dDate = new Select(Date);
			dDate.selectByVisibleText("11");
			
			//6. Enter Month using CSS
			WebElement Month = driver.findElement(By.cssSelector("select#month"));
			Select ddMonth = new Select(Month);
			ddMonth.selectByVisibleText("Dec");
			
			
			//7. Enter Year using CSS
			WebElement Year = driver.findElement(By.cssSelector("select#year"));
			Select ddYear = new Select(Year);
			ddYear.selectByVisibleText("2002");
			
			// Gender Selection
			WebElement gender = driver.findElement(By.cssSelector("input[value='1']"));
			gender.click();
			
			//Mobile Number
			WebElement Number = driver.findElement(By.cssSelector("input[name=reg_email__]"));
			Number.sendKeys("12345678");
			
			//New Password
			WebElement create = driver.findElement(By.cssSelector("input[name=reg_passwd__]"));
			create.sendKeys("newpass");
						
			
			
			
			
			

	}

}
