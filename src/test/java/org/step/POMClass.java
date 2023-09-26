package org.step;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	@FindBy(xpath="(//li[@class='authorization-link'])[1]")
	
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
	@FindBy(xpath="//a[text()='shopping cart']")
	
	private WebElement myCart;

	public WebElement getMyCart() {
		return myCart;
	}

	
	
	

}	
