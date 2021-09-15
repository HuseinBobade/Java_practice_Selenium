// Q: What is Synchronization problem in Automation?
// Q: What are the different types of waits available in Selenium WebDriver?


package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
				
// Q: What is Synchronization problem in Automation?	
		
	//automation script execution is faster than the application, hence sometimes the elements on which we want to perform action 	
	//not loaded and execution happens which causes exception and termination of execution, this is call synchronization problem
	//to balance between automation script and application wait methods are present	
		 

// Q: What are the different types of waits available in Selenium WebDriver?		
		
		//2. Explicit wait
		//explicit wait is specific to perticular element
		//we need to use different for each elenment
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Selenium']")));
		element.click();
		
			
		
		
 
	}

}
