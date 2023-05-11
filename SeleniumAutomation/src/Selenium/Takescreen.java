package Selenium;

import java.io.File;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreen {

	public static <Takescreenshot> void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();

			driver.get("https://demo.actitime.com/login.do");
			Takescreenshot screen=(Takescreenshot)driver;
			File src = screen.getscreenshots(OutputType.FILE);
			File src1 = screen.getscreenshots(OutputType.FILE);
			File dest = new File("Failed.png");
			FileUtils.copyFile(src1, dest);

	}

}
