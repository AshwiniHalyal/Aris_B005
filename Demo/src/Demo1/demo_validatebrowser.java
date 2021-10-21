package Demo1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo_validatebrowser {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter Browser name");

	    String browsername = myObj.nextLine();  // Read user input
	    System.out.println("Username is: " + browsername); 
	    
		if (browsername.contains("Chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\00004852\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String vTitle= driver.getTitle();
				System.out.println("URL is " +driver.getCurrentUrl());
		System.out.println("Title is " +vTitle);
		driver.close();
		
		}
		
		else if (browsername.contains("Edge"))
		{
			
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004852\\Documents\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		String vTitle= driver.getTitle();
				System.out.println("URL is " +driver.getCurrentUrl());
		System.out.println("Title is " +vTitle);
		driver.close();
		}
		else
			System.out.println("Invalid Browser");
	}

}
