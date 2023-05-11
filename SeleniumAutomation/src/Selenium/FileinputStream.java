package Selenium;

import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FileinputStream {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	       FileinputStream file=new FileinputStream();
	       
	       Properties pro=new Properties();
		pro.load(file);
		String URL = pro.getProperty("url");
		driver.get(URL);
	       
	       

	}

	private static void getProperty(String string) {
		// TODO Auto-generated method stub
		
	}

}
