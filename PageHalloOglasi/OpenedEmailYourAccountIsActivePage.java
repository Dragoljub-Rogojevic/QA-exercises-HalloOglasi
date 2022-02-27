package PageHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpenedEmailYourAccountIsActivePage extends BaseHalloOglasi {
    public OpenedEmailYourAccountIsActivePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[id=\"html_msg_body\"]")
    WebElement iframeUlogujSe;

    @FindBy(xpath = "//td//a//strong[contains(text(),'Uloguj se')]")
    WebElement clickOnUlogujSeInEmail;

    public void clickOnUlogujSeInEmailVasNalogJeAktivan(){
        wdWait.until(ExpectedConditions.visibilityOf(iframeUlogujSe));
        driver.switchTo().frame(iframeUlogujSe);
        wdWait.until(ExpectedConditions.elementToBeClickable(clickOnUlogujSeInEmail));
        clickOnUlogujSeInEmail.click();
        driver.switchTo().defaultContent();
    }
}
