//	3) How To Handle Authentication Popup?

package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthenticationPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//Syntax for passing username password
		//https://username:password@URL
		//in this case it is https://admin:admin@the-internet.herokuapp.com/basic_auth
		

	}

}
