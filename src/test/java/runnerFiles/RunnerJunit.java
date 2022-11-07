package runnerFiles;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		
features = "Feautures/naukri.feature"
,glue= {"step_definition_files"},
monochrome = true,
dryRun = false,
plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"},
//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"},
tags= "@Login or @Register",
publish = true


)

public class RunnerJunit 


{
	

}
