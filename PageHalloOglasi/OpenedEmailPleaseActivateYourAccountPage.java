package PageHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpenedEmailPleaseActivateYourAccountPage extends BaseHalloOglasi {
    public OpenedEmailPleaseActivateYourAccountPage(){
        PageFactory.initElements(driver, this);
    }


    @FindBy(linkText = "Aktiviraj nalog")
    WebElement activateUser;

    @FindBy(css = "[id=\"html_msg_body\"]")
    WebElement iframe;

    public void activateUserAccount(){
        wdWait.until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);
        wdWait.until(ExpectedConditions.elementToBeClickable(activateUser));
        activateUser.click();
        driver.switchTo().defaultContent();
    }

}
