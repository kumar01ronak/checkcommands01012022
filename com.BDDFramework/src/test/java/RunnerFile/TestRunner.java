package RunnerFile;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
( features= {"C:\\Users\\Ronak Kumar Singh\\eclipse-workspace\\com.BDDFramework\\src\\test\\java\\FeatureFiles"},
glue= {"StepDefinitions"},
monochrome=true,
dryRun=false,//tells missing steps without running the program
//strict=true//it will run program but it will skip that missing  part/code
	plugin={"pretty","json:Report/Cucumber.json",
			"junit:Report/XMLCucumber.xml",
			"html:Report/HTMLCucumber.html"
			
	}
		)
public class TestRunner {

}
