package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gettittle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
       
        String title= driver.getTitle();
        System.out.println(title);
        driver.close();

	}

}
