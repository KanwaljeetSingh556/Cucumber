package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Register 
{
	WebDriver driver;
	public Register(WebDriver driver) 
	{
		this.driver = driver;
		
	}
	
	public void clickOnRegister() 
	{
		driver.findElement(By.xpath("//div[text()='Register']")).click();
	}
	
	public void fillDetails() 
	{
		driver.findElement(By.xpath("//input[@placeholder='What is your name?']")).sendKeys("kawal");
		driver.findElement(By.cssSelector("input#email")).sendKeys("kawal@123");	
		
	}
	
	public void RegisterNow() 
	{
		WebElement r = driver.findElement(By.xpath("//button[text()='Register Now']"));
		Actions a = new Actions(driver);
		a.moveToElement(r);
		r.click();
		
		
	}

}
