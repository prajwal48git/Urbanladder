package Maven_proj.maven_gtm;

import org.testng.annotations.Test;

public class testcase5_2 extends LaunchQuit_1 {
	
	@Test
	
	public void checkoutfloe() throws InterruptedException
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
		payment_quanitity p1=new payment_quanitity(driver);
		p1.selectquant();
		p1.checkoutprocess();
	}
	
	

}
