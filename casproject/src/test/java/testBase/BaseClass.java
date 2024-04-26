package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import pageObjects.HomePage;
import pageObjects.OneCognizantPage;
import pageObjects.TruTime;

public class BaseClass {

	public static WebDriver driver;
	public static Logger logger;
	public Properties p;
	public static HomePage hp;
	public static OneCognizantPage op;
	public static TruTime tt;
	


	
	@BeforeTest

		@Parameters({"browser"})

		public void setUp(String browser) throws IOException

		{
		   
			FileReader file = new FileReader(System.getProperty("user.dir")+"/src/test/resources/config.properties");

			p = new Properties();

			p.load(file);

			logger = LogManager.getLogger(this.getClass());

			switch(browser.toLowerCase())

			{

			case "chrome": driver = new ChromeDriver(); break;

			case "edge": driver = new EdgeDriver(); break;

			default: System.out.println("No Browsers matching");

			return;

			}

		

			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            hp=new HomePage(driver);
			driver.get(p.getProperty("appURL"));

			driver.manage().window().maximize();

		}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	public String captureScreen(String tname) throws IOException {
		 
        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
               
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
       
        String targetFilePath=System.getProperty("user.dir")+"\\Screenshot\\" + tname + "_" + timeStamp + ".png";
        File targetFile=new File(targetFilePath);
       
        sourceFile.renameTo(targetFile);
           
        return targetFilePath;
 
    }
	
	
	
	
	
	
	

}
