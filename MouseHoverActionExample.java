//		How to Perform Mouse Hover Action?

package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverActionExample {
 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement desktopEle=driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Desktops']"));	
		WebElement macMenuItemEle=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(desktopEle).moveToElement(macMenuItemEle).click().perform(); //Performs Mouse Hover Action
	
		Thread.sleep(2000);
		driver.quit();

	}

}
