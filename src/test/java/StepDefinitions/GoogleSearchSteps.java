package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
		
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser open ");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("google search steps");
	}

	@When("user enters a test in search box")
	public void user_enters_a_test_in_search_box() {
		System.out.println(" text in search box ");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("hit enters steps");
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		System.out.println("navigate search result");
	}

}
