package demo.steps_definition;

import demo.pages.base.page_object.MiddlemanLoginPages;
import demo.pages.base.page_object.MiddlemanRegisterPages;
import demo.pages.base.page_object.MiddlemanUserPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MiddlemanUserStep1 {
    MiddlemanRegisterPages middlemanRegisterPages = new MiddlemanRegisterPages();
    MiddlemanLoginPages middlemanLoginPages = new MiddlemanLoginPages();
    MiddlemanUserPages middlemanUserPages = new MiddlemanUserPages();

    @Given("user click button profile")
    public void clickButtonProfile(){
        middlemanUserPages.clickIconMyProfile();
    }
//    @And("user can see pop up menu")
//    public void userCanSeePopUpMenu() {
//    }

    @And("user choose button my profile")
    public void userChooseButtonMyProfile() throws InterruptedException {
        middlemanUserPages.clickButtonMyProfile();
    }

    @Then("user will be redirect to page my profile")
    public void userWillBeRedirectToPageMyProfile() {
        middlemanUserPages.isSuccessRedirectToMyProfile();
    }

    @And("user click button edit")
    public void userClickButtonEdit() {
        middlemanUserPages.clickButtonEditMyProfile();
    }

    @And("user can see pop up edit profile")
    public void userCanSeePopUpEditProfile() {
        middlemanUserPages.alertModalBoxEditProfile();
    }

    @And("user click edit button")
    public void userClickEditButton() {
        middlemanUserPages.clickButtonEdit();

    }
    @And("user input data name {string}")
    public void userInputDataName(String name) {
        middlemanRegisterPages.inputNameShop(name);
    }

    @And("user input data email {string}")
    public void userInputDataEmail(String email) {
        middlemanRegisterPages.inputEmailUser(email);
    }

    @And("user input data phone number {string}")
    public void userInputDataPhoneNumber(String phone) {
        middlemanRegisterPages.inputPhone(phone);
    }

    @And("user input data address {string}")
    public void userInputDataAddress(String address) {
        middlemanRegisterPages.inputAddress(address);
    }
    @Then("user can se sucsess edit profile and klik ok")
    public void userCanSeSucsessEditProfile() {
        middlemanUserPages.alertSuccessfullyEditProfile();
    }

    @And("user can see alert phone number less then ten digit & click OK")
    public void userCanSeeAlertPhoneNumberLessThenTenDigitClickOK() {
        middlemanUserPages.alertNoSuccessEditProfile();
    }
    @Then("user stay in the pop up edit profile")
    public void userStayInThePopUpEditProfile() {
        middlemanUserPages.isStillOnPopUpEdit();
    }

    @And("user see alert your email not failed & click OK")
    public void userSeeAlertYourEmailNotFailedClickOK() {
        middlemanUserPages.alertEditEmailIncorrect();
    }

    @Then("user see alert on email field for filling email")
    public void userSeeAlertOnEmailFieldForFillingEmail() {
        Assert.assertTrue(middlemanUserPages.isStillOnPopUpEdit());
    }

    @And("user input data empty name {string}")
    public void userInputDataEmptyName(String name) {
        middlemanUserPages.inputNameClear(name);
    }

    @Then("user see alert on name field for filling name")
    public void userSeeAlertOnNameFieldForFillingName() {
        middlemanUserPages.isStillOnPopUpEdit();
    }



//    @And("user input name {string}")
//    public void userInputName(String name ) {
//    }
//
//    @Then("user see required alert on username field")
//    public void userSeeRequiredAlertOnUsernameField() {
//    }
//
//    @And("user input name {string}")
//    public void userInputName(String name) {
//        middlemanRegisterPages.inputNameShop(name);
//    }
//
//    @And("user input email1 {string}")
//    public void userInputEmail(String email) {
//        middlemanRegisterPages.inputEmailUser(email);
//    }
//
//    @And("user input phone number1 {string}")
//    public void userInputPhoneNumber( String phone) {
//        middlemanRegisterPages.inputPhone(phone);
//    }
//
////    @And("user input password1 {string}")
////    public void userInputPassword( String ar) {
////    }
//
//    @And("user input address1 {string}")
//    public void userInputAddress(String address) {
//        middlemanRegisterPages.inputAddress(address);
//    }
//
//    @Then("user see required alert on username field")
//    public void userSeeRequiredAlertOnUsernameField() {
//        middlemanUserPages.isStillOnEditPage();
//    }
//
//    @And("user input data name {string}, email {string}, phone number {string}, address {string}")
//    public void userInputDataNameEmailPhoneNumberAddress(String name, String email, String phone, String address) {
//        middlemanRegisterPages.inputNameShop(name);
//        middlemanRegisterPages.inputEmailUser(email);
//        middlemanRegisterPages.inputPhone(phone);
//        middlemanRegisterPages.inputAddress(address);
//    }


}
