package Selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class perform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://timetracker.ctepl.com/actitime/login.do");
			driver.manage().window().maximize();
			WebElement data = driver.findElement(By.name("username"));
			WebElement pass = driver.findElement(By.name("pwd"));
		WebElement login = driver.findElement(By.id("loginButton"));
			
			Actions act=new Actions(driver);
			act.sendKeys(data,"star").perform();
			act.sendKeys(pass,"manager").perform();
		act.sendKeys(data,"admin").perform();
		act.sendKeys(pass,"maoonager").perform();
		act.sendKeys(login).perform();

	}

}
