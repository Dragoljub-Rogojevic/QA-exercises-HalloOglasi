package PageHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorHomePage extends BaseHalloOglasi {
    public MailinatorHomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[id=\"search\"]")
    WebElement enterEmail;

    @FindBy(css = "[value=\"Search for public inbox for free\"]")
    WebElement go;

    public MailinatorHomePage enteringEmail(String email){
        wdWait.until(ExpectedConditions.elementToBeClickable(enterEmail));
        enterEmail.clear();
        enterEmail.sendKeys(email);
        return this;
    }

    public MailinatorHomePage clickOnGo(){
        wdWait.until(ExpectedConditions.elementToBeClickable(go));
        go.click();
        return this;
    }
}
