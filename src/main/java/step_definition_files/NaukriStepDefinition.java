package step_definition_files;

import javax.swing.JScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.JobSearch;
import objects.Login;
import objects.Register;

public class NaukriStepDefinition 
{
	ChromeDriver driver;
	JobSearch js ;
	Login l;
	Register r;
	String username;
	String password;



@Before
public void beforeHook() 
{
	System.out.println("this will execute before every scenario");
	
}
@After
public void AfterHook() 
{
	System.out.println("this will execute after every scenario");
	
}
@BeforeStep
public void beforeStepHook()
{
	System.out.println("this will execute before every step");

}

@AfterStep
public void AfterStepHook()
{
	System.out.println("this will execute After every step");

}

@Given("open up the chromebrowser")
public void open_up_the_chromebrowser()
{
	
 WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
 driver.manage().window().maximize();
  
}

@Given("enter the url in address bar")
public void enter_the_url_in_address_bar() 
{
	driver.get("https://www.naukri.com/");

}

@When("click on enter skills field and type the skills")
public void click_on_enter_skills_field_and_type_the_skills() 
{
	js = new JobSearch(driver);
	js.enterSkills();
    
    
}

@When("click on enter location  and type location")
public void click_on_enter_location_and_type_location()
{
	js = new JobSearch(driver);
js.enterLocation();
  
}

@When("select experience from dropdown")
public void select_experience_from_dropdown() {
	js = new JobSearch(driver);
js.selectExperience();
   
}

@Then("click on search button")
public void click_on_search_button() 
{
	js = new JobSearch(driver);
    js.clickSearch();
}

@Given("click on login link")
public void click_on_login_link() 
{
	l = new Login(driver);
	l.loginclick();
	
}

@And("enter ([^\"]*) and ([^\\\"]*)$")
public void enter_username_and_password(String username,String password) throws InterruptedException 
{
	
	Thread.sleep(2000);
	l = new Login(driver);
	l.enterUsernameAndPassword(username,password);
	
}

@When("click on login button")
public void login()
{
	l = new Login(driver);
	l.clickbutton();
	
}
@And("click on register link")
public void click_on_register_Link ()
{
	r= new Register(driver);
	r.clickOnRegister();
	
	
}
@And("fill up the details")
public void fill_up_the_details() throws InterruptedException 
{
	driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	r= new Register(driver);
	r.fillDetails();	
}

@Then("click on register button")
public void click_on_register_button()
{
	r= new Register(driver);
	r.RegisterNow();
	
}







}
