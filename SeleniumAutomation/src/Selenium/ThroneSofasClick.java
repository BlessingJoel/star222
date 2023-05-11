package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThroneSofasClick {
    
	@Test
	public void automation1() throws Exception {
		
		  WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://thronerecliners.com/#/");
	        driver.manage().window().maximize();
           WebElement to = driver.findElement(By.xpath("//*[text()='Sofas']"));
	     Actions act=new Actions(driver);
	act.moveToElement(to).perform();
		 WebElement from  = driver.findElement(By.id("navigation"));
	 Actions act1=new Actions(driver);
		act1.moveToElement(from).perform();
			Thread.sleep(3000);
//			WebElement from1  = driver.findElement(By.xpath("(//*[@class='nav-link scrollto'])[6]"));
//			Actions act2=new Actions(driver);
//			act2.moveToElement(from1).perform();
//			WebElement from2  = driver.findElement(By.xpath("//*[@class='service-icon orange'][7]"));
//			Actions act3=new Actions(driver);
//			act2.moveToElement(from2).perform();
//
//			WebElement from4  = driver.findElement(By.xpath("(//*[@class='nav-link scrollto'])[8]"));
//			Actions act4=new Actions(driver);
//			act2.moveToElement(from4).perform();
//
//			WebElement from5  = driver.findElement(By.xpath("(//*[@class='nav-link scrollto'])[9]"));
//			Actions act5=new Actions(driver);
//			act2.moveToElement(from5).perform();
//			WebElement from6  = driver.findElement(By.xpath("(//*[@class='nav-link scrollto'])[10]"));
//			from6.click();
//			Actions act6=new Actions(driver);
//			act2.moveToElement(from5).perform();
//			
			

	}

	
		
	}


