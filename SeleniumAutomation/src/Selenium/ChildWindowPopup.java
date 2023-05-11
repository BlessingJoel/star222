package Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowPopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://www.naukri.com/");
	        Set<String> allwh = driver.getWindowHandles();
	        Thread.sleep(5000);
	        int count = allwh.size();
	        System.out.println(count);
	        for(String wh:allwh)
	        {
	         System.out.println(wh);
	        }
	        //driver.quit();
	      
	}

}
