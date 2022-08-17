package demo.steps_definition;

import demo.pages.base.page_object.MiddlemanLoginPages;
import demo.pages.base.page_object.MiddlemanRegisterPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MiddlemanRegisterStep {


    MiddlemanRegisterPages middlemanRegisterPages = new MiddlemanRegisterPages();
    MiddlemanLoginPages middlemanLoginPages = new MiddlemanLoginPages();

    @Given("user open register page")
    public void userGoToRegister() {
        middlemanLoginPages.goToRegister();
    }

    @And("user input name shop {string}")
    public void userInputNameShop(String nameShop) {
        middlemanRegisterPages.inputNameShop(nameShop);
    }

    @And("user input email {string}")
    public void userInputEmail(String email) {
        middlemanRegisterPages.inputEmailUser(email);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        middlemanRegisterPages.inputPassword(password);
    }

    @And("user input phone number {string}")
    public void userInputPhoneNumber(String phone) {
        middlemanRegisterPages.inputPhone(phone);
    }

    @And("user input address {string}")
    public void userInputAddress(String address) {
        middlemanRegisterPages.inputAddress(address);
    }

    @Then("user click sign up button")
    public void userClickSignUpButton() {
        middlemanRegisterPages.clickButtonSignUp();
    }

    @And("user see alert register success & click OK")
    public void userSeeAlertRegisterSuccessClickOK() {
        middlemanRegisterPages.alertSuccessfullyRegister();
    }

    @Then("user redirect to login page for login account")
    public void userRedirectToLoginPageForLoginAccount() {
        middlemanRegisterPages.isOnLoginPage();
    }

    @And("user see alert name shop must be more than one characters & click OK")
    public void userSeeAlertNameShopMustBeMoreThanCharactersClickOK() {
        middlemanRegisterPages.alertMinimumnameShop();
    }

    @And("user see alert on email field for filling valid format email")
    public void userSeeAlertOnEmailFieldForFillingValidFormatEmail() {
        middlemanRegisterPages.isOnRegisterPage();
    }

    @And("user see alert minimum phone number digit is not enough and click OK")
    public void userSeeAlertMinimumPhoneNumberIsCharactersAndClickOK() {
        middlemanRegisterPages.alertMininumPhoneNumber();
    }

    @And("user see alert on name shop field for filling name shop")
    public void userSeeAlertOnNameShopFieldForFillingNameShop() {
        middlemanRegisterPages.isOnRegisterPage();
    }

    @And("user see alert on phone number field for filling valid phone number")
    public void userSeeAlertOnPhoneNumberFieldForFillingValidPhoneNumber() {
        middlemanRegisterPages.isOnRegisterPage();
    }

    @And("user see alert on password field for filling password")
    public void userSeeAlertOnPasswordFieldForFillingPassword() {
        middlemanRegisterPages.isOnRegisterPage();
    }

    @And("user see alert on address field for filling address")
    public void userSeeAlertOnAddressFieldForFillingAddress() {
        middlemanRegisterPages.isOnRegisterPage();
    }

    @And("user see alert your email or phone number already registered & click OK")
    public void userSeeAlertYourEmailOrPhoneNumberAlreadyRegisteredClickOK() {
        middlemanRegisterPages.alertRegisteredUser();
    }

    @And("user already have account and go to login page")
    public void userAlreadyHaveAccountAndGoToLoginPage() {
        middlemanRegisterPages.goToLogin();
    }

    @Then("user is on login page for login account")
    public void userIsOnLoginPageForLoginAccount() {
        middlemanRegisterPages.isOpenLoginPage();
    }
}
