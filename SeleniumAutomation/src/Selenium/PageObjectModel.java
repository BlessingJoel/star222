package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
        //gotogoogle.com
        driver.get("https://www.google.com/");
        //Enter text in search textbox
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
        //Click on search button
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        driver.close();
        
	}

}
