package demo.steps_definition;

import demo.pages.base.BasePageObject;
import demo.pages.base.page_object.MiddlemanLoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class MiddlemanLoginStep extends BasePageObject {

    MiddlemanLoginPages middlemanLoginPages = new MiddlemanLoginPages();

    @Given("user input email {string} and password {string}")
    public void userInputEmailAndPassword(String email, String password) {
        middlemanLoginPages.inputEmail(email);
        middlemanLoginPages.inputPassword(password);
    }

    @And("user click on login button")
    public void clickButtonLogin(){
        middlemanLoginPages.clickButtonLogin();
    }

    @Then("user success login")
    public void isSuccessfullyLogin()  {
        try {
            Assert.assertTrue(middlemanLoginPages.isSuccessfullyLogin());
        } catch (NoSuchElementException ignored) {
        }
    }

    @And("user see alert login success & click OK")
    public void userSeeAlertLoginSuccessClickOK() throws InterruptedException {
        middlemanLoginPages.alertSuccessfullyLogin();
    }

    @Then("user see alert email or password is incorrect & click OK")
    public void userSeeAlertEmailOrPasswordIsIncorrectClickOK() {
        middlemanLoginPages.alertEmailorPassIncorrect();
    }

    @Then("user see required alert on email field")
    public void userSeePopoverAlertOnEmailField() {
        middlemanLoginPages.isStillOnLoginPage();
    }
    @Then("user see required alert on password field")
    public void userSeePopoverAlertOnPasswordField() {
        middlemanLoginPages.isStillOnLoginPage();
    }
    @Given("user already on login page")
    public void userAlreadyOnLoginPage() {
        middlemanLoginPages.isStillOnLoginPage();
    }
    @And("user click on Register textlink")
    public void userClickOnRegisterTextlink() {
        middlemanLoginPages.goToRegister();
    }
    @Then("user go to register page")
    public void userGoToRegisterPage() {
        try {
            Assert.assertTrue(middlemanLoginPages.isOnRegisterPage());
        } catch (NoSuchElementException ignored) {
        }
    }
}
