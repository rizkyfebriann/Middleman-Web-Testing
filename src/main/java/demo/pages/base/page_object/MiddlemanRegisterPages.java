package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class MiddlemanRegisterPages extends BasePageObject {

    By elementInputNameShop = By.id("input-name");
    By elementInputEmail = By.id("input-email");
    By elementInputPhone = By.id("input-phone");
    By elementInputPassword = By.id("input-password");
    By elementInputAddress = By.id("input-address");
    By elementSignUpButton = By.id("to-register");
    By elementGoToLoginPage = By.id("to-login");
    By elementLoginTitlePage = By.xpath("//h4[contains(text(),'Sign in to continue')]");
    By elementIsOnRegisterPage = By.xpath("//body/div[@id='__next']/div[1]");
    By elementisOnLoginPage = By.xpath("//h4[contains(text(),'Sign in to continue')]");

    public void inputNameShop(String nameShop) {
        getDriver().findElement(elementInputNameShop).clear();
        typeOn(elementInputNameShop, nameShop);
    }

//    public void inputNameClear(String name) {
//        getDriver().findElement(elementInputNameShop).clear();
//
//    }

    public void inputEmailUser(String email) {
        getDriver().findElement(elementInputEmail).clear();
        typeOn(elementInputEmail, email);
    }

//    public void inputEmailClear(String email) {
//        getDriver().findElement(elementInputNameShop).clear();
//    }

    public void inputPassword(String password) {
        typeOn(elementInputPassword, password);
    }

//    public void inputPasswordClear(String password) {
//        getDriver().findElement(elementInputNameShop).clear();
//    }

    public void inputPhone(String phone) {
        getDriver().findElement(elementInputPhone).clear();
        typeOn(elementInputPhone, phone);
    }
//    public void inputPhoneClear(String phone) {
//        getDriver().findElement(elementInputNameShop).clear();
//    }


    public void inputAddress(String address) {
        getDriver().findElement(elementInputAddress).clear();
        typeOn(elementInputAddress, address);
    }

//    public void inputAddressClear(String emil) {
//        getDriver().findElement(elementInputNameShop).clear();
//    }

    public void clickButtonSignUp() {
        clickOn(elementSignUpButton);
    }

    public void goToLogin() {
        clickOn(elementGoToLoginPage);
    }

    public void alertSuccessfullyRegister() {
        alertSuccessRegister();
    }

    public boolean isOnLoginPage() {
        wait(3000);
        return isPresent(elementLoginTitlePage);
    }

    public void alertMinimumnameShop() {
        alertMininumNameShop();
    }

    public void alertMinimumPhone() {
        alertMininumPhoneNumber();
    }

    public void alertRegisteredUser() {
        alertEmailorPhoneRegistered();
    }

    public boolean isOnRegisterPage() {
        wait(2500);
        return isPresent(elementIsOnRegisterPage);
    }

    public boolean isOpenLoginPage() {
        wait(2000);
        return isPresent(elementisOnLoginPage);
    }
}
