package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingframes {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://127.0.0.1:5500/new4.html");
	        Thread.sleep(2000);
	        driver.switchTo().frame(0);
	        driver.findElement(By.id("t2")).sendKeys("jsp");
	        driver.switchTo().parentFrame();
	        driver.findElement(By.id("t1")).sendKeys("qsp");

	}

}
