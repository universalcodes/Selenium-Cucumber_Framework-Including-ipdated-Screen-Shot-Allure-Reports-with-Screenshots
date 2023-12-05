package screenprints;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basefileautomation.AutomationBaseFile;

public class ScreenshotTakenn extends AutomationBaseFile {
	
	public static void ssTaken() throws SecurityException, IOException
	{
		
		LocalDateTime currentdate = LocalDateTime.now();
		System.out.println(currentdate);
		
		
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new java.util.Date());
		 
		
	
		
         String sspath = "G:\\Framework Manish Batch\\WebApplicationSeleniumss\\screenprints\\" + timestamp +" test.jpg";
	
         System.out.println(sspath);
         File createss = (((TakesScreenshot) browserdriver)).getScreenshotAs(OutputType.FILE);
    
		    org.openqa.selenium.io.FileHandler.copy(createss,new File(sspath));
	    
	
	}
	
	public static void main(String[] args) throws SecurityException, IOException {
		ssTaken();
	}
}

