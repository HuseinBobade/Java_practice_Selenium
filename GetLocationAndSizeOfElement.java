//	How to capture Size & Location of the WebElement?

package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocationAndSizeOfElement {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement searchele=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		//Method 1
		System.out.println("Location(x,y): "+searchele.getLocation());
		System.out.println("Location(x): "+searchele.getLocation().getX());
		System.out.println("Location(y): "+searchele.getLocation().getY());
		
		//Method 2
		System.out.println("Location(x): "+searchele.getRect().getX());
		System.out.println("Location(y): "+searchele.getRect().getY());
		
		//Method 1
		System.out.println("size(heigh,width): "+searchele.getSize());
		System.out.println("size(heigh): "+searchele.getSize().getHeight());
		System.out.println("size(width): "+searchele.getSize().getWidth());
		
		//Method 2
		System.out.println("size(heigh): "+searchele.getRect().getDimension().getHeight());
		System.out.println("size(width): "+searchele.getRect().getDimension().getWidth());
		
		driver.close();

	}

}
