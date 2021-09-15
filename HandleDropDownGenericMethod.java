// Q:  How To handle Multiple Drop downs in a page using Generic Method?

package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownGenericMethod {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//Approach1 
		
//		WebElement country=driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']"));
//		Select countrydrp=new Select(country);
//		countrydrp.selectByVisibleText("Angola");
		
		//Approach2 ---Using Generic Method
		
		WebElement country=driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']"));
		selectOptionFromDropDown(country,"Austria");
			
		//driver.quit();
	
	}
		
	public static void selectOptionFromDropDown(WebElement ele,String value) {
		
		Select drp=new Select(ele);
		
		List<WebElement> alloptions=drp.getOptions();
		
		for(WebElement option:alloptions) {
			
			if(option.getText().equals(value)) {
				
				option.click();
				System.out.println("Option selected successfully");
				break;
				
			}			
			
		}
				
	}
	
}