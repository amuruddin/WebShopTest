package webShopTestCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class WebShopBaseClass {
		
		public static WebDriver driver;
		
		public static Logger logger;
		
		@BeforeClass
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			logger = Logger.getLogger("Web Shop Test");
			PropertyConfigurator.configure("Log4j.properties");
			
		}
		

	@AfterClass
	public void tearDown()
	{
		logger = Logger.getLogger("Browser Closed");
		driver.quit();

	}
	

	

}
