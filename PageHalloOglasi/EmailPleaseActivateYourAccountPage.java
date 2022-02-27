package PageHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmailPleaseActivateYourAccountPage extends BaseHalloOglasi {
    public EmailPleaseActivateYourAccountPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tr//td[contains(text(),'Molimo aktivirajte')]")
    WebElement inboxEmail;

    public EmailPleaseActivateYourAccountPage clickOnNewEmail(){
        wdWait.until(ExpectedConditions.elementToBeClickable(inboxEmail));
        inboxEmail.click();
        return this;
    }

}
