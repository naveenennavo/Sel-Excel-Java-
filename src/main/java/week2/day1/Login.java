package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElementById("inputLogin").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementById("decorativeSubmit").click();
		
		
	}

	
	
		
		
		
	}


