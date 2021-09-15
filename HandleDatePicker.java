// Q: How To Handle Date Pickers?


package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDatePicker {

	public static void main(String[] args) {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		String year="2021";
		String month="Dec";
		String date="12";
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		while(true){
			
			String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText(); //Sept 2021
			
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year)) {
				break ;
			}else {
				driver.findElement(By.xpath("//button[normalize-space()='>']")).click();	
			}
						
		}
		
		//Date selection
		List<WebElement> dateSelectEle=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		for(WebElement ele:dateSelectEle) {
			
			String dt=ele.getText();
			if(dt.equals(date)) {
				
				ele.click();
				System.out.println("Expected date selected successfully");
				break;
			}
		}
		
	}

}
