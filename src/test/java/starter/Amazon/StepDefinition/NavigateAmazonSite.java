package starter.Amazon.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Amazon.step.NavigateAmazon;

public class NavigateAmazonSite {
    @Steps
    NavigateAmazon navigateAmazon;
    @Given("Open browser and navigate to the site")
    public void Openbrowser(){
        navigateAmazon.openNavigateAmazon();
    }
    @When("Navigate to the left sidebar, select for products by department electronics and then television & video")
    public void navigateToTheLeftSidebar() {
        navigateAmazon.NavigateLeftSidebar();
        navigateAmazon.selectproductbydepartementelectronics();
        navigateAmazon.selecttelevisiondanvideo();
    }
    @And("Select the “televisions” then select “32 inches & under” from left side refinery")
    public void selectTelevisions() {
        navigateAmazon.selectTelevisions();
        navigateAmazon.select32inchesandUnder();
    }
    @And("From appearing search results, navigate to the sorting dropdown and sort the items by price descending")
    public void fromAppearingSearchResultsNavigateToTheSortingDropdownAndSortTheItemsByPriceDescending() {
        navigateAmazon.selectsortingdropdown();
        navigateAmazon.selectpricedescending();
    }
    @And("Write utility function The function should return the given ‘N’ item prices and the item names as a list, based on the previous search That very same function also should return the products whose price is less than ${string} and whose model year is 2017")
    public void writeUtilityFunctionTheFunctionShouldReturnTheGivenNItemPricesAndTheItemNamesAsAListBasedOnThePreviousSearchThatVerySameFunctionAlsoShouldReturnTheProductsWhosePriceIsLessThan$AndWhoseModelYearIs(String N) {
        navigateAmazon.clickyear();
        navigateAmazon.writeUtilityFunction(N);
        navigateAmazon.verifyPriceResult();
        navigateAmazon.verifyNameResult();
    }
    @And("Click on the product link for the first product in search result and go to the product page.")
    public void clickOnTheProductLinkForTheFirstProductInSearchResultAndGoToTheProductPage() { navigateAmazon.choseProductlink();
    }
    @And("Click on ‘add to list’")
    public void clickOnAddToList() { navigateAmazon.choseaddtolist();
    }
    @Then("Verify if the Sign In page is showing up \\(since users haven’t logged in yet)")
    public void verifyIfTheSignInPageIsShowingUpSinceUsersHavenTLoggedInYet() { navigateAmazon.VerifyiftheSignInpageisshowingup();
    }
    @When("Enter some random username and submit")
    public void enterSomeRandomUsernameAndSubmit() { navigateAmazon.enterSomeRandomUsernameAndSubmit();
    }
    @Then("Assert the error appearance then get the text from that error")
    public void assertTheErrorAppearanceThenGetTheTextFromThatError() { navigateAmazon.assertTheErrorAppearanceThenGetTheTextFromThatError();
    }
}
