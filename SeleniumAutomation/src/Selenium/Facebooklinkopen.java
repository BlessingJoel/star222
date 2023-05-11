package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklinkopen {
    
	@Test
	public void first() throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("facebook"+Keys.ENTER);
		driver.findElement(By.partialLinkText("Log In")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("blessing");
		driver.findElement(By.id("pass")).sendKeys("6382928743");
		driver.quit();

	}

}
