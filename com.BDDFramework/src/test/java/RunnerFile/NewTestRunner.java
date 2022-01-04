package RunnerFile;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
( features ={"C:\\Users\\Ronak Kumar Singh\\eclipse-workspace\\com.BDDFramework\\src\\test\\java\\FeatureFiles"},
glue={"C:\\Users\\Ronak Kumar Singh\\eclipse-workspace\\com.BDDFramework\\src\\test\\java\\StepDefinitions\\NewLoginSteps.java"},
monochrome = true,
strict=true,
plugin={"pretty","json:Report2/Cucumber.json",
		"junit:Report2/XMLCucumber.xml",
		"html:Report2/HTMLCucumber.html"
}
		)

public class NewTestRunner {

}
