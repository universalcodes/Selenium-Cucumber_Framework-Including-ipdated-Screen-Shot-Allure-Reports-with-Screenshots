package seleniumWebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basefileautomation.AutomationBaseFile;

public class Exploree extends AutomationBaseFile {

	
	public static void exploreList()
	{
	 WebElement explorelist = browserdriver.findElement(By.xpath("//*[text()='Exploree'])[1]"));
	explorelist.click();
	}
}
