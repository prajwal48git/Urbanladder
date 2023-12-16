package Maven_proj.maven_gtm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class opencart_login {
@FindBy(xpath ="//span[@class='header-icon-link user-profile-icon']")
WebElement registerbutton;

@FindBy(id = "header-icon-login")
WebElement login_home;
	
@FindBy(xpath = "//input[@class='email required input_authentication']")
WebElement loginun;

@FindBy(xpath="//input[@class='required input_authentication']")
WebElement password;

@FindBy(id="ul_site_login")
WebElement loginbut;

public void email(WebDriver driver) throws InterruptedException
{  Actions a1=new Actions(driver);
a1.moveToElement(registerbutton).build().perform();;
Thread.sleep(4000);
login_home.click();
Thread.sleep(6000);
loginun.sendKeys("prajwalsinghgour48@gmail.com");
password.sendKeys("Prajwal@123");
}
public void loginbutton()
{
	loginbut.click();
}

public opencart_login(ChromeDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
