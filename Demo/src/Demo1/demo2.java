package Demo1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004852\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String vTitle= driver.getTitle();
				System.out.println("URL is " +driver.getCurrentUrl());
		System.out.println("Title is " +vTitle);
		driver.close();
		
	}

}
