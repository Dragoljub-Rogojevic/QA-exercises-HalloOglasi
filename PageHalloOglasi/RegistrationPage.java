package PageHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends BaseHalloOglasi {
    public RegistrationPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[value=\"person\"][backbone-id=\"19\"]")
    WebElement fizickoLice;

    @FindBy(css = "[id=\"UserName\"]")
    WebElement korisnickoIme;

    @FindBy(css = "[id=\"Email\"]")
    WebElement emailMailinator;

    @FindBy(css = "[id=\"Password\"]")
    WebElement enteringPassword;

    @FindBy(css = "[id=\"ConfirmPassword\"]")
    WebElement repeatPassword;

    @FindBy(id = "AllowSendingNewsletters")
    WebElement checkSpamBox;

    @FindBy(css = "[class=\"buttons-wrapper\"]")
    WebElement registrujSe;

    public RegistrationPage clickOnFizickoLice(){
        wdWait.until(ExpectedConditions.elementToBeClickable(fizickoLice));
        if(!fizickoLice.isSelected()){
            fizickoLice.click();
        }
        return this;
    }

    public RegistrationPage enterUserName(String userName){
        wdWait.until(ExpectedConditions.elementToBeClickable(korisnickoIme));
        korisnickoIme.clear();
        korisnickoIme.sendKeys(userName);
        return this;
    }

    public RegistrationPage enterEmail(String email){
        wdWait.until(ExpectedConditions.elementToBeClickable(emailMailinator));
        emailMailinator.clear();
        emailMailinator.sendKeys(email);
        return this;
    }

    public RegistrationPage enterPassword(String password){
        wdWait.until(ExpectedConditions.elementToBeClickable(enteringPassword));
        enteringPassword.clear();
        enteringPassword.sendKeys(password);
        return this;
    }

    public RegistrationPage reEnterPassword(String password){
        wdWait.until(ExpectedConditions.elementToBeClickable(repeatPassword));
        repeatPassword.clear();
        repeatPassword.sendKeys(password);
        return this;
    }

    public RegistrationPage checkingSpamBox(){
        wdWait.until(ExpectedConditions.elementToBeClickable(checkSpamBox));
        if(checkSpamBox.isSelected()){
            checkSpamBox.click();
        }
        return this;
    }

    public RegistrationPage clickOnRegistrujSe(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujSe));
        registrujSe.click();
        return this;
    }

}
