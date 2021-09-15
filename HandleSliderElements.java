//	How To Handle Slider?
//	How To Find Location & Size of the Web Element?
//	What is the Difference Between Actions & Action?
//	What is the Difference Between build() & perform()?

package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSliderElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver  driver=new EdgeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement minSlider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Location of Minimum SLider: "+minSlider.getLocation());
		System.out.println("height & width of Minimum SLider: "+minSlider.getSize());
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(minSlider, 100, 0).perform();
		
		System.out.println("Location of Minimum SLider: "+minSlider.getLocation());
		System.out.println("height & width of Minimum SLider: "+minSlider.getSize());
		
		
		WebElement maxSlider=driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(maxSlider, -100, 0).perform();
		
		Thread.sleep(2000);
		driver.quit();


	}

}
