package Maven_proj.maven_gtm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class payment_quanitity {
	
@FindBy(id="select_0_quantity")
WebElement quantity;

@FindBy(id="checkout-link")
WebElement checkout;

public void selectquant()
{
	Select s1=new Select(quantity);
	s1.selectByValue("2");
}
public void checkoutprocess()
{
	checkout.click();
}
public payment_quanitity(ChromeDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
