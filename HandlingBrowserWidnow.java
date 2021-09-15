//		1) How To Handle Browser Windows in Selenium WebDriver?
//		2) What is the Difference between getWindowHandle() & getWindowHandles() methods?
//		3) How To Switch between Multiple Browser Windows?
//		4) What is the difference between close() and quite() methods?
//		5) How to close All browser Windows?
//		6) How To close Specific Browser Window by choice?



package mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingBrowserWidnow {

	public static void main(String[] args) {
		
//		1) How To Handle Browser Windows in Selenium WebDriver?
//		2) What is the Difference between getWindowHandle() & getWindowHandles() methods?	
		
		
		//getWindowHandle()
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		driver.manage().window().maximize();
		
		//String winID =driver.getWindowHandle();  // returns ID of single browser window handle  (return Type is String)
		//System.out.println("Window Handle ID is : "+winID);
		 
		
		//getWindowHandles()
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		 Set<String> windowIDs =driver.getWindowHandles(); //returns set of window handle ID's  
		 
		 //Using iterator() Methods 
		
		 /*
		 Iterator<String> itr= windowIDs.iterator();
		
		 String firstWindow=itr.next();
		 String SeccondWindow=itr.next();
		 
		 System.out.println("first Window ID is : "+firstWindow);
		 System.out.println("Seccond Window ID is : "+SeccondWindow); */
		 
		 //Using List
		 
		 List<String> WindowIDList=new ArrayList<String>(windowIDs); // this will convert Set to List
		 /*
		 String firstWindow=WindowIDList.get(0);
		 String SeccondWindow=WindowIDList.get(1);
		 
		 System.out.println("first Window ID is : "+firstWindow);
		 System.out.println("Seccond Window ID is : "+SeccondWindow); */
		 
//	3) How To Switch between Multiple Browser Windows?		 
		 /*
		 driver.switchTo().window(firstWindow);
		 System.out.println("First Window Title is: "+driver.getTitle());
		 
		 driver.switchTo().window(SeccondWindow);
		 System.out.println("Second Window Title is: "+driver.getTitle()); */

		 //switching to multiple window hadles using for each loop
		 
		 /*
		 for(String winid:WindowIDList) {
			 
			 String title=driver.switchTo().window(winid).getTitle();
			 System.out.println(title);
		 }
		 */
		 
//	4) What is the difference between close() and quite() methods?		 
		 
		 //driver.close(); // will close single browser window which driver is pointing
		 
		 //driver.quit();   // will close all the browser windows 
		 
//	6) How To close Specific Browser Window by choice?		
		 
		 for(String winID:WindowIDList) {
			 
			String title=driver.switchTo().window(winID).getTitle();
			if(title.equals("OrangeHRM HR Software | Free HR Software | HRMS | HRIS")) {
				
				driver.close();
			}
		 }
		 

	}

}
