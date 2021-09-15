package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleInnerFrames1 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult"); // switching to parent frame
		driver.switchTo().frame(0);  			// switching to inner frame
		
		String innertext=driver.findElement(By.xpath("//h1[normalize-space()='This page is displayed in an iframe']")).getText();
		System.out.println("Text in innerFrame is: "+innertext);
		
		driver.switchTo().parentFrame();
		String parentFrameText=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText();
		System.out.println("Parent Frame text is: "+parentFrameText);
	}

} 
