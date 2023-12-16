package Maven_proj.maven_gtm;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchQuit_1 {
	ChromeDriver driver;
	@BeforeMethod
	public void launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void quit()
	{
	//	driver.close();
	}
	@Test
	public void ontestfailed()
	{
TakesScreenshot ts = driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\Users\\prajw\\eclipse-workspace\\Selenium\\screenshot" +Math.random()+".png");
	}
	
}

	


