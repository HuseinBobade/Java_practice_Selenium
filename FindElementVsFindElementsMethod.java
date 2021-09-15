/* Question: What is the difference between findElement() and findElements() in Selenium WebDriver? */

// findElement() returns the first matching element on current page, If element is not found then it throws NoSuchElementFoundException
// findElements() returns the multiple/list of matching element on current page, If element is not found then it doesn't throws any Exception,
//					insted it returs 0 zero elements


package mypackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElementsMethod {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Launch URL
		driver.get("https://demo.nopcommerce.com/");	
		
// findElement() -->returns single element (when single element is present at locator mentioned) 
// return type is WebElement
// we can access the element directly


//1: at locator single element was present hence single  element returned
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("Nokia Lumia");
		
//2: at locator multiple elements was present, here findElement() returned first element
		WebElement infoEle=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(infoEle.getText()); //returned first element which is "sitemap"
		
//3: If the element is not present it will return NoSuchElementException
		WebElement ele=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		
	
		
// findElements() -->always returns multiple web-elements
// return type is List<WebElement>
// we need to use iterate list of web-elements to access elements
		
//1: returns multiple web-elements		
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(links.size());
		
//2: we need to use iterate list of web-elements to access		
		for(WebElement e:links) {
			
			System.out.println(e.getText());
		}
	
		
//3: at locator single element was present hence single  element returned
		List<WebElement> logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.size());

//4: If the element is not present it will not return any Exception instead it will return 0(zero) elements 
		List<WebElement> ele1=driver.findElements(By.xpath("//img[@alt='nopCommerce']"));
		System.out.println(ele1.size());
		
		driver.quit();
		

	}

}
