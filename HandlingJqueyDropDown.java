//Q: How to handle JQuery Dropdown in Selenium WebDriver?


package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingJqueyDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=48.0_5");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Washington']")).click();
		//selectChoiceValues(driver,"Iowa");
		//selectChoiceValues(driver,"Iowa","Indiana","Mississippi","North Dakota");
		selectChoiceValues(driver,"all");

	}
	
	public static void selectChoiceValues(WebDriver driver,String... Value) {
		
		List<WebElement> choicelist=driver.findElements(By.xpath("//div[@class='ms-options']//ul//li"));
		
		if(!Value[0].equalsIgnoreCase("all")) {
			for(WebElement choice:choicelist) {
					String text=choice.getText();
					
					for(String val:Value) {
						
						if(text.equals(val)) {
							choice.click();
							break;
						}
					}
				
			}
		}else {
			
			for(WebElement ele:choicelist) {
				ele.click();
				
			}
		}
		
	}

}
