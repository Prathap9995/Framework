package stepDefinition;

import org.junit.runner.RunWith;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import objects.LandingPage;
import objects.LoginPage;
import objects.PortalPage;
import resources.base;

@RunWith(Cucumber.class)
public class stepDefination extends base {

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	//Implementing the codes from framework
    	driver =initializeDriver();
       
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
        //To add value and click on sign in
    	LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(strArg1);
		lp.getPassword().sendKeys(strArg2);
		lp.getLogin().click();
    }  //By using parameterization
    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
    	LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
    }
    @Then("^Verify that user logs in successfully$")
    public void verify_that_user_logs_in_successfully() throws Throwable {
     PortalPage p = new PortalPage(driver);
   Assert.assertTrue(p.getAlert().isDisplayed());
    }

    @And("^Navigate to \"([^\"]*)\"$")
    public void navigate_to_something(String strArg1) throws Throwable {
        //Navigating t home page 
    	driver.get(strArg1);
    }

    @And("^Click on login link homepage to land on secure sign in page$")
    public void click_on_login_link_homepage_to_land_on_secure_sign_in_page() throws Throwable {
        //click on sign in button
    	LandingPage l=new LandingPage(driver);
    	l.getLogin().click();

    }
        @And("^close the window$")
        public void close_the_window() throws Throwable {
           driver.close();
        }

    	

    }

