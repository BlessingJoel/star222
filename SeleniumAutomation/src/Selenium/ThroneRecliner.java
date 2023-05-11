package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThroneRecliner {
    
	@Test
	public void automation3() throws Exception {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://thronerecliners.com/#/");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.findElement(By.id("name")).sendKeys("blessing");
	        driver.findElement(By.id("email")).sendKeys("starblessing2@gmail.com");
	        driver.findElement(By.id("number")).sendKeys("6382928743");
	        driver.findElement(By.id("state")).click();
	        Thread.sleep(3000);
	        WebElement dropdown= driver.findElement(By.id("state"));
		      Select obj= new Select(dropdown);
		      obj.selectByIndex(4);
		      Thread.sleep(2000);
		      driver.findElement(By.id("city")).click();
		      WebElement dropdown1= driver.findElement(By.id("city"));
		     Select obj1= new Select(dropdown);
		      obj1.selectByIndex(7);
		     Thread.sleep(4000);
		      driver.findElement(By.id("selectoption")).click();
		      WebElement dropdown2= driver.findElement(By.id("selectoption"));
		      Select obj2= new Select(dropdown2);
		      obj2.selectByIndex(4);
		      driver.findElement(By.className("button")).click();

	}

}
