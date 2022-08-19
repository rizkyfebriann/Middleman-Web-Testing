//package demo.steps_definition;
//
//import demo.pages.base.BasePageObject;
//import demo.pages.base.page_object.MiddlemanLoginPages;
//import demo.pages.base.page_object.MiddlemanRegisterPages;
//import demo.pages.base.page_object.MiddlemanUserPages;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//public class MiddlemanUserStep extends BasePageObject {
//    MiddlemanRegisterPages middlemanRegisterPages = new MiddlemanRegisterPages();
//    MiddlemanLoginPages middlemanLoginPages = new MiddlemanLoginPages();
//    MiddlemanUserPages middlemanUserPages = new MiddlemanUserPages();
//
//    @Given("user click button profile")
//    public void clickButtonProfile(){
//        middlemanUserPages.clickIconMyProfile();
//    }
////    @And("user can see pop up menu")
////    public void userCanSeePopUpMenu() {
////    }
//
//    @And("user choose button my profile")
//    public void userChooseButtonMyProfile() throws InterruptedException {
//        middlemanUserPages.clickButtonMyProfile();
//    }
//
//    @Then("user will be redirect to page my profile")
//    public void userWillBeRedirectToPageMyProfile() {
//        middlemanUserPages.isSuccessRedirectToMyProfile();
//    }
//
//    @And("user click button edit")
//    public void userClickButtonEdit() {
//        middlemanUserPages.clickButtonEditMyProfile();
//    }
//
//    @And("user can see pop up edit profile")
//    public void userCanSeePopUpEditProfile() {
//        middlemanUserPages.alertModalBoxEditProfile();
//    }
//
//    @And("user click edit button")
//    public void userClickEditButton() {
//        middlemanUserPages.clickButtonEdit();
//
//    }
//
//    @Then("user can se sucsess edit profile and klik ok")
//    public void userCanSeSucsessEditProfile() {
//        middlemanUserPages.alertSuccessfullyEditProfile();
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
//}
