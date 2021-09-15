//		How to Perform Drag and Drop Action on images?

package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDragAndDropImages {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
	
		WebElement img1 =driver.findElement(By.xpath("//li[1]"));
		WebElement img2 =driver.findElement(By.xpath("//li[2]"));
		WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(img1, trash).perform(); //Performs Drag and Drop Action
		act.dragAndDrop(img2, trash).perform(); //Performs Drag and Drop Action
	}

}
