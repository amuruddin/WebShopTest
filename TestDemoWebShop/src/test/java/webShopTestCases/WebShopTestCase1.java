package webShopTestCases;

import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import webShopObjects.WebShopPageObjects;


public class WebShopTestCase1 extends WebShopBaseClass {
	
	//Adding CSV file path
	String CSV_PATH = "./src\\test\\java\\webShopTestData\\WebShopTestData.csv";
	public CSVReader csvReader;
    String[] csvCell;	
    
    

	@Test
	public void WebShopTest() throws CsvValidationException, IOException 
	{   
		csvReader = new CSVReader(new FileReader(CSV_PATH)); //To read data from CSV file
	            		
		while ((csvCell = csvReader.readNext()) != null) {
            String url = csvCell[0];
            String username = csvCell[1];
            String password = csvCell[2];
        
            
        //Loggers are added, to identify the Scenarios according to the code
		logger.info("Scenario 1: Navingating to URL");
		driver.get(url);
			
		logger.info("Scenario 2: Click on Login button");
		WebShopPageObjects ws=new WebShopPageObjects(driver); //Calling PageObjects Class
		ws.clickLoginOption();
		
		logger.info("Scenario 3: Validating Welcome Message");
		ws.ValidDateWelcomeMessage();
		
		logger.info("Scenario 4: Login with Given Credentials");
		            
		ws.EnterUserName(username);		
		ws.EnterPassword(password);
		
		ws.clickLoginButton();
		
		logger.info("Scenario 5: Validating User Account on top right");
		ws.validateUserAccountID();
		
		logger.info("Scenrio 6: Clear the shopping ");
		ws.clickShoppingCart();
		ws.clickCheckBoxForClear();
		ws.clickUpdateShoppingCart();
		
		logger.info("Scenario 7: Select Books from Categories");
		ws.selectBooksCategory();
		
		logger.info("Scenario 8: Select a book from the list displayed");
		ws.selectFictionBook();
		
		logger.info("Scenario 9: Get the price details and enter the quantity (more than one)");
		ws.getPriceDetails();
		ws.clearQuantity();
		ws.enterQuantity("4");
		
		logger.info("Scenario 10: Click on “Add to cart");
		ws.clickAddToCart();
		
		logger.info("Scenario 11: Validate “The product has been added to shopping cart” message");
		ws.ValidateMessage();
		
		logger.info("Scenario 12: Click on “shopping cart” on top right and validate the “Sub-Total” Price for selected book");
		ws.clickShoppingCartAgain();
		ws.validateSubTotal();
		
		logger.info("Scenario 13: Click on “Check-out”");
		ws.clickAgreeCheckbox();
		ws.clickCheckout();
		
		logger.info("Scenario 14: Select “New Address” From “Billing Address” drop down.");
		ws.selectDropdown("Test123 test, test, test test, India");
		
		logger.info("Scenario 15: Fill all mandatory fields in “Billing Address” and click “Continue”");
		ws.clickContinueToShipping();
		
		logger.info("Scenario 16: Select the “Shipping Address” as same as “Billing Address” from “Shipping Address” drop down and click on “Continue”");
		ws.clickContinueToShippingMethod();;
		
		logger.info("Scenario 17: Select the shipping method as “Next Day Air” and click on “Continue”");
		ws.selectNextDayAir();
		ws.clickContinueToPayment();
		
		logger.info("Scenario 18: Choose the payment method as COD (Cash on delivery) and click on “Continue”");
		ws.clickContinueToPaymentInfo();
		
		logger.info("Scenario 19: Validate the message “You will pay by COD” and click on “Continue”");
		ws.validatePayementInfo();
		ws.clickContinueToConfirm();
		
		logger.info("Scenario 20: Click on “Confirm Order”");
		ws.clickConfirmButton();
		
		logger.info("Scenario 21: Validate the message “Your order has been successfully processed!” and print the Order number");
		ws.ValidateOrderProcessMessage();
		ws.PrintOrderNumber();
		
		logger.info("Scenario 22: Click on “Continue” and log out from the application ");
		ws.clickLastContinueButton();
		ws.clickLogout();
			
	}
		 
	}
}
