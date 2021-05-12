package cucmberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Featurefile
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features/",
		glue="stepDefinations",tags ="@RegressionTest", monochrome=true,
		plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cucumber.xml"})
		
public class TestRunner {
	

}
