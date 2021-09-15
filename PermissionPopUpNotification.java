//		4) How To Handle Permission Pop-ups?

package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopUpNotification {

	public static void main(String[] args) {
		
		
//This will disable the allow/block notification popup	
		
		EdgeOptions op=new EdgeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.redbus.in/");
		

	}

}
