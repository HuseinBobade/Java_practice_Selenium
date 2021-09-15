// Q: What is Synchronization problem in Automation?
// Q: What are the different types of waits available in Selenium WebDriver?


package mypackage;

import java.time.Duration;
import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitExample2_GenericMethod {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
				
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		By eleLocator=By.xpath("//h3[normalize-space()='Selenium']");
		waitForElementWithFluentWait(driver, eleLocator);
		
	}
		
	public static WebElement waitForElementWithFluentWait(WebDriver driver, final By Locator){
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);

				WebElement element = wait.until(new Function<WebDriver, WebElement>() {
				  public WebElement apply(WebDriver driver) {
				    return driver.findElement(Locator);
				  }
				});
				
				
				return element;
		
	}
	
	
}
