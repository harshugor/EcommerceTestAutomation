package AskuitySolution.AskuitySolution.EcommerceProject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

import org.openqa.selenium.support.FindBy;

import AskuitySolution.AskuitySolution.Common.BasePagePO;

public class SelectPO extends BasePagePO{ 

	public SelenideElement clickButton(String button) {
	return $x("//*[@title='"+button+"']");
	}

	public SelenideElement hoverProduct(String productName) {
	return $x("//img[@title='"+productName+"']/../ancestor::div[@class='product-container']");
	}
	
	@FindBy(css= "a.quick-view")
	public SelenideElement quickViewBtn;
	
	@FindBy(xpath="//body[@id='product']//select[@id='group_1']")
	public SelenideElement sizeDropdoown;
	
	@FindBy(xpath="//button[@name='Submit']")
	public SelenideElement addToCart;
	
	@FindBy(xpath="//*[@title='View my shopping cart']")
	public SelenideElement cartButton;
	
	@FindBy(xpath="//input[@id='email_create']")
	public SelenideElement newEmail;
	
	@FindBy(xpath="//button[@name='SubmitCreate']")
	public SelenideElement createAccount;
	
	@FindBy(xpath="//input[@name='customer_firstname']")
	public SelenideElement customerFName;
	
	@FindBy(xpath="//input[@name='customer_lastname']")
	public SelenideElement customerLName;
	
	@FindBy(xpath="//input[@name='passwd']")
	public SelenideElement password;
	
	@FindBy(xpath="//input[@name='firstname']")
	public SelenideElement addressFname;
	
	@FindBy(xpath="//input[@name='lastname']")
	public SelenideElement addressLname;
	
	@FindBy(xpath="//input[@name='address1']")
	public SelenideElement addressLine;
	
	@FindBy(xpath="//input[@name='city']")
	public SelenideElement addressCity;
	
	@FindBy(xpath="//select[@name='id_state']")
	public SelenideElement addressState;
	
	@FindBy(xpath="//input[@name='postcode']")
	public SelenideElement addressZipCcode;
	
	@FindBy(xpath="//select[@name='id_country']")
	public SelenideElement addressCountry;
	
	@FindBy(xpath="//input[@name='phone_mobile']")
	public SelenideElement addressPhone;
	
	@FindBy(xpath="//input[@name='alias']")
	public SelenideElement addressAlias;
	
	@FindBy(xpath="//button[@name='submitAccount']")
	public SelenideElement registerAccount;
	
	@FindBy(xpath="//input[@name='cgv']")
	public SelenideElement shippingCheckBox;
	
	@FindBy(xpath="//p[@class='product-name']")
	public SelenideElement productDescripion;
	
	@FindBy(xpath="//*[@id='total_price']")
	public SelenideElement totalPrice;
	
	@FindBy(xpath="//*[@id='total_product']")
	public SelenideElement totalProductPrice;
	
	@FindBy(xpath="//p[@class='cart_navigation clearfix']//*[@title='Proceed to checkout']")
	public SelenideElement shoppingCartProceedToCheckout;
	
	@FindBy(xpath="//*[@name='processAddress']")
	public SelenideElement addressProceedToCheckout;
	
	@FindBy(xpath="//*[@name='processCarrier']")
	public SelenideElement shippingProceedToCheckout;
	
}
