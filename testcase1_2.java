package Maven_proj.maven_gtm;

import org.testng.annotations.Test;

@Test
public class testcase1_2 extends LaunchQuit_1 {
	public void registpro() throws InterruptedException
	{
		opencart o1= new opencart(driver);
		o1.registerbut(driver);
		Thread.sleep(2000);
		o1.registercred();
		o1.signup();
	}

}
