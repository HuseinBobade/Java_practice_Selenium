//	How to capture tooltip of the Web Element?
//	How to open a link in new tab?
//	How to open URL’s in a multiple tabs & Windows?
//	How to capture Size & Location of the WebElement?

package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TooltipCapture {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='age']"));
		String tooltiptext=inputbox.getAttribute("title");
		System.out.println("Tooltip of your Age input box is : "+tooltiptext);
		
		WebElement TooltipsLink=driver.findElement(By.xpath("//a[text()='Tooltips']"));
		String TooltipsLinktext=TooltipsLink.getAttribute("title");
		System.out.println("Tooltip of Tooltips Link is : "+TooltipsLinktext);
		
		WebElement ThemeRollerLink=driver.findElement(By.xpath("//a[text()='ThemeRoller']"));
		String ThemeRollerLinktext=ThemeRollerLink.getAttribute("title");
		System.out.println("Tooltip of ThemeRoller Link is : "+ThemeRollerLinktext);
		

	}

}
