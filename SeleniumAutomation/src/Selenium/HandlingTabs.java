package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTabs {

	public static void main(String[] args) throws Throwable {
		
		 WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.navigate().to("https://demo.actitime.com/login.do");
	        driver.findElement(By.linkText("actiTIME Inc.")).click();
	        Thread.sleep(5000);
	        Set<String> alltabs=driver.getWindowHandles();
	        Thread.sleep(5000);
	        int count= alltabs.size();
	        System.out.println(count);
	        for (String tab:alltabs) {
	        driver.switchTo().window(tab);
	        //driver.close();
	        }
	}   
	}
