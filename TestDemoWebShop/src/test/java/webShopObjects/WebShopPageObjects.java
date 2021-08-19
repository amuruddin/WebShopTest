package webShopObjects;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebShopPageObjects {

	public WebDriver ldriver;
	public WebShopPageObjects (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.CLASS_NAME, using="ico-login")
	WebElement LoginOption;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")
	WebElement WelcomeMessage;
	
	@FindBy(how=How.ID, using="Email")
	WebElement UserName;
	
	@FindBy(how=How.ID, using="Password")
	WebElement Password;
	
	@FindBy(how=How.XPATH, using="//input[@class='button-1 login-button']")
	WebElement LoginButton;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement UserAccount;
	
	@FindBy(how=How.XPATH, using="//li[@id='topcartlink']")
	WebElement ShoppingCart;
	
	@FindBy(how=How.NAME, using="removefromcart")
	WebElement CheckBoxForClear;
	
	@FindBy(how=How.NAME, using="updatecart")
	WebElement UpdateShoppingCart;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")
	WebElement BooksCategory;
	
	@FindBy(how=How.XPATH, using="//img[@alt='Picture of Fiction']")
	WebElement FictionBook;
	
	@FindBy(how=How.CLASS_NAME, using="price-value-45")
	WebElement PriceDetails;
	
	@FindBy(how=How.ID, using="addtocart_45_EnteredQuantity")
	WebElement Qty;
	
	@FindBy(how=How.ID, using="add-to-cart-button-45")
	WebElement AddToCart;
	
	@FindBy(how=How.XPATH, using="//p[@class='content']")
	WebElement ValidateMessage;
	
	@FindBy(how=How.XPATH, using="//li[@id='topcartlink']")
	WebElement ShoppingCart1;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span/span")
	WebElement SubTotalPrice;
	
	@FindBy(how=How.ID, using="termsofservice")
	WebElement AgreeCheckbox;
	
	@FindBy(how=How.ID, using="checkout")
	WebElement Checkout;
	
	@FindBy(how=How.ID, using="billing-address-select")
	WebElement DropDown;
	
	@FindBy(how=How.XPATH, using="//input[@onClick='Billing.save()']")
	WebElement ContinueToShipping;
	
	@FindBy(how=How.XPATH, using="//input[@onClick='Shipping.save()']")
	WebElement ContinueToShippingMethod;
	
	@FindBy(how=How.ID, using="shippingoption_1")
	WebElement NextDayAir;
	
	@FindBy(how=How.XPATH, using="//input[@onClick='ShippingMethod.save()']")
	WebElement ContinueToPayment;
	
	@FindBy(how=How.XPATH, using="//input[@onClick='PaymentMethod.save()']")
	WebElement ContinueToPaymentInfo;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"checkout-payment-info-load\"]/div/div/div[1]/table/tbody/tr/td/p")
	WebElement PaymentInfo;
	
	@FindBy(how=How.XPATH, using="//input[@onClick='PaymentInfo.save()']")
	WebElement ContinueToConfirm;
	
	@FindBy(how=How.XPATH, using="//input[@onClick='ConfirmOrder.save()']")
	WebElement ConfirmButton;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong")
	WebElement OrderProcessMessage;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")
	WebElement OrderNumber;
	
	@FindBy(how=How.XPATH, using="//input[@value='Continue']")
	WebElement LastContinueButton;
	
	@FindBy(how=How.CLASS_NAME, using="ico-logout")
	WebElement Logout;
	
	
	public void clickLoginOption()
	{
		LoginOption.click();
	}
	
	public void ValidDateWelcomeMessage()
	{
		//System.out.println("WelcomeMessage:"+WelcomeMessage.getText());
			Boolean b = WelcomeMessage.getText().equalsIgnoreCase("Welcome, Please Sign In!");
			assertTrue(b, "Message Not Matched");
			System.out.println(b);
	}
	
	public void EnterUserName(String username)
	{
		UserName.sendKeys(username);
	}
	
	public void EnterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	
	public void clickLoginButton()
	{
		LoginButton.click();
	}
	
	public void validateUserAccountID()
	{
		Boolean b = UserAccount.getText().equalsIgnoreCase("testdemowebshop@gmail.com"); 
		assertTrue(b, "Account ID Not Matched");
		System.out.println(b);
		//System.out.println("Account Id:"+UserAccount.getText());
	}
	
	public void clickShoppingCart()
	{
		ShoppingCart.click();
	}
	
	public void clickCheckBoxForClear()
	{
		CheckBoxForClear.click();
	}
	
	public void clickUpdateShoppingCart()
	{
		UpdateShoppingCart.click();
	}
	
	public void selectBooksCategory()
	{
		BooksCategory.click();
	}
	
	public void selectFictionBook()
	{
		FictionBook.click();
	}
	
	public void getPriceDetails()
	{
		System.out.println("Price:"+PriceDetails.getText());
	}
	
	public void clearQuantity()
	{
		Qty.clear();
	}
	
	public void enterQuantity(String enterQty)
	{
		Qty.sendKeys(enterQty);
	}
	
	public void clickAddToCart()
	{
		AddToCart.click();
	}
	
	public void ValidateMessage()
	{
		Boolean b = ValidateMessage.getText().equalsIgnoreCase("The product has been added to your shopping cart");
		assertTrue(b, "Message Not Matched");
		System.out.println(b);
		//System.out.println("Message:"+ValidateMessage.getText());
	}
	
	public void clickShoppingCartAgain()
	{
		ShoppingCart1.click();
	}
	
	public void validateSubTotal()
	{
		System.out.println("SubTotal:"+SubTotalPrice.getText());
	}
	
	public void clickAgreeCheckbox()
	{
		AgreeCheckbox.click();
	}
	
	public void clickCheckout()
	{
		Checkout.click();
	}
	
	public void selectDropdown(String value)
	{
		Select DD=new Select(DropDown);
		DD.selectByVisibleText(value);
	}
	
	public void clickContinueToShipping()
	{
		ContinueToShipping.click();
	}
	
	public void clickContinueToShippingMethod()
	{
		ContinueToShippingMethod.click();
	}
	
	public void selectNextDayAir()
	{
		NextDayAir.click();
	}
	
	public void clickContinueToPayment()
	{
		ContinueToPayment.click();
	}
	
	public void clickContinueToPaymentInfo()
	{
		ContinueToPaymentInfo.click();
	}
	
	public void validatePayementInfo()
	{
		Boolean b = PaymentInfo.getText().equalsIgnoreCase("You will pay by COD");
		assertTrue(b, "Message Not Matched");
		System.out.println(b);
		//System.out.println("PaymentInfo:"+PaymentInfo.getText());
	}
	
	public void clickContinueToConfirm()
	{
		ContinueToConfirm.click();
	}
	
	public void clickConfirmButton()
	{
		ConfirmButton.click();
	}
	
	public void ValidateOrderProcessMessage()
	{
		Boolean b = OrderProcessMessage.getText().equalsIgnoreCase("Your order has been successfully processed!");
		assertTrue(b, "Message Not Matched");
		System.out.println(b);
		//System.out.println("Order Process:"+OrderProcessMessage.getText());
	}
	
	public void PrintOrderNumber()
	{
		System.out.println("Order Id:"+OrderNumber.getText());
	}
	
	public void clickLastContinueButton()
	{
		LastContinueButton.click();
	}
	
	public void clickLogout()
	{
		Logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
