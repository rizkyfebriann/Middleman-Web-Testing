package demo.steps_definition;

import demo.pages.base.page_object.MiddlemanLoginPages;
import demo.pages.base.page_object.MiddlemanRegisterPages;
import demo.pages.base.page_object.MiddlemanUserPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MiddlemanUserStep1 {
    MiddlemanRegisterPages middlemanRegisterPages = new MiddlemanRegisterPages();
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

    @When("user open page my profile and click button edit")
    public void userOpenPageMyProfileAndClickButtonEdit() {
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
    @Then("user can see sucsess edit profile and klik ok")
    public void userCanSeeSucsessEditProfile() {
        middlemanUserPages.alertSuccessfullyEditProfile();
    }

    @And("user can see alert phone number less then ten digit & click OK")
    public void userCanSeeAlertPhoneNumberLessThenTenDigitClickOK() {
        middlemanUserPages.alertNoSuccessEditProfile();
    }
    @Then("user stay in the pop up edit profile")
    public void userStayInThePopUpEditProfile() {
        Assert.assertTrue(middlemanUserPages.isStillOnPopUpEdit());
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

    @Then("user see alert name minimal format two character")
    public void userSeeAlertNameMinimalFormatTwoCharacter() {
        middlemanUserPages.alertEditFieldIsEmpty();
    }

    @And("user input data empty email {string}")
    public void userInputDataEmptyEmail(String email) {
        middlemanUserPages.inputEmailClear(email);
    }

    @And("user input data empty phone number {string}")
    public void userInputDataEmptyPhoneNumber(String phone) {
        middlemanUserPages.inputPhoneClear(phone);
    }

//    @Then("user can see pop up alert please fill out this field")
//    public void userCanSeePopUpAlertPleaseFillOutThisField() {
////        Assert.assertTrue(middlemanUserPages.isStillOnFieldEmail());
//
//
//    }

    @And("user input data empty address {string}")
    public void userInputDataEmptyAddress(String address) {
        middlemanUserPages.inputAddressClear(address);

    }

    @When("user open page my profile and click button delete")
    public void userOpenPageMyProfileAndClickButtonDelete() {
        middlemanUserPages.clickButtonDeleteProfile();
    }

    @And("user can see pop up verifikasi delete")
    public void userCanSeePopUpVerifikasiDelete() {
        middlemanUserPages.alertModalBoxDeleteProfile() ;
    }

    @And("user choose button yes")
    public void userChooseButtonYes() {
        middlemanUserPages.clickButtonYesDeleteProfile() ;
    }

    @And("user see alert success delete data and klik ok")
    public void userSeeAlertSuccessDeleteDataAndKlikOk() {
        middlemanUserPages.generalAlertAccept(2000);
    }

    @Then("user can see redirect to login page")
    public void userCanSeeRedirectToLoginPage() {
        Assert.assertTrue(middlemanUserPages.isRedirecToLoginPage());
       }

    @And("user choose button no")
    public void userChooseButtonNo() {
        middlemanUserPages.clickBtnNoDeleteProfile();
    }

    @Then("user should be redirect to page my profile")
    public void userShouldBeRedirectToPageMyProfile() {
        middlemanUserPages.isSuccessBackToPageMyProfile();
    }

    @And("user input data name with one char {string}")
    public void userInputDataNameWithOneChar(String name) {
        middlemanUserPages.inputNameClear(name);
    }

    @And("user see alert name minimal format two character & click OK")
    public void userSeeAlertNameMinimalFormatTwoCharacterClickOK() {
        middlemanUserPages.generalAlertAccept();
    }
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



