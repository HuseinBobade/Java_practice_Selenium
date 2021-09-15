//	1) What is the difference between frame and iframe?
//	2) How To Handle iframes in Selenium WebDriver?
//	3) How To Switch between multiple iFrames?
//	4) How To Work with Inner iFrames?


package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFramesAndiFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		
//	1) What is the difference between frame and iframe?
//	2) How To Handle iframes in Selenium WebDriver?		
		
		//Thread.sleep(3000);
		//FirstFrame
		System.out.println("Switch to First Fram: ");
		driver.switchTo().frame("packageListFrame");
		System.out.println("Click on org.openqa.selenium link");
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(3000);
		//SecondFrame
		System.out.println("Switch to Second Frame: ");  
		driver.switchTo().frame("packageFrame");
		System.out.println("Click on WebDriver link");
		driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		//ThirdFrame
		System.out.println("Switch to Third Frame: "); 
		driver.switchTo().frame("classFrame");
		System.out.println("Click on Help link");
		//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[8]/a[1]")).click();
		driver.findElement(By.cssSelector("header[role='banner'] li:nth-child(8) a:nth-child(1)")).click();
		driver.switchTo().defaultContent(); 
		
		Thread.sleep(3000);
		driver.quit();

	}

}
