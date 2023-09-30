package org.demo;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POMClass extends BaseClassAll {
	
	public POMClass() {
		
		PageFactory.initElements(driver, this );
		
	}
	
	@CacheLookup
	@FindBy(xpath="(//a[contains(text(),'Sign')])[1]")
	private WebElement SignIn;

	public WebElement getSignIn() {
		return SignIn;
	}
	
	@CacheLookup
	@FindBy(id="email")
	
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
		
	}
	
	@CacheLookup
	@FindBy(id="pass")
	
	private WebElement passWord;

	public WebElement getPassWord() {
		return passWord;
	}
	
	@CacheLookup
	@FindBy(xpath="(//span[text()='Sign In'])[1]")
	
	private WebElement Button;

	public WebElement getButton() {
		return Button;
	}
	
	@CacheLookup
	@FindBy(xpath="//span[text()='Shop New Yoga']")
	
	private WebElement shop;
		
	public WebElement getShop() {
		return shop;
	}

	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'arachute Pant')]")
	
	private WebElement yoga;

	public WebElement getYoga() {
		return yoga;
	}
	
	@CacheLookup
	@FindBy(id="option-label-size-143-item-171")
	
	private WebElement size;

	public WebElement getSize() {
		return size;
	}
	
	@CacheLookup
	@FindBy(id="option-label-color-93-item-49")
	
	private WebElement colour;

	public WebElement getColour() {
		return colour;
	}
	
	@CacheLookup
	@FindBy(id="qty")
	
	private WebElement number;

	public WebElement getNumber() {
		return number;
	}
	
	@CacheLookup
	@FindBy(xpath="//span[text()='Add to Cart']")
	
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	@CacheLookup
	@FindBy(xpath="(//span[@class='counter qty'])[1]")
	
	private WebElement myCart;

	public WebElement getMyCart() {
		return myCart;
	}

	@FindBy(xpath="//a[@class='action delete']")
	
	private WebElement deleteCart;

	public WebElement getDeleteCart() {
		return deleteCart;
	}
	
	@FindBy(xpath="//button[@class='action-primary action-accept']")
	
	private WebElement accept;

	public WebElement getAccept() {
		return accept;
	}
	
	public void LumaOperations(String User, String Pass, String text) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement signIn2 = getSignIn();
		signIn2.click();
		
		WebElement userName2 = getUserName();
		userName2.sendKeys(User);
		
		WebElement passWord2 = getPassWord();
		passWord2.sendKeys(Pass);
		
		WebElement button2 = getButton();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(button2));
		
		button2.click();
		
		WebElement shop2 = getShop();
		shop2.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement yoga2 = getYoga();
		yoga2.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement size2 = getSize();
		size2.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement colour2 = getColour();
		colour2.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement number2 = getNumber();
		number2.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement number3 = getNumber();
		number3.clear();
		number3.sendKeys(text);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement addToCart2 = getAddToCart();
		addToCart2.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement myCart2 = getMyCart();
		myCart2.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement deleteCart2 = getDeleteCart();
		deleteCart2.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement accept2 = getAccept();
		accept2.click();
		
	}

}	
