//How to capture Screenshot
//Full Page Screenshot
//capture screenshot of section/portion of webpage
//capture screenshot of specific WebElement


package mypackage;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Full Page Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\index.png");
		FileHandler.copy(src, trg);
		
		//FileUtils.copyFile(src, trg);
		
		//capture screenshot of section/portion of webpage
		WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File scrnshotsrc=featuredProducts.getScreenshotAs(OutputType.FILE);
		File scrnshottrg= new File(".\\screenshots\\featuredProducts.png");
		FileHandler.copy(scrnshotsrc, scrnshottrg);
		
		//capture screenshot of specific WebElement
		WebElement logoElement=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File logosrc=logoElement.getScreenshotAs(OutputType.FILE);
		File logotrg =new File(".\\screenshots\\logo.png");
		FileHandler.copy(logosrc, logotrg);
		
		driver.close();

	}

}
