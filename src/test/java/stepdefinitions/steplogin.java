package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steplogin {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("loginpage");
	}

		@When("user enters valid username and password")
		public void user_enters_valid_username_and_password() {
			System.out.println(" Entered valid username and password");
		}
		@Then("login is suceessful")
		public void login_is_suceessful() {
			System.out.println("login is suceessful"); 
		}
		@Then("user is redirected to homepage")
		public void user_is_redirected_to_homepage() {
			System.out.println("redirected to homepage"); 
		}

}


