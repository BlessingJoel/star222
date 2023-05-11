package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Thronereclinerheaderclickingfunction {

	public void automation() throws Exception {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://thronerecliners.com/#/");
	        driver.manage().window().maximize();
	        driver.findElement(By.partialLinkText("Our Company")).click();
	        driver.findElement(By.partialLinkText("Home")).click();
	        driver.findElement(By.partialLinkText("E-Catalogue")).click();
	        Thread.sleep(3000);
	    	WebElement from2  = driver.findElement(By.xpath("(//*[@class='dropdown cursor-pointer'])[1]"));
			Actions act3=new Actions(driver);
			act3.moveToElement(from2).perform();
			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Accessories")).click();
			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Colours & Upholstery")).click();
			driver.findElement(By.partialLinkText("Projects")).click();
			  driver.findElement(By.partialLinkText("Reach Us")).click();
			  driver.findElement(By.partialLinkText("FAQ")).click();
			  driver.findElement(By.partialLinkText("+91 9790764379")).click();
			  
			  
			



	}
}

	       


