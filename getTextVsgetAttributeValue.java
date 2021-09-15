// How To Provide & Clear text from Input Box? 
// How to capture Text from Input Box?
// What is the difference between getText() and  getAttribute('value’)?


package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVsgetAttributeValue {

	public static void main(String[] args) {
		
		//Setup browser and launch URL
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
// Q: How to capture Text from Input Box?			
		WebElement email_id1=driver.findElement(By.xpath("//input[@id='Email']"));
		System.out.println("Result from getAttribute Method: "+email_id1.getAttribute("value"));
		
		
// Q: How To Provide & Clear text from Input Box? 		
		
		WebElement email_id=driver.findElement(By.xpath("//input[@id='Email']"));
		email_id.clear(); // this will clear existing text from textbox field,here from email id text box
		email_id.sendKeys("admin123@gmail.com");

// Q: What is the difference between getText() and  getAttribute('value’)?
		
// getAttribute() method used to get the value of attribute
// getText() method used to get the innner text
// eg. <input id="user_email" class="user" value="admin@bee.com">abc@gmail.com</input>
// here to get values associated with attributes we use getAttribute() method
// here the inner text is "abc@gmail.com", to get the inner text we use getText() method
		
		//<button type="submit" class="button-1 login-button" xpath="1" style="">Log in</button>
		
		WebElement login_button=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		System.out.println("Inner text is: "+login_button.getText()); //this will return inner text if present ,here it will return "Log in" text
		
		System.out.println("Value of attribute is: "+login_button.getAttribute("type")); //this will return value of type attribute which is "submit" 
		System.out.println("Value of class is: "+login_button.getAttribute("class"));   //this will return value of type attribute which is "class" 
		
		
		String str=driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']")).getText();
		System.out.println(str);
		
		driver.quit();
		
	}

}