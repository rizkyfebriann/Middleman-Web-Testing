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
        typeOn(elementInputNameShop, nameShop);
    }

    public void inputEmailUser(String email) {
        typeOn(elementInputEmail, email);
    }

    public void inputPassword(String password) {
        typeOn(elementInputPassword, password);
    }

    public void inputPhone(String phone) {
        typeOn(elementInputPhone, phone);
    }

    public void inputAddress(String address) {
        typeOn(elementInputAddress, address);
    }

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
        wait(2000);
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
