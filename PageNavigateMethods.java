//   How to Navigate Back & Forward?
//   How to Refresh Page?
//   What is the difference between get() & navigate.to()?

package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageNavigateMethods {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.get("https://www.amazon.in/");

// How to Navigate Back & Forward?
		
		System.out.println("Navigate back to snapdeal.com");
		driver.navigate().back(); //this will get back to snapdeal.com
		System.out.println("forward to amazon.com");
		driver.navigate().forward(); //this will get forward to amazon.in
		
// How to Refresh Page?		
		
		driver.navigate().refresh();
		
// What is the difference between get() & navigate.to()?--->No difference
// Both methods used to for opening URL in the browser. There is No difference between them
// They are synonyms for one another
// Only difference can found in the parameters 
// get() --accepts only one string parameter
// navigate.to() --accepts string parameter & URL instance as parameter		
		 
		
		
		driver.quit();
		
	}

}
