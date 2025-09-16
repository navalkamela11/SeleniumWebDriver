package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ParaBankRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch the Google.com
		WebDriver driver = new ChromeDriver();
						
		//Launch the browser
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement Register = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		Register.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='customer.firstName']"));
		FirstName.sendKeys("Camilla");
		
		WebElement LastName = driver.findElement(By.xpath("//input[@class='input' and @name='customer.lastName']"));
		LastName.sendKeys("Naval");

		WebElement Address = driver.findElement(By.xpath("//input[@name='customer.address.street']"));
		Address.sendKeys("Cainta");
		
		WebElement City = driver.findElement(By.xpath("//input[@name='customer.address.city']"));
		City.sendKeys("Rizal");
		
		WebElement State = driver.findElement(By.xpath("//input[@name='customer.address.state']"));
		State.sendKeys("....");
		
		WebElement ZipCode = driver.findElement(By.xpath("//input[@class='input' and @name='customer.address.zipCode']"));
		ZipCode.sendKeys("1234");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@class='input' and @name='customer.phoneNumber']"));
		Phone.sendKeys("0000");
		
		WebElement SSN = driver.findElement(By.xpath("//input[@name='customer.ssn']"));
		SSN.sendKeys("....");
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='customer.username']"));
		UserName.sendKeys("hellousername");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='customer.password']"));
		Password.sendKeys("pass");
		
		WebElement confirm = driver.findElement(By.xpath("//input[@name='repeatedPassword']"));
		confirm.sendKeys("pass");
		
		WebElement register = driver.findElement(By.xpath("//input[@value='Register']"));
		//register.click();
		
		
		
		
		
		
		
		
		
	}

}
