package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchtoAlertgettext {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://www.seleniumeasy.com/test/javascript-alert-boxdemo.html");
	        driver.findElement(By.xpath("(//*[@class='btn btndefault'])")).click();
	        driver.manage().window().maximize();
	        String s= driver.switchTo().alert().getText();
	        driver.switchTo().alert().accept();
	        System.out.println(s);
	        driver.close();
	        

	}

}
