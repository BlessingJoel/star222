package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusBox {

	public static void main(String[] args) throws InterruptedException{

		 WebDriverManager.edgedriver();
	     WebDriver driver = new EdgeDriver();

	 	driver.get("https://demo.actitime.com/login.do");
	 	 boolean check = 
	 	driver.findElement(By.xpath("(//table[@for='filled in box'])")).click()
	 	 if (check==true)
	 	 System.out.println("selected");
	 	 else
	 	 System.out.println("not selected");
	 	 driver.close();

	}


}
