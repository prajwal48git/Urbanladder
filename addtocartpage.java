package Maven_proj.maven_gtm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class addtocartpage {
@FindBy(xpath = "(//div[@class='wishproduct wishblock'])[1]")
WebElement wishlist;

@FindBy(xpath= "(//span[@class='header-icon'])[1]")
WebElement wishlistcheck;

@FindBy(id= "add-to-cart-button")
WebElement addtocartbut;

public void wishlistbut() throws InterruptedException
{  if(!wishlist.isSelected())
{
	wishlist.click();
	Thread.sleep(2000);
}
	
}
public void wishlist_list() throws InterruptedException
{
	wishlistcheck.click();
	Thread.sleep(3000);
	addtocartbut.click();
}


public addtocartpage(ChromeDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
