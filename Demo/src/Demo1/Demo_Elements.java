package Demo1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_Elements {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004852\\Documents\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		//enter the url which you want to launch
		driver.get("https://www.linkedin.com/"); 
		System.out.println("Title" +driver.getTitle());
		
		driver.findElement(By.className("nav__button-secondary")).click();
		
		//User-name
		driver.findElement(By.id("username")).sendKeys("ashwini");
		
		//Password
		driver.findElement(By.name("session_password")).sendKeys("1234");
		
		//driver.findElement(By.className("btn__primary--large from__button--floating")).click();
		
		//Sign-in
		driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		
		
		String Error=driver.findElement(By.id("error-for-username")).getText();
		System.out.println("Error Message is:" +Error);

		//Forgot password
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		//Click on Join 
		driver.findElement(By.linkText("Join now")).click();
		
		System.out.println("Title" +driver.getTitle());
		
		Thread.sleep(5000);
		
		int size= driver.findElements(By.tagName("a")).size();
		System.out.println("Total Links" +size);
		
		
		driver.close();
		
		
	}
	
		
}
