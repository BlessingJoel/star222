package Selenium;

import java.sql.Driver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {

	public static void main(String[] args, EdgeDriver driver) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();

	}

}
