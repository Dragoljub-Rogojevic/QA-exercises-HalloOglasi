package PageHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class CheckMessageAfterActivateAccountPage extends BaseHalloOglasi {
    public CheckMessageAfterActivateAccountPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class=\"col-md-12\"]")
    private WebElement successfulActivateAccount;

    public void moveToNewTab(){
        wdWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public boolean checkingMessageAfterActivateAccount(){
        moveToNewTab();
        wdWait.until(ExpectedConditions.elementToBeClickable(successfulActivateAccount));
        return successfulActivateAccount.isDisplayed();
    }

}
