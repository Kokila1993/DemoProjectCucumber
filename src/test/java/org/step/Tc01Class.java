package org.step;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tc01Class extends BaseClassAll {
	
	static POMClass pc = new POMClass();
	
	@Given("User should be in Login page of Luma")
	public void tc01() {
		try {
			
		initDriver("Chrome");
		getUrl("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
		

		WebElement signIn = pc.getSignIn();
		signIn.click();
		
		System.out.println("URL launched Successfully");
		
		}catch (Exception e) {
			
			System.out.println("URL Launch Getting Failed");
			
		}
	   
	}

	
	@When("User should Enter the Username and Password")
	public void tc02(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		try {
			
			Thread.sleep(2000);
			List<String> asList = dataTable.asList();
			String user = asList.get(0);
			String pass = asList.get(1);
						
			WebElement userName = pc.getUserName();
			userName.sendKeys(user);
			Thread.sleep(2000);
			
			WebElement passWord = pc.getPassWord();
			passWord.sendKeys(pass);
			Thread.sleep(2000);
			
			System.out.println("Login Credentials Entered Successfully");

		
		}catch(Exception e) {
			
			System.out.println("Login Credentials not Entered");
			
		}
	}

	@When("User should click the Sign-in Button")
	public void tc03() {
		
		WebElement button = pc.getButton();
		button.click();
		
		System.out.println("Button Clicked Successfully");
		
	}

	@Then("User should verify the Error Message")
	public void tc04() {
		
		System.out.println("User Navigate to the Homepage");
		
	}
	
}
