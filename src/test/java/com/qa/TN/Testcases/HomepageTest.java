package com.qa.TN.Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.ProductInfoPage;

public class HomepageTest {
	
	public WebDriver driver;
	public Homepage homepage;
	public ProductInfoPage productinfopage;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		homepage = new Homepage(driver);
			
		
	}
	@Test
	public void homepageLinksVerifaction() {
		Assert.assertTrue(homepage.elementLogo());
		Assert.assertTrue(homepage.elementAccountDropdown());
		Assert.assertTrue(homepage.elementWishList());
		Assert.assertTrue(homepage.elementCheckout());
		Assert.assertTrue(homepage.elementSearchBar());
		Assert.assertTrue(homepage.elementFeaturedItems());
		Assert.assertTrue(homepage.elementCurrencyDropdown());
		productinfopage = homepage.featuredCamera();
		Assert.assertTrue(productinfopage.elementCameraSpecs());
		driver.quit();
		
		
	}

}
