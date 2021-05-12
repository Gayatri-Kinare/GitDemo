package stepDefinations;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePage;

public class MyStepDefinations {
	
	public WebDriver driver;
	HomePage h;
	
	@Given("User is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		        driver = Base.getDriver();
		    		    
	}
	@When("^User serached for (.+) vegetables$")
	public void user_serached_for_vegetables(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		h=new HomePage(driver);
		h.getSearch().sendKeys(string);
	
		
	    Thread.sleep(3000);
	}
	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_displayed(String string1) {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string1));
	}


	
	

	@When("^Added itmes to cart$")
	public void added_itmes_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.cssSelector("a.increment")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	}
	@When("^User proceeded to Checkout page for purchase$")
	public void user_proceeded_to_checkout_page_for_purchase() {
	    driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	  
	}
	/*@Then("^verify selected \"([^\"]*)\" items are displayed in checkout page$")
	public void verify_selected_items_are_displayed_in_checkout_page(String string) {
	    
		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(string));
	    
	}*/

	
	@Then("^verify selected (.+) items are displayed in checkout page$")
	public void verify_selected_items_are_displayed_in_checkout_page(String name) {
	    
		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(name));
	    
	}




}
