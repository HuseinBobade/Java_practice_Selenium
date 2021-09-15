// Handling DOB datepicker

package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDatePickerDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		//Month and Year selection
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select month_drp=new Select(month);
		month_drp.selectByVisibleText("Aug");
		
		WebElement year= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select year_drp=new Select(year);
		year_drp.selectByVisibleText("1990");
		
		String date="2";
		
		//Date selection
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:alldates) {
		
			String dt=ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
			}
			
		}

	}

}
