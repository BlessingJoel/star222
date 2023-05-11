package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropClicks {

	public static void main(String[] args) throws Throwable {
		 WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-likedrag-drop/index.html");
	        WebElement source= driver.findElement(By.xpath("//h1[.='Block 1']"));
	        WebElement target= driver.findElement(By.xpath("//h1[.='Block 4']"));
	        Thread.sleep(2000);
	        Actions a=new Actions(driver);
	       
	        a.dragAndDrop(source, target).perform();
	}

}
