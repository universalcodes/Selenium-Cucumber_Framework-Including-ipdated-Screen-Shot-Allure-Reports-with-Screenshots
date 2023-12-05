package seleniumWebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basefileautomation.AutomationBaseFile;

public class SearchProduct extends AutomationBaseFile{
	
	public static void searchProducts()
	{
		WebElement searchtheproduct = browserdriver.findElement(By.xpath("//*[text()='Search']"));
		searchtheproduct.click();
	}
}
