package Selenium;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleScrolbar {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		Thread.sleep(5000);
		int y = driver.findElement(By.xpath("//span[.='Future Planet']")).getLocation().getY();
		Thread.sleep(7000);
		JavascriptExecutor j=  (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(10000,"+y+")");
	
	}

}
