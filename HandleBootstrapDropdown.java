// Q: How to Handle Bootstrap Drop Down in Selenium WebDriver? --> When there is no Select class

package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBootstrapDropdown {
	
	
    // configure options parameter to Chrome driver
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		//ChromeOptions object
		ChromeOptions op = new ChromeOptions();
	    
		//disable notification parameter
	    op.addArguments("--disable-notifications");
	    
		
		driver=new ChromeDriver(op);
		
		//Launch Browser 
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		//Click on select product type
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> productType=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		selectfromDrpDown(productType, "Deposits");		
		/* 
		 for(WebElement prodtype:productType) {
			
			if(prodtype.getText().equals("Loans")) {
				
				prodtype.click();
				break;
			}
			
		}*/
		
		
		//Click on select product
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> product=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		selectfromDrpDown(product, "Fixed Deposit");
		/*
		  for(WebElement prod:product){
		  
			 if(prod.getText().equals("Gold Loan")) {
			  
			  prod.click(); break;
			  
		 	 } 
		  } 
		  */
	
	}
	
	
	//Approach2 Via Generic Method implementation
	
	public static void selectfromDrpDown(List<WebElement> options, String Value) {
		for(WebElement option:options) {
			
			if(option.getText().equals(Value)) {
				option.click();
			}
			
		}
	}

}
