//Q: How to Handle Autocomplete Google Places Drop Down?

package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutocompletePlaces {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(op);
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
	
//Q: How to Handle Autocomplete Google Places Drop Down?
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

		WebElement locationbox=driver.findElement(By.id("autocomplete"));
		locationbox.clear();
		Thread.sleep(3000);

		locationbox.sendKeys("Mexico");
		Thread.sleep(3000);

		String text;

		do {

			locationbox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			text=locationbox.getAttribute("value");

			if(text.equals("Mexico Beach, FL, USA")) {

				locationbox.sendKeys(Keys.ENTER);
			}
			Thread.sleep(3000);
		}while(!text.isEmpty());



	}

}
