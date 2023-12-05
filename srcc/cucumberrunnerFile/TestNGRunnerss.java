package cucumberrunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "G:\\Framework Manish Batch\\WebApplicationSeleniumss\\srcc\\FeatureFile\\Test.feature",
		glue = "Steps",
		dryRun = false,
		tags = "@firsttestcase",	
		plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)


public class TestNGRunnerss extends AbstractTestNGCucumberTests{
	

}
