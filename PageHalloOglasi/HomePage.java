package PageHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseHalloOglasi {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class=\"cookie-policy-btn\"]")
    WebElement cookies;

    @FindBy(css = "[href=\"/prijava?returnUrl=%2f\"]")
    WebElement ulogujSe;

    public HomePage acceptCookies(){
        wdWait.until(ExpectedConditions.elementToBeClickable(cookies));
        cookies.click();
        return this;
    }

    public HomePage clickOnUlogujSe(){
        wdWait.until(ExpectedConditions.elementToBeClickable(ulogujSe));
        ulogujSe.click();
        return this;
    }

}
