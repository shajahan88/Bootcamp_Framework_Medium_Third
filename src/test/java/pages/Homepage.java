package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	
	@FindBy(linkText = "Qafox.com")
	private WebElement logo;
	
	@FindBy(linkText = "My Account")
	private WebElement accountDropdown;
	
	@FindBy(xpath = "//span[contains(text(),'Wish List (0)')]")
	private WebElement wishlistMenu;
	
	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCartMenu;
	
	@FindBy(linkText = "Checkout")
	private WebElement checkoutMenu;
	
	@FindBy(xpath = "//input[@class='form-control input-lg']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//h3[contains(text(),'Featured')]")
	private WebElement featuredItems;
	
	@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[1]/form[1]/div[1]/button[1]")
	private WebElement currencyDropdown;
	
	@FindBy(linkText = "Canon EOS 5D")
	private WebElement featuredItemCamera;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean elementLogo() {
		return logo.isDisplayed();
	}
	public boolean elementAccountDropdown(){
		return accountDropdown.isDisplayed();
	}
	public boolean elementWishList() {
		return wishlistMenu.isDisplayed();
	}
	
	public void elementShoppingCart() {
		shoppingCartMenu.isDisplayed();
	}
	public boolean elementCheckout() {
		return checkoutMenu.isDisplayed();
	}
	public boolean elementSearchBar() {
		return searchBar.isDisplayed();
	}
	public boolean elementFeaturedItems()
	{
		return featuredItems.isDisplayed();
	}
	public boolean elementCurrencyDropdown() {
		return currencyDropdown.isDisplayed();
	}
	public ProductInfoPage featuredCamera() {
		featuredItemCamera.click();
		return new ProductInfoPage(driver);
		
	}
	}


