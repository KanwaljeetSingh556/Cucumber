package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobSearch 
{
	WebDriver driver;
	public JobSearch(WebDriver driver)
	{
		this.driver = driver;
		
		
	}
	
	

	public void enterSkills()
	{
	    driver.findElement(By.xpath("//input[@placeholder = 'Enter skills / designations / companies']")).sendKeys("automation testing selenium");

	}
	
	public void enterLocation()
	{
	    driver.findElement(By.xpath("//input[@placeholder = 'Enter location']")).sendKeys("delhi");
		
	}
	
	public void selectExperience()
	{
		driver.findElement(By.xpath("//span[@class = 'dropArrowDD']")).click();
		   driver.findElement(By.xpath("//span[text() = 'Fresher']")).click();
		
	}
	public void clickSearch()
	{
		   driver.findElement(By.xpath("//div[text() = 'Search']")).click();
		
	}
	
	
}
