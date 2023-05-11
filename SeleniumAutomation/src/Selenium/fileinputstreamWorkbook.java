package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileinputstreamWorkbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
        FileinputStream fes=new FileinputStream("./fileinputstream");
        
	}

}
