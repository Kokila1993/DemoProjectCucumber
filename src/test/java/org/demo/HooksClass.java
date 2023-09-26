package org.demo;

import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClassAll{
	
	@Before
	public void tc01() {
		try {

			initDriver("Chrome");
			getUrl("https://magento.softwaretestingboard.com/");

			System.out.println("Homepage Loaded Successfully");
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		} catch (Exception e) {
			System.out.println("Home Page not Loaded");
		}
	}
	
	@After
	public void tc02() {
		try {
			
			Thread.sleep(5000);
			driver.close();
			driver.quit();
			
			
		} catch (Exception e) {

		}
	}

}
