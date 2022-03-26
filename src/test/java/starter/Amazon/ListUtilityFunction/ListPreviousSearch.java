package starter.Amazon.ListUtilityFunction;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ListPreviousSearch extends PageObject {

    @FindBy(how = How.XPATH, using = "//*[@id=\"p_n_feature_nine_browse-bin/16591230011\"]/span/a/span")
    WebElement yearpath;

    @FindBy(how = How.XPATH, using = "//*[@id=\"high-price\"]")
    WebElement pricepath;
    @FindBy(how = How.XPATH, using = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div/a/span/span[2]")
    WebElement priceResultpath;
    @FindBy(how = How.XPATH, using = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")
    WebElement nameResultpath;
    public void yearstep(){
        yearpath.click();
    }
    public void typePrice(String N){ pricepath.sendKeys(N);}
    public void PriceResult(){
        System.out.println(priceResultpath);
    }
    public void NameItemResult(){
        System.out.println(nameResultpath);
    }
}
