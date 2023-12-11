package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practiceloginstep {
	
	WebDriver driver;
		
		@Given("user is on practice login page")
		public void user_is_on_practice_login_page() {
			//System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		    driver =new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
		}
		@When("user enters valid username and password practice")
		public void user_enters_valid_username_and_password_practice() {
			driver.findElement(By.id("username")).sendKeys("student");
			 driver.findElement(By.id("password")).sendKeys("Password123");
		}
		@Then("practice login is suceessful")
		public void practice_login_is_suceessful() {
			driver.findElement(By.id("submit")).click();
		}
		
}
	

