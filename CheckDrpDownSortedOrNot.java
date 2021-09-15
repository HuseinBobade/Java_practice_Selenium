//Q: How to Check Drop Down Options are Sorted?


package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDrpDownSortedOrNot {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(op);
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement drpoptions=driver.findElement(By.name("category_id"));
		Select drpSelect=new Select(drpoptions);
		
		List<WebElement> drpdwnOptions=drpSelect.getOptions();
		
		ArrayList original_list=new ArrayList();
		ArrayList temp_list=new ArrayList();
		
		for(WebElement option:drpdwnOptions) {
			
			original_list.add(option.getText());
			temp_list.add(option.getText());
		}
		
		System.out.println("Original List : "+original_list);
		System.out.println("temp List before sorting : "+temp_list);
		
		Collections.sort(temp_list);
		
		System.out.println("Original List : "+original_list);
		System.out.println("temp List after sorting : "+temp_list);
		
		if(original_list.equals(temp_list)) {
			
			System.out.println("Dropdowns Options are not sorted");
		}else {
			System.out.println("Dropdowns Options are sorted");
		}
				

	}

}
