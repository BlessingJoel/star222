package Selenium;

import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoOFmaps {

	public static void main(String[] args) {
		WebDriverManager.edgedriver();
		WebDriver driver = new EdgeDriver();
	      ArrayList<String> st= new ArrayList<>();
		
		st.add("https://demo.actitime.com/login.do");
		st.add("admin");
		st.add("admin@actitime.com"); // if email is added tomorrow
		st.add("manager");
		System.out.println(st.get(2)); // it will print email instead of
	
		HashMap<String, String> map= new HashMap<>();
		
		map.put("url", "https://demo.actitime.com/login.do");
		map.put("username", "admin");
		// map.put("email","admin@actitime.com"); //even if email is added
		map.put("password","manager");
		System.out.println(map.get("password")); // it will print the same 
		


	}

}
