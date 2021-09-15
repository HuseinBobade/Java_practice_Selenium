// Q:  How to handle Dropdown in Selenium WebDriver?
// Q:  What is the use of Select class?
// Q:  How To handle Multiple Dropdowns in a page using Generic Method?



package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='input-country']"));
		
// Q:  How to handle Dropdown in Selenium WebDriver?------> using Select Class		
		Select drpCountry=new Select(drpCountryEle);
		
		
		//built in method
		//drpCountry.selectByVisibleText("Barbados");
		//drpCountry.selectByValue("20");
		//drpCountry.selectByIndex(13);
		
		//selecting option from dropdown without using select methods
		
		
		List<WebElement> alloptions=drpCountry.getOptions();
		
		for(WebElement option:alloptions) {
		
			if(option.getText().equals("Cuba")) {
				
				option.click();
				break;
			}
			
		}
		

	}

}
 