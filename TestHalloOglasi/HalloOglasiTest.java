package TestHalloOglasi;

import BaseHalloOglassi.BaseHalloOglasi;
import PageHalloOglasi.*;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HalloOglasiTest extends BaseHalloOglasi {
    private HomePage homePage;
    private LogInPage logInPage;
    private RegistrationPage registrationPage;
    private CheckMessageAfterRegistrationAccountPage checkMessageAfterRegistrationAccountPage;
    private MailinatorHomePage mailinatorHomePage;
    private EmailPleaseActivateYourAccountPage emailPleaseActivateYourAccountPage;
    private OpenedEmailPleaseActivateYourAccountPage openedEmailPleaseActivateYourAccountPage;
    private CheckMessageAfterActivateAccountPage checkMessageAfterActivateAccountPage;
    private EmailYourAccountIsActivePage emailYourAccountIsActivePage;
    private OpenedEmailYourAccountIsActivePage openedEmailYourAccountIsActivePage;
    private LogInFromEmailYourAccountIsActivePage logInFromEmailYourAccountIsActivePage;

    @Before
    public void define(){
        homePage = new HomePage();
        logInPage = new LogInPage();
        registrationPage = new RegistrationPage();
        checkMessageAfterRegistrationAccountPage = new CheckMessageAfterRegistrationAccountPage();
        mailinatorHomePage = new MailinatorHomePage();
        emailPleaseActivateYourAccountPage = new EmailPleaseActivateYourAccountPage();
        openedEmailPleaseActivateYourAccountPage = new OpenedEmailPleaseActivateYourAccountPage();
        checkMessageAfterActivateAccountPage = new CheckMessageAfterActivateAccountPage();
        emailYourAccountIsActivePage = new EmailYourAccountIsActivePage();
        openedEmailYourAccountIsActivePage = new OpenedEmailYourAccountIsActivePage();
        logInFromEmailYourAccountIsActivePage = new LogInFromEmailYourAccountIsActivePage();
    }

    String userName = RandomStringUtils.randomAlphanumeric(10);
    String email = RandomStringUtils.randomAlphanumeric(7) + "@mailinator.com";
    String password = RandomStringUtils.randomAlphanumeric(8);
    String urlMailinator = "https://www.mailinator.com/";
    String urlCheckingSuccessfulActivateEmail = "https://www.mailinator.com/v4/public/inboxes.jsp?to=eqrlyjp";

    @Test
    public void test(){
        homePage.acceptCookies();
        js.executeScript("window.scrollBy(0,900)");
        js.executeScript("window.scrollBy(0, -900)");
        homePage.clickOnUlogujSe();
        logInPage.clickOnRegisterButton();
        registrationPage
                .clickOnFizickoLice()
                .enterUserName(userName)
                .enterEmail(email)
                .enterPassword(password)
                .reEnterPassword(password)
                .checkingSpamBox();
        registrationPage.clickOnRegistrujSe();
        Assert.assertTrue(checkMessageAfterRegistrationAccountPage.checkingMessage());
        driver.get(urlMailinator);
        mailinatorHomePage
                .enteringEmail(email)
                .clickOnGo();
        emailPleaseActivateYourAccountPage.clickOnNewEmail();
        openedEmailPleaseActivateYourAccountPage.activateUserAccount();
        Assert.assertTrue(checkMessageAfterActivateAccountPage.checkingMessageAfterActivateAccount());
        driver.get(urlCheckingSuccessfulActivateEmail);
        emailYourAccountIsActivePage.openEmailYourAccountIsActive();
        openedEmailYourAccountIsActivePage.clickOnUlogujSeInEmailVasNalogJeAktivan();
        logInFromEmailYourAccountIsActivePage.LoginInGoogle();
    }
}
