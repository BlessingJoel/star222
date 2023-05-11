package Selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.flipkart.com/");
			 //Right click
			 driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
			 WebElement first = driver.findElement(By.xpath("//*[@class='_2KpZ6l _3dESVI']"));
			Actions act = new Actions(driver);
			 act.moveToElement(first).perform();
			 act.doubleClick(first).perform();
			 //Action double click
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			 WebElement secound =driver.findElement(By.xpath("//*[contains(text(),'Double-Click Me To See Alert')]"));
			 Actions act1 = new Actions(driver);
			 act1.doubleClick(secound).perform();

	}

}
