package Maven_proj.maven_gtm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class opencart{
@FindBy(xpath ="//span[@class='header-icon-link user-profile-icon']")
WebElement registerbutton;

@FindBy (id="header-icon-signup")
WebElement signup;

@FindBy (xpath="//input[@placeholder='Email Address*']")
WebElement email;

@FindBy(xpath= "(//input[@type='password'])[1]")
WebElement password;

@FindBy(xpath ="//input[@value='Sign Up']")
WebElement signupbut;

public void registerbut(WebDriver driver) throws InterruptedException
{
	
	Actions a1=new Actions(driver);
	a1.moveToElement(registerbutton).build().perform();
	signup.click();
	Thread.sleep(4000);
}
public void registercred()
{
	email.sendKeys("prajwalsinghgour48@gmail.com");
	password.sendKeys("Prajwal@123");
}

public void signup() throws InterruptedException
{
signupbut.click();
Thread.sleep(4000);
}

public opencart(ChromeDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
