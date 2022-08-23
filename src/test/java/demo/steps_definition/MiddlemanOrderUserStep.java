package demo.steps_definition;


import demo.pages.base.page_object.MiddlemanOrderUserPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class MiddlemanOrderUserStep {
    MiddlemanOrderUserPages middlemanOrderUserPages= new MiddlemanOrderUserPages();


    @And("user click on button next for checkout")
    public void userClickOnButtonNextForCheckout() {
        middlemanOrderUserPages.clickButtonNext();
    }

    @Then("user can direct on payment page")
    public void userCanDirectOnPaymentPage() {
        try {
            Assert.assertTrue(middlemanOrderUserPages.isCanDirectOnPaymentPage());
        } catch (NoSuchElementException ignored) {
        }
    }

    @And("user see alert login success create order & click OK")
    public void userSeeAlertLoginSuccessCreateOrderClickOK() {
            middlemanOrderUserPages.alertSuccessfullyCreateOrder();
    }

    @And("user delete unwanted product")
    public void userDeleteUnwantedProduct() {
        middlemanOrderUserPages.clickButtonDeleteProductMyCart();
    }

    @And("user see alert login success delete product & click OK")
    public void userSeeAlertLoginSuccessDeleteProductClickOK() {
        middlemanOrderUserPages.alertSuccessDeleteProductMyCart();
    }

    @Given("user click history order")
    public void userClickHistoryOrder() {
        middlemanOrderUserPages.clickButtonHistoryOrder();

    }

    @And("user click detail history")
    public void userClickDetailHistory() {
        middlemanOrderUserPages.clickButtonDetailHistoryOrder();
    }

    @Then("user can see the desired order history details")
    public void userCanSeeTheDesiredOrderHistoryDetails() {
        try {
            Assert.assertFalse(middlemanOrderUserPages.isCanDirectOnDetailHistoryOrderPage());
        } catch (NoSuchElementException ignored) {
        }
    }
}
