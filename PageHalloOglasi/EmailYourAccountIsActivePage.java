package PageHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmailYourAccountIsActivePage extends BaseHalloOglasi {
    public EmailYourAccountIsActivePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tr//td[contains(text(),'Vaš nalog je uspešno aktiviran!')]")
    WebElement clickOnYourAccountIsActive;

    public EmailYourAccountIsActivePage openEmailYourAccountIsActive(){
        wdWait.until(ExpectedConditions.elementToBeClickable(clickOnYourAccountIsActive));
        clickOnYourAccountIsActive.click();
        return this;
    }
}
