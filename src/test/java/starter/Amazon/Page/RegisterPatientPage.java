package starter.Amazon.Page;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://frontend-mr-clinic.vercel.app/register/")
public class RegisterPatientPage {
    @FindBy(id="Username")
    WebElement username;
    @FindBy(id="Email")
    WebElement email;
    @FindBy(id="Password")
    WebElement password;

    public void fillUsername(){
        username.sendKeys("jhon1");
    }

    public void fillPassword(){
        email.sendKeys("admin123");
    }

    public void clickLoginButton(){
        password.sendKeys("d");
    }
}
