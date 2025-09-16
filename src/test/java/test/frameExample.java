package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class frameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch the Google.com
		WebDriver driver = new ChromeDriver();
																
		//Open Demo QA
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Switch to the frame
		
		driver.switchTo().frame("frame1");
		WebElement FrameHeader1 = driver.findElement(By.tagName("h1"));
		System.out.println(FrameHeader1.getText());
		
		driver.switchTo().defaultContent();
		
		//from frame 1 to frame 2
		driver.switchTo().frame("frame2");
		WebElement FrameHeader2 = driver.findElement(By.tagName("h1"));
		System.out.println(FrameHeader2.getText());
		

	}

}
