//		What is Broken Link? How to check it?

package mypackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
// What is Broken Link? How to check it?
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		Links.size();
		
		int brokenlinks=0;
		
		for(WebElement element:Links) {
			
			String url=element.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			}
			
			URL link= new URL(url);
			
			try {
				
				HttpURLConnection httpcon= (HttpURLConnection) link.openConnection();
				httpcon.connect();
				
				if(httpcon.getResponseCode()>=400) {
					System.out.println(httpcon.getResponseCode()+" "+url+" is "+"   Broken Link");
					brokenlinks++;
				}else {
					System.out.println(httpcon.getResponseCode()+" "+url+" is "+"   Valid Link");
				}
				
			}catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Number of Broken Links are: "+brokenlinks);

	}

}
