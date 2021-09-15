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

public class ExplicitWaitExample2 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
				
// Q: What is Synchronization problem in Automation?	
		
	//automation script execution is faster than the application, hence sometimes the elements on which we want to perform action 	
	//not loaded and execution happens which causes exception and termination of execution, this is call synchronization problem
	//to balance between automation script and application wait is used
	// implicit wait, Explicit 	wait, Fluent wait
		 

// Q: What are the different types of waits available in Selenium WebDriver?		
		
		//2. Explicit wait
		//explicit wait is specific to perticular element
		//we need to use different for each elenment
		
		
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		By elementLocator=By.xpath("//h3[normalize-space()='Selenium']");
		waitForElementPresent(driver,elementLocator,10).click();
		
			
	}
	
	//Using Generic method
	
	public static WebElement waitForElementPresent(WebDriver driver, By Locator, int timeout){
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		
		return driver.findElement(Locator);
		
	}
		
	
	
	

}
