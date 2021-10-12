package StepDefinitions;

import Pages.SearchPage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchStep {
    public class SearchSteps{
        SearchPage searchPage = new SearchPage();
        WebDriver driver = Driver.getDriver();

        @Given("User is on Google page")
        public void user_is_on_Google_page() {
            Driver.getDriver().get("https://www.google.com/");
            Driver.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        }
        @When("User search for \"Ducks\"")
        public void user_search_for_Ducks() throws InterruptedException {
            searchPage.searchBox.sendKeys("Ducks");
        }

        @Then("User gets a proper result for required result")
        public void user_gets_a_proper_result_for_required_result() {
            searchPage.searchBox.click();
            driver.close();


        }


    }
}