package cucumber.features;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//run test first and then when it fails - copy output to this file!
//make this class extend a baseclass for basic functionality
public class StepDefinitions {
	
	WebDriver driver;
	
	//Before and After are run for every scenario
	@Before
	public void TestSetup(){
		System.out.println("Setting up firefox driver...");
		driver = new FirefoxDriver();
	}
	
	@After
	public void TestTearDown(){
		System.out.println("Closing driver...");
		driver.quit();
	}
	
	//Additional, tagged, before and after
	@Before("@web")
	public void TestSetupWeb(){
		System.out.println("Specific test setup");
	}
	
	@After("@web")
	public void TestTearDownWeb(){
		System.out.println("Specific test teardown");

	}

	@Given("^this is my first step$")
	public void this_is_my_first_step() throws Throwable {		//change to java convention
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		System.out.println("first step");
	}

	@When("^this is my second step$")
	public void this_is_my_second_step() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		System.out.println("second step");
	}

	@Then("^this is my final step$")
	public void this_is_my_final_step() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		System.out.println("third step");
	}
	
	@Given("^I am on google web page$")
	public void I_am_on_google_web_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
		//Use selenium to open web page
	
		driver.navigate().to("http://www.google.se");
	}
	
	//Taking parameters to a method - use "" in scenario
	@When("^Click on \"([^\"]*)\" buttons$")
	public void Click_on_buttons(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		System.out.println("Pressing " + arg1 + " buttons.");
	}
	
	@When("^Use this data table$")
	public void Use_this_data_table(DataTable table) throws Throwable {
	    // For automatic conversion, change DataTable to List<YourType>
		//play around with 2D array
		System.out.println("Printing table toString()" + table);
		System.out.println("flatten() table" + table.flatten());
		//convert table to list
		List<List<String>> list = table.raw();
		System.out.println(list.get(1).get(0) + ": " + list.get(1).get(1));
	}
}
