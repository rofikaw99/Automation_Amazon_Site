package starter.Amazon.Page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://www.amazon.com/")
public class OpenNavigateStep extends PageObject {


    @FindBy(how = How.XPATH, using ="//*[@id=\"nav-hamburger-menu\"]/i")
    WebElement leftsidebar;

    @FindBy(how = How.XPATH, using ="//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a")
    WebElement electronics;

    @FindBy(how = How.XPATH, using = "//*[@id=\"hmenu-content\"]/ul[5]/li[15]")
    WebElement televisionAndvideo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"n/172659\"]/span/a/span")
    WebElement televisions;

    @FindBy(how = How.XPATH, using = "//*[@id=\"p_n_size_browse-bin/1232879011\"]/span/a/div/label/i")
    WebElement ttinchesandUnder;

    @FindBy(how = How.XPATH, using = "//*[@id=\"search\"]/span/div/h1/div/div[2]/div/div/form/span/span/span/span")
    WebElement sortingdropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"s-result-sort-select_2\"]")
    WebElement pricedescending;

    @FindBy(how = How.XPATH, using = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")
    WebElement sansui;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wishListMainButton\"]/span/a")
    WebElement addtolist;

    @FindBy(how = How.XPATH, using = "//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1")
    WebElement SignInpageisshowingup;

    @FindBy(id="ap_email")
    WebElement RandomUsernamePath;

    @FindBy(id="auth-error-message-box")
    WebElement TextFromThatError;


    public void clickleftSideBar(){
        leftsidebar.click();
    }
    public void clickproductbydepartementelectronics(){
        electronics.click();
    }
    public void clicktelevisionandvideo(){
        televisionAndvideo.click();
    }
    public void clickTelevisions(){
        televisions.click();
    }
    public void click32inchesandUnder(){
        ttinchesandUnder.click();
    }
    public void clicksortingdropdown(){
        sortingdropdown.click();
    }
    public void clickpricedescending(){
        pricedescending.click();
    }
    public void clickProductlink(){
        sansui.click();
    }
    public void clickaddtolist(){
        addtolist.click();
    }
    public String VerifytheSignInpageisshowingup(){ return SignInpageisshowingup.getText();}
    public void RandomUsername(){
        RandomUsernamePath.sendKeys("rofikGintang");
    }
    public String GetTheTextFromThatError(){return TextFromThatError.getText();}
}
