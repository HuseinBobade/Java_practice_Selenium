//		1) What is Java Script Alert?
//		2) How To Handle Java Script Alerts?
//		3) How To Handle Authentication Popup?
//		4) How To Handle Permission Pop-ups?


package mypackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertsAndPopUps {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//	1) What is Java Script Alert?
//	2) How To Handle Java Script Alerts?		
		
		//Handling alert window with OK button
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); */
		
		//Handling alert window with OK and Cancel button
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); // closes alert by clicking on OK button
		driver.switchTo().alert().dismiss(); // closes alert by clicking on cancel button 
		*/
		
		//Alert window with input box and capture lable on alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alerwindow=driver.switchTo().alert();
		System.out.println("Lable displayed on alert is : "+alerwindow.getText());
		Thread.sleep(5000);
		alerwindow.sendKeys("Welcome");
		alerwindow.accept();
		//alerwindow.dismiss();
		 
		//driver.quit();
	}

}
