package Maven_proj.maven_gtm;

import org.testng.annotations.Test;


public class testcase2_2 extends LaunchQuit_1 {
	@Test
	public void loginproc() throws InterruptedException
	{
		opencart_login a1=new opencart_login(driver);
        a1.email(driver);
        a1.loginbutton();
		
	}
	
}
