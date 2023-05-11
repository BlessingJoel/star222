package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.vtiger.com/");
		Thread.sleep(5000);
		Actions a= new Actions(driver);
		WebElement resourcesTab
		
		=driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(resourcesTab).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
	}

}
