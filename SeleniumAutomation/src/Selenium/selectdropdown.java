package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();
	        WebDriver driver1=new ChromeDriver();
	        driver1.get("https://www.leafground.com/select.xhtml");
	        
	      WebElement dropdown= driver1.findElement(By.className("ui-selectonemenu"));
	      Select obj= new Select(dropdown);
	      obj.selectByIndex(2);
	      
	     WebElement count=driver1.findElement(By.className("ui-selectonemenu"));
	      Select sel1= new Select(count);
	      List<WebElement> total= obj.getOptions();
	       int nototal= total.size();
	       System.out.println("no of items="+nototal);

	}

}
