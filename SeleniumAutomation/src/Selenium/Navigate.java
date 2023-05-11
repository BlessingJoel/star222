package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();
	       
	        driver.navigate().to("https://www.google.com/");
	        driver.navigate().to("https://www.gmail.com/");
	        Thread.sleep(2000);
	        driver.navigate().back();
	        Thread.sleep(2000);
	        driver.navigate().forward();
	        Thread.sleep(2000);
	        driver.navigate().refresh();
	        Thread.sleep(2000);
	        driver.close();

	}

}
