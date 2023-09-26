package org.demo;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Luma extends BaseClassAll {

	public static POMClass pc;

	@Given("User shuold be in HomePage of the Luma E-Commerce Site")
	public void userShuoldBeInHomePageOfTheLumaECommerceSite() {
		
	}

	@When("User should click the SignIn and Login using valid {string} and {string}")
	public void loginPage(String string, String string2) {

		try {

			pc = new POMClass();

			WebElement signIn = pc.getSignIn();
			signIn.click();

			Thread.sleep(3000);

			WebElement userName = pc.getUserName();
			userName.sendKeys(string);

			Thread.sleep(3000);

			WebElement passWord = pc.getPassWord();
			passWord.sendKeys(string2);

			Thread.sleep(1000);
			shot("Password");

			System.out.println("Login Credentials Entered Successfully");

		} catch (Exception e) {
			System.out.println("Login Credentials Not Entered");
		}
	}

	@When("User should click the SignIn Button")
	public void signInButton() {

		try {

			WebElement button = pc.getButton();
			button.click();
			Thread.sleep(5000);

			System.out.println("Login Button Clicked Successfully");

		} catch (Exception e) {

			System.out.println("Clicking of Login button Getting Failed");
		}

	}

	@When("User should Click the link on the homepage")
	public void shopWithYoga() {

		try {

			WebElement shop = pc.getShop();
			shop.click();
			Thread.sleep(5000);

			shot("Search");

			System.out.println("Product Link Clicked Successfully");

		} catch (Exception e) {

			System.out.println("Clicking of product link Getting Failed");
		}
	}

	@When("User should add the product in the cart")
	public void productDetail() {

		try {

			WebElement yoga = pc.getYoga();
			yoga.click();

			Thread.sleep(5000);
			shot("Cart page");

			WebElement size = pc.getSize();
			size.click();
			Thread.sleep(5000);

			WebElement colour = pc.getColour();
			colour.click();
			Thread.sleep(5000);

			WebElement number = pc.getNumber();
			number.clear();
			number.sendKeys("2");
			Thread.sleep(5000);

			WebElement addToCart = pc.getAddToCart();
			addToCart.click();

			System.out.println("Product added to Cart Successfully");

		} catch (Exception e) {

			System.out.println("Added to Cart Process Getting Failed");
		}

	}

	@Then("User should Take a screenshot of the cart page")
	public void screenshotOfTheCart() {

		try {

			Thread.sleep(5000);
			shot("Added Cart page");

			System.out.println("Screenshot Successfully Taken");

		} catch (Exception e) {

			System.out.println("Couldn't Take ScreenShot");
		}
	}

	@When("User should Empty the cart")
	public void emptyTheCart() {

		try {

			Thread.sleep(3000);
			WebElement myCart = pc.getMyCart();
			myCart.click();

			Thread.sleep(3000);
			WebElement deleteCart = pc.getDeleteCart();
			deleteCart.click();

			Thread.sleep(3000);
			shot("Delete Cart");

			Thread.sleep(3000);
			WebElement accept = pc.getAccept();
			accept.click();

			System.out.println("Product Deleted Successfully");

		} catch (Exception e) {

			System.out.println("Deletion product Getting Failed");
		}

	}

	@Then("Take a screenshot of the Empty cart")
	public void screenshotOfEmptyCart() {

		try {

			Thread.sleep(3000);
			shot("Final Cart page");

			System.out.println("Screenshot of Empty Cart");

		} catch (Exception e) {

			System.out.println("Couldn't get Screenshot");
		}
	}
}
