package Maven_proj.maven_gtm;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeurban {
	@FindBy(xpath = "//li[@class='topnav_item livingunit']/span")
	WebElement living;

	@FindBy(xpath = "//li[@class='subnav_item 1699']")
	WebElement tvunit;	
	
	public void living_items(WebDriver driver) throws InterruptedException
	{
	Actions a1=new Actions(driver);
	a1.moveToElement(living).build().perform();
	Thread.sleep(3000);
	}
	public void tvunit()
	{
		tvunit.click();
	}
public Homeurban(ChromeDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
