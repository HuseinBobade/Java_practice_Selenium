// Q: How To Handle Dynamic Web Table with Pagination in Selenium?


package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDynamicWebTableWithPagination {

	public static void main(String[] args) {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("Demo");
		
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("Demo");
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		loginButton.click();
		
		WebElement SalesLink=driver.findElement(By.xpath("//a[normalize-space()='Sales']"));
		SalesLink.click();
		
		WebElement orderLink=driver.findElement(By.xpath("//a[normalize-space()='Orders']"));
		orderLink.click();
		
		//table
		// 1: Find total number of pages
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(text);  //Showing 1 to 20 of 10251 (513 Pages)
					
		int TotalPages=Integer.valueOf(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		System.out.println("Total Number of Pages are: "+TotalPages);
		
		//get active page and how many rows exist in each page
		for(int p=1;p<=3;p++) {
			 
			WebElement activePage=driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Active Page is : "+activePage.getText());
			activePage.click();
			
			int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("Number of rows in Page "+p+" are :"+rows);
			
				//read all the rows data from each page
			
				for(int r=1;r<=rows;r++) {
					
					String orderID=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
					String customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
					String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
					String total=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
					
					if(status.equals("Pending")) {
						System.out.println(orderID+ "  "+customer+"  "+status+"   "+total);
					}
				}
			
			
			
			String PageNum=Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+PageNum+"']")).click();
		}
		
		
		
		driver.quit();
	}

}
