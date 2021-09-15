//	What is the Difference Between Actions & Action?
//	What is the Difference Between build() & perform()?

package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionVsActions {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver  driver=new EdgeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act= new Actions(driver);  //Actions is class
		//act.moveToElement(ele).perform();
		
		Action someAction=act.moveToElement(ele).build(); //Action is interface / build will return the action
		someAction.perform(); // perform will complete the action 
		

	}

}
