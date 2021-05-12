package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	
	/*@Given("^User is on NetBaking landing page$")
	public void User_is_on_NetBaking_landing_page()
	{
		
	}*/
	
	
	@Given("User is on NetBaking landing page")
	public void user_is_on_net_baking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Landing Page");
	}
	/*@When("User login into application with username and password")
	public void user_login_into_application_with_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User Name Password");
		
	}*/
	
	
	
	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		System.out.println(string2);
	}



	
	@Then("Home page is populated")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Homepage");
	} 
	
	
	/*@And("cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Card Displayed");
	}*/
	
	
	

	@And("^cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}




	@When("User sign up with following details")
	public void user_sign_up_with_following_details(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> obj = dataTable.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		
	
	}
	
	

	

	@When("^User login in to application with (.+) and password (.+)$")
	public void user_login_in_to_application_with_user1_and_password_pass1(String Username,String Password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(Username);
	     System.out.println(Password);
	}





	@Given("validate browser")
	public void validate_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Browser validation");
	}
	@When("Browser is triggered")
	public void browser_is_triggered() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Browser triggered");
	}
	@Then("check if browser is started")
	public void check_if_browser_is_started() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Browser started");
	}













}
