package test;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class FindElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch the Google.com
		WebDriver driver = new ChromeDriver();
										
		//Open Facebook
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Create your account
		WebElement SignUp = driver.findElement(By.linkText("Create new account"));
		SignUp.click();
		
		// Print the values of all months using xpath
		List<WebElement> all = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		for(WebElement month:all) {
			System.out.println(month.getText());
		}
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]/option[@selected='1']"));
		
		
		
		
	}

}
