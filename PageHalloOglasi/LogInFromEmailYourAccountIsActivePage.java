package PageHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class LogInFromEmailYourAccountIsActivePage extends BaseHalloOglasi {
    public LogInFromEmailYourAccountIsActivePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[id=\"Google\"]")
    WebElement clickOnGoogle;

    public void moveToNewTab(){
        wdWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public LogInFromEmailYourAccountIsActivePage LoginInGoogle(){
        moveToNewTab();
        clickOnGoogle.click();
        return this;
    }
}
