//		How To Perform Mouse Operations in Selenium WebDriver?
//		How to Perform Right click Action?
//		How to Perform Double click Action?
//		How to Perform Drag and Drop Action?
//		How to Perform Mouse Hover Action?
	
package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseClickActions_RightClick {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(button).perform(); //Perform Right click Action
		

	}

}
