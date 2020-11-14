package AskuitySolution.AskuitySolution.EcommerceProject;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/AskuitySolution/AskuitySolution/EcommerceProject/OrderProduct.feature", 
		plugin={"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
		monochrome = true, 
		strict = true, 
		dryRun = false, 
		glue = {"src/test/java/AskuitySolution/AskuitySolution/Common", "src/test/java/AskuitySolution/AskuitySolution/EcommerceProject"}, 
		tags = {"@orderItem"}			
		)
public class TestRunner {

}
