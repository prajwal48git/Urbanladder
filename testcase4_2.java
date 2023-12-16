package Maven_proj.maven_gtm;

import org.testng.annotations.Test;

public class testcase4_2 extends LaunchQuit_1{
	
@Test
public void addtocart() throws InterruptedException
{
	opencart_login a1=new opencart_login(driver);
	a1.email(driver);
	a1.loginbutton();
	Homeurban h1=new Homeurban(driver);
	h1.living_items(driver);
	h1.tvunit();
	addtocartpage c1=new addtocartpage(driver);
	c1.wishlistbut();
	c1.wishlist_list();
}
	
	

}
