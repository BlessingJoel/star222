package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Getorganizationpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//Declaration
		@FindBy(xpath = "//img[@title='Create Organization...']")
		private WebElement organizationcreateimage;
		
		@FindBy(name="accountname")
		private WebElement organizationnametext;
		
		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement savebutton;

	}

}
