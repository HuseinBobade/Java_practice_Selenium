
//Question: How to Check WebElement is Displayed, Enabled and Selected?
//Question: What are the Conditional Methods in Selenium WebDriver?


package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfElement {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement searchItem=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		//isDisplayed() -- isEnabled() 
		
		System.out.println("IsDisplayed Status for SearchItem box: "+searchItem.isDisplayed());
		System.out.println("IsEnabled Status for SearchItem box: "+searchItem.isEnabled());
		
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//isSelected() - is used for radioButtons, check Boxes, dropdowns
		
		System.out.println("IsSelected Status of Male Radio Button: "+male.isSelected());
		System.out.println("IsSelected Status of FeMale Radio Button: "+female.isSelected());
		
		System.out.println("Select Male Radio Button");
		male.click();
		System.out.println("IsSelected Status of Male Radio Button: "+male.isSelected());
		System.out.println("IsSelected Status of FeMale Radio Button: "+female.isSelected());
		
		System.out.println("Select FeMale Radio Button");
		female.click();
		System.out.println("IsSelected Status of Male Radio Button: "+male.isSelected());
		System.out.println("IsSelected Status of FeMale Radio Button: "+female.isSelected());
		
		//driver.close()
		driver.quit();

	}

}
