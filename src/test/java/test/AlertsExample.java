package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch the Google.com
		WebDriver driver = new ChromeDriver();
														
		//Open Demo QA
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// First Button
		WebElement Button1 = driver.findElement(By.id("alertButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Button1 );
		Button1.click();
		
		// Accept 
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		
		// Third Button
		WebElement Button3 = driver.findElement(By.id("confirmButton"));
		Button3.click();
		
		Thread.sleep(3000);
		
		// Cancel
		alt.dismiss();
	}

}
