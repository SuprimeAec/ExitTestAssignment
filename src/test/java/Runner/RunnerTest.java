package Runner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
        features={"src/test/java/Features"},
        glue={"StepDefinitions","Hook"},
        tags= {"@Access,@Animation,@App,@Content,@Graphics,@Hardware,@Media"}
    )



public class RunnerTest extends AbstractTestNGCucumberTests{
    

}