package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Features",
                 glue ="StepDefinitons",
                 plugin = {
             	        "pretty:target/prettyReport.txt",
             	        "html:target/cucumber.html", 
             	        "json:target/cucumber.json", 
             	        "rerun:target/rerun.txt",
             	        "junit:target/junit-report.xml",
                		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // for advance version user 7 
             	        },
                 dryRun= false,
                 monochrome=true
                
                 )

public class Test_Runner {
	

}
