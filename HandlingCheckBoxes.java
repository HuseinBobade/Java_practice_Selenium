//	1) How To Select specific Check box?
//	2) How to select all the check boxes?
//	3) How to select multiple check boxes by choice?
//	4) How to select last N check boxes?
//	5) How to select first N check boxes?


package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class HandlingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
// 1) How To Select specific Check box?
		
		//WebElement specificCheckBox=driver.findElement(By.xpath("//input[@id='monday']"));
		//specificCheckBox.click();

// 2) How to select all the check boxes?	
		
		List<WebElement> selectAllChkBox=driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@id,'day')]"));
		
		//Using classic for loop
		/*
		 * for(int i=0;i<selectAllChkBox.size();i++) {
		 * 
		 * selectAllChkBox.get(i).click();
		 * 
		 * }
		 */
		
		//Using enhanced for loop
		
		/*
		 * for(WebElement chkAll:selectAllChkBox) {
		 * 
		 * chkAll.click();
		 * 
		 * }
		 */
		 
//	3) How to select multiple check boxes by choice?		  

		/*
		 * for(WebElement dayChkBox:selectAllChkBox) {
		 * 
		 * String dayValue=dayChkBox.getAttribute("id");
		 * 
		 * if(dayValue.equals("monday") || dayValue.equals("sunday")) {
		 * 
		 * dayChkBox.click(); }
		 * 
		 * }
		 */
		  
//	4) How to select last N check boxes? ----> eg. select last 2 check boxes here Saturday & Sunday
		  
		//Total no of checkBoxes -No of checkBo want to select = starting index
		/*
		 * int totalChekBoxes=selectAllChkBox.size();
		 * System.out.println("Total no of checkboxes are: "+totalChekBoxes);
		 * 
		 * System.out.println("Select last 2 check boxes");
		 * for(int i=totalChekBoxes-2;i<totalChekBoxes;i++) {
		 * 
		 * selectAllChkBox.get(i).click();
		 * 
		 * }
		 */
		  
//  5) How to select first N check boxes? ----> eg. select first 3  check boxes, here Monday & Tueseday & Wednesday	 
		
		 int totalChekBoxes=selectAllChkBox.size();
		 System.out.println("Total no of checkboxes are: "+totalChekBoxes);
		 System.out.println("Select first 3 check boxes");
		 
		 for(int i=0; i<totalChekBoxes;i++) {
			 
			 if(i<3) {
			  selectAllChkBox.get(i).click();
			 }
			 
		 }
		 
		  
		Thread.sleep(5000);
		System.out.println("Closed");
		driver.quit();

	}

}
