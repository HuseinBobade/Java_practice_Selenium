//		How To Locate links in Selenium WebDriver?
//		What is the difference between LinkText() and PartialLinkText()?
//		How to capture all the links from Web Page?
//		What is Broken Link? How to check it?


package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksRelatedAllQuestions {

	public static void main(String[] args) {
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

// 1.How To Locate links in Selenium WebDriver?
		//--Links are located by anchor tag a, this tag has href attribute and inner text 
		//-- this iinner text is used in linkText() and partialLinkText() methods
		
// 2. What is the difference between LinkText() and PartialLinkText()?		
		//driver.findElement(By.linkText("Today's Deals")).click(); //matches exact passed text, if found performs desired action on element
		//driver.findElement(By.partialLinkText("Deals")).click(); // matches passed text if link found with part of passed text then performs desired action on element

// 3. How to capture all the links from Web Page?
		 
	      List<WebElement>  all_links=driver.findElements(By.tagName("a"));
	      System.out.println("Total links present in aplication are: "+all_links.size());
	      
	      //Using classic for loop
	      /*
	      for(int i=0; i<=all_links.size();i++) {
	    	  
	    	  System.out.println(all_links.get(i).getText());
	    	  System.out.println(all_links.get(i).getAttribute("href"));
	    	  
	      }*/
	      
	    //Using enhanced for loop
	      
	      for(WebElement link:all_links) {
	    	  
	    	  System.out.println(link.getText());
	    	  System.out.println(link.getAttribute("href"));
	      }
	      
	      driver.quit();
		
		
	}

}
