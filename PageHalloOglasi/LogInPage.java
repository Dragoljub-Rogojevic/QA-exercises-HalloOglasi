package PageHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends BaseHalloOglasi {
    public LogInPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class=\"no-account-reg-link\"]")
    WebElement registrujSe;

    public LogInPage clickOnRegisterButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujSe));
        registrujSe.click();
        return this;
    }
}
