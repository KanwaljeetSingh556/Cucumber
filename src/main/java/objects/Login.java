package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login
{
	WebDriver driver;
	public Login(WebDriver driver) 
	{
		this.driver = driver;
		
		
	}
	
	public void loginclick() 
	{
		driver.findElement(By.xpath("//div[text()= 'Login']")).click();
		
	}
	
	public void enterUsernameAndPassword(String username,String password)
	{
		driver.findElement(By.xpath("//input[@placeholder= 'Enter your active Email ID / Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder= 'Enter your password']")).sendKeys(password);

	}
	
	public void clickbutton()
	{
		driver.findElement(By.xpath("//button[text() = 'Login']")).click();
	}
	

}
