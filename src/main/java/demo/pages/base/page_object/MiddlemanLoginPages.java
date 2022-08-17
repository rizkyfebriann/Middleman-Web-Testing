package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class MiddlemanLoginPages extends BasePageObject {
    By elementInputEmail = By.id("input-email");
    By elementInputPassword = By.id("input-password");
    By elementLoginButton = By.id("btn-login");
    By elementLabelDashboard = By.xpath("//h1[contains(text(),'Dashboard')]");
    By elementLoginPages = By.xpath("//body/div[@id='__next']/div[1]");
    By elementGoToRegisterPage = By.id("to-register");
    By elementRegisterTitlePage = By.xpath("//h4[contains(text(),'Create a new account')]");

    public void inputEmail(String email) {
        typeOn(elementInputEmail, email);
    }

    public void inputPassword(String password) {
        typeOn(elementInputPassword, password);
    }

    public void clickButtonLogin() {
        clickOn(elementLoginButton);
    }
    public boolean isSuccessfullyLogin() {
        wait(5000);
        return isPresent(elementLabelDashboard);
    }

    public boolean isStillOnLoginPage() {
        wait(3000);
        return isPresent(elementLoginPages);
    }

    public void alertSuccessfullyLogin() throws InterruptedException {
        alertSuccessLogin();
    }

    public void alertEmailorPassIncorrect() {
        alertEmailorPasswordIncorrect();
    }

    public void goToRegister() {
        clickOn(elementGoToRegisterPage);
    }

    public boolean isOnRegisterPage() {
        wait(2500);
        return isPresent(elementRegisterTitlePage);
    }

}
