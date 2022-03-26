package starter.Amazon.step;

import net.thucydides.core.annotations.Step;
import starter.Amazon.ListUtilityFunction.ListPreviousSearch;
import starter.Amazon.Page.OpenNavigateStep;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NavigateAmazon {
    OpenNavigateStep openNavigateStep;
    ListPreviousSearch listPreviousSearch;

    @Step
    public void openNavigateAmazon() {
        openNavigateStep.open();
    }
    @Step
    public void NavigateLeftSidebar() {
        openNavigateStep.clickleftSideBar();
    }
    @Step
    public void selectproductbydepartementelectronics() {
        openNavigateStep.clickproductbydepartementelectronics();
    }
    @Step
    public void selecttelevisiondanvideo() { openNavigateStep.clicktelevisionandvideo();}
    @Step
    public void selectTelevisions() {
        openNavigateStep.clickTelevisions();
    }
    @Step
    public void select32inchesandUnder() {
        openNavigateStep.click32inchesandUnder();
    }
    @Step
    public void selectsortingdropdown() {
        openNavigateStep.clicksortingdropdown();
    }
    @Step
    public void selectpricedescending() {
        openNavigateStep.clickpricedescending();
    }
    @Step
    public void clickyear() {
        listPreviousSearch.yearstep();
    }
    @Step
    public void writeUtilityFunction(String N) {
        listPreviousSearch.typePrice(N);
    }
    @Step
    public void verifyPriceResult() {
        listPreviousSearch.PriceResult();
    }
    @Step
    public void verifyNameResult() {
        listPreviousSearch.NameItemResult();
    }
    @Step
    public void choseProductlink() {
        openNavigateStep.clickProductlink();
    }
    @Step
    public void choseaddtolist() {
        openNavigateStep.clickaddtolist();
    }
    @Step
    public void VerifyiftheSignInpageisshowingup(){assertEquals("Sign-in",openNavigateStep.VerifytheSignInpageisshowingup());}
    @Step
    public void enterSomeRandomUsernameAndSubmit(){
        openNavigateStep.RandomUsername();
    }
    @Step
    public void assertTheErrorAppearanceThenGetTheTextFromThatError(){assertTrue(openNavigateStep.GetTheTextFromThatError().contains("We cannot find an account with that email address"));}
}

