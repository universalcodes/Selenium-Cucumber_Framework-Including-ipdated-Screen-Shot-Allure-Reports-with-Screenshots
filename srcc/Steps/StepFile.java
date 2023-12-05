package Steps;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basefileautomation.AutomationBaseFile;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.qameta.allure.Allure;
import screenprints.ScreenshotTakenn;
import screenrecorderutility.ScreenRecorderUtil;
import seleniumWebelements.Exploree;
import seleniumWebelements.SearchProduct;

public class StepFile extends AutomationBaseFile{
	
	@Given("^Start Recording & Navigate to the URL$")
	public static void step1() throws Exception
	{
		ScreenRecorderUtil.startRecord("TestCase_Execution_Result");
		launchbrowser();
		ScreenshotTakenn.ssTaken();
	}
	
	@And("^Explore the List$")
	public static void step2() throws Exception
	{
		    

		Exploree.exploreList();

	}
	
	
	@And("^Search some product$")
	public static void step3() throws Exception
	{
		    

		SearchProduct.searchProducts();

	}
	@Given("^Stop Recording$")
	public static void step4() throws Exception
	{
		ScreenRecorderUtil.stopRecord();

	}
	@After
	public void teardown(Scenario checktestcase) throws SecurityException, IOException
	{
		
		if (checktestcase.isFailed())
		{
	         byte[] createss = (((TakesScreenshot) browserdriver)).getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(createss));
		}
		browserdriver.quit();
	}

}
