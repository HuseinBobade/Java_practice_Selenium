// Q: How To Handle Web Table in Selenium WebDriver?


package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {
		
// Q: How To Handle Web Table in Selenium WebDriver?
	 /*
	1. How Many rows in table
	2. How Many Columns in table
	3. Retrieve specific row/column data
	4. Retrieve all the data from table
	5. Retrieve Specific data from table
   */
 
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// 1. How Many rows in table
		int rows=driver.findElements(By.xpath("//table[@id='countries']//tbody//tr")).size();
		System.out.println("Number of Rows in Table are: "+rows);
		
		Thread.sleep(2000);
		
		//2. How Many Columns in table
		int columns=driver.findElements(By.xpath("//table[@id='countries']//tr[1]/td")).size();
		System.out.println("Number of Columns in Table are: "+columns);
		
		Thread.sleep(2000);
		
		//3. Retrieve specific row/column data
		String cityname=driver.findElement(By.xpath("//table[@id='countries']//tbody//tr[3]//td[2]")).getText();
		System.out.println("City name is: "+cityname);
		
		
		//4. Retrieve all the data from table
		/*
		System.out.println("Data From Table");
		for(int r=1;r<=rows;r++) {
			
			for(int c=1;c<=columns;c++) {
				
				String Data=driver.findElement(By.xpath("//table[@id='countries']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(Data+ "        ");
				
			}
			System.out.println();
		}
		*/
		
		//5. Retrieve Specific data from table ---> for country  india print currency and langueses
		
		for(int r=1;r<=rows;r++) {
			
			String country=driver.findElement(By.xpath("//table[@id='countries']//tbody//tr["+r+"]//td[2]")).getText();
						
			if(country.equals("India")) {
				
				String currency=driver.findElement(By.xpath("//table[@id='countries']//tbody//tr["+r+"]//td[4]")).getText();
				
				String PrimeLangs=driver.findElement(By.xpath("//table[@id='countries']//tbody//tr["+r+"]//td[5]")).getText();
				
				System.out.println(country+"  "+currency+"   "+PrimeLangs);
				
			}
			
			
		}
			
		
		
		//Thread.sleep(2000);
		//driver.quit();
		
	}

}
