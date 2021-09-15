// Q:  How to Handle Auto Suggest Drop Down in Selenium WebDriver?
// 1) Google Search
// 2) Bing Search


package mypackage;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestDropDowns_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("selenium");

		List<WebElement> autoSuggestList=driver.findElements(By.xpath("//ul[@class='erkvQe']//li//div[@role='option']//div[1]/span"));
		System.out.println("Number of Auto Suggestions are : "+autoSuggestList.size());


		for(WebElement option:autoSuggestList) {

			if(option.getText().contains("hq")) {

				option.click();
				break; 
			}

		}


		driver.quit();

	}

}
