//	How to open a link in new tab?

package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		WebElement registerLink=driver.findElement(By.linkText("Register"));
		registerLink.sendKeys(tab);
		
	}

}
