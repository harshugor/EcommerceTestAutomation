package AskuitySolution.AskuitySolution.EcommerceProject;

import org.apache.commons.lang3.RandomStringUtils;

import AskuitySolution.AskuitySolution.Common.AppManager;
import AskuitySolution.AskuitySolution.Common.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class EcommerceStepDef {
	
	 AppManager app = Hooks.app; 
	  EcommerceManager ecManager =app.ecommManager();
	  
	  @Given("customer is on homepage")
		public void customer_is_on_homepage() {
		    app.help().getURL("http://automationpractice.com/");
	}
	  
	  @When("customer click on {string} button")
		public void customer_click_on_button(String button) {
		  app.help().waitForClickability(ecManager.select.clickButton(button), 30).scrollIntoView(true).click();
	  }
	  
	  @Then("customer click on Quick view button")
	  public void customer_click_on_Quick_view_button() {
		  app.help().waitForClickability(ecManager.select.quickViewBtn, 10).click();
	  }
	  
	  @And("customer hover on {string} button")
		public void customer_hover_on_button(String button) {
		  app.help().hover(ecManager.select.hoverProduct(button));
		 
		}
	  
	  @Then("customer click on Add to cart button")
	  public void customer_customer_click_on_Add_to_cart_button() {
		  ecManager.select.addToCart.click();
	  }


	  @Then("customer hovers on {string}")
	  public void customer_hovers_on(String button) {
		  app.help().waitForVisibility(ecManager.select.clickButton(button), 15);
	      app.help().hover(ecManager.select.clickButton(button));
	  }


	  @Then("customer can select size {string}")
	  public void customer_can_select_size(String size) {
		  app.help().moveToFrame();
		  if(size.equalsIgnoreCase("S")){  
		  ecManager.select.sizeDropdoown.selectOptionByValue("1");
		  }
		  else if(size.equalsIgnoreCase("M")) {
			  ecManager.select.sizeDropdoown.selectOptionByValue("2");
		  }
		  else {
			  ecManager.select.sizeDropdoown.selectOptionByValue("3");
		  }
	  }

	  @Then("customer click on Create an account button")
	  public void customer_click_on_Create_an_account_button() {
		  app.help().waitForClickability(ecManager.select.createAccount, 15).click();
	  }


	  @When("customer hovers on Cart button")
	  public void customer_hovers_on_Cart_button() {
	      app.help().hover(ecManager.select.cartButton);
	  }

	  @Then("customer can verify the product description as {string}")
	  public void customer_can_verify_the_product_description_as(String description) {
	  app.help().waitForVisibility(ecManager.select.productDescripion, 10);
	  Assert.assertTrue("Product description should match given descripion",ecManager.select.productDescripion.getText().equalsIgnoreCase(description));
	  }

	  @Then("customer can verify product cost and total amount")
	  public void customer_can_verify_product_cost_and_total_amount() {
		  Assert.assertTrue("Total Product price should be displayed and greater than 0", Double.valueOf(ecManager.select.totalProductPrice.getText().substring(1))>0.0);
		  Assert.assertTrue("Total price should be displayed and greater than 0", Double.valueOf(ecManager.select.totalPrice.getText().substring(1))>0.0);
	  }

	  @Then("customer can add email to register")
	  public void customer_can_add_email_to_register() {
		  app.help().waitForVisibility(ecManager.select.newEmail, 15).sendKeys(app.help().randomEmailGenerator());
	  }

	  @Then("customer fills all mandatory fields")
	  public void customer_fills_all_mandatory_fields() {
		  app.help().waitForVisibility(ecManager.select.customerFName, 10).sendKeys(RandomStringUtils.randomAlphabetic(6));
		  ecManager.select.customerLName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		 ecManager.select.password.sendKeys(RandomStringUtils.randomAlphabetic(8));
		 ecManager.select.addressLine.sendKeys(RandomStringUtils.randomAlphabetic(8));
		 ecManager.select.addressCity.sendKeys("Malden");
		 ecManager.select.addressState.selectOptionByValue("21");
		 ecManager.select.addressZipCcode.sendKeys("02148");
		 ecManager.select.addressPhone.sendKeys("1234567890");
		 ecManager.select.addressAlias.sendKeys(RandomStringUtils.randomAlphabetic(8));
	  }

	  @Then("customer selects agree to terms and service")
	  public void customer_selects_agree_to_terms_and_service() {
		  app.help().waitForClickability(ecManager.select.shippingCheckBox, 15).click();
	  }
	  
	  @Then("customer click Proceed to checkout button")
	  public void customer_click_Proceed_to_checkout_button() {
		  app.help().waitForClickability(ecManager.select.shoppingCartProceedToCheckout, 30).click(); 
	  }

	  @Then("customer click on Register button")
	  public void customer_click_on_Register_button() {
		  app.help().waitForClickability(ecManager.select.registerAccount, 10).click();
	  }
	  
	  @Then("customer click Proceed to checkout button on Address page")
	  public void customer_click_Proceed_to_checkout_button_on_Address_page() {
		  app.help().waitForClickability(ecManager.select.addressProceedToCheckout, 30).click(); 
	  }
	  
	  @Then("customer click Proceed to checkout button on Shipping page")
	  public void customer_click_Proceed_to_checkout_button_on_Shipping_page() {
		  app.help().waitForClickability(ecManager.select.shippingProceedToCheckout, 30).click(); 
	  }
}
