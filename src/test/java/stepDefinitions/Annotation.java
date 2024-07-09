package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {
	WebDriver driver = null;
	
	@Given("I have open a chrome browser")
	public void i_have_open_a_chrome_browser() 
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	}

	@When("user navigates to the website XYZ Bank")
	public void user_navigates_to_the_website_xyz_bank() 
	{
		driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"); 
	}

	@When("there user logs in through by clicking {string}")
	public void there_user_logs_in_through_by_clicking(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("login must be successful.")
	public void login_must_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
