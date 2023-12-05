package basefileautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationBaseFile {
	
	public static WebDriver browserdriver;
	
	
	static String configfileurl = "G:\\Framework Manish Batch\\WebApplicationSeleniumss\\srcc\\configFolder\\testdata.properties";
	
	static Properties loadconfigfile = new Properties();
	
	
	public static void launchbrowser() throws IOException {
		FileInputStream filepath = new FileInputStream(configfileurl);
		loadconfigfile.load(filepath);
		String browsername = loadconfigfile.getProperty("Browser");
		System.out.println(browsername);
		String webaddress = loadconfigfile.getProperty("Address");
		System.out.println(webaddress);
		
		if(browsername.equalsIgnoreCase("Firefox"))
		{
			AutomationBaseFile.browserdriver = new FirefoxDriver();
			browserdriver.get(webaddress);
		}
		else if (webaddress.equalsIgnoreCase("https://muzickart.com/")) {
			browserdriver = new FirefoxDriver();

			
		}
		else if (webaddress.equalsIgnoreCase("https://muzickart.com/")) {
			browserdriver = new EdgeDriver();

			
		}
	
	}



}
