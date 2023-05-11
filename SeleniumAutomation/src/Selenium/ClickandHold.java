package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickandHold {
     
	@Test
	public void second() {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/test/drag_drop.html");
			WebElement from = driver.findElement(By.xpath("//*[text()=' 5000 ']"));
			WebElement to = driver.findElement(By.xpath("(//*[@class='placeholder'])[2]"));
			
			Actions act2= new Actions(driver);
			act2.clickAndHold(from).moveToElement(to).release(to).build().perform();
			driver.quit();

	}

}
