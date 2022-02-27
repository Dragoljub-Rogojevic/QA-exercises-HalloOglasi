package PageHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckMessageAfterRegistrationAccountPage extends BaseHalloOglasi {
    public CheckMessageAfterRegistrationAccountPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class=\"regsitration-success\"]")
    WebElement checkMessage;

    public boolean checkingMessage(){
        wdWait.until(ExpectedConditions.elementToBeClickable(checkMessage));
        return checkMessage.isDisplayed();
    }
}
