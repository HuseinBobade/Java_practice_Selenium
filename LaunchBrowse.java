//1) How to Launch Browsers in WebDriver?
//2) How to Open URL?
//3) How to capture Title of the page?
//4) How to capture URL of the page?
//5) How to capture page source of the Page?
//6) What is WebDriverManager?




package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowse {

	public static void main(String[] args) {
		
		
//1) How to Launch Browsers in WebDriver?  ----> Different Ways
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\All softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 * //ChromeDriver driver=new ChromeDriver(); 
		 * WebDriver driver=new ChromeDriver();
		 * driver.get("https://www.nopcommerce.com/en");
		 */
		
		//To Launch Mozilla Firefox Driver
		/*
		System.setProperty("webdriver.gecko.driver", "E:\\All softwares\\Selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.nopcommerce.com/en");
		*/
		
		//To Launch MS Edge Driver
		
		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "E:\\All softwares\\Selenium\\edgedriver_win32\\msedgedriver.exe"); WebDriver
		 * driver=new EdgeDriver(); driver.get("https://www.nopcommerce.com/en");
		 */
		
		
		//Using WebDriverManager
		
		//launching chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//launching FireFox browser
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
		
//2) How to Open URL?		
		driver.get("https://www.nopcommerce.com/en");
		
//3) How to capture Title of the page?		
		System.out.println("Title of Page is : "+driver.getTitle());
	
//4) How to capture URL of the page?		
		System.out.println("URL of Page is : "+driver.getCurrentUrl());
		
//5) How to capture page source of the Page?		
		System.out.println(driver.getPageSource());
		
		driver.close();
		driver.quit();

	}

}
