package demo.steps_definition;

import demo.pages.base.page_object.MiddlemanLoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class MiddlemanLoginStep {

    MiddlemanLoginPages middlemanLoginPages = new MiddlemanLoginPages();

    @Given("user input {string} and {string}")
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

}
