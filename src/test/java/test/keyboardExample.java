package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class keyboardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch the Google.com
		WebDriver driver = new ChromeDriver();
												
		//Open Facebook
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement search = driver.findElement(By.xpath("//*[@title =\"Search\"]"));
		search.sendKeys("today is tuesday");
		
		search.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		
		//search.sendKeys("what is the day today?");

	}

}
