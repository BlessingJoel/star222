package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintColour {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement link= driver.findElement(By.linkText("Forgotten password?"));
		Thread.sleep(3000);
		String color=link.getCssValue("color");
		String fontType= link.getCssValue("font-family");
		String fontSize= link.getCssValue("font-size");
		System.out.println("color is: "+color);
		System.out.println("fontType is: "+fontType);
		System.out.println("fontSize is: "+fontSize);
		//driver.close();

	}

}
