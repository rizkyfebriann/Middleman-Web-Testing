package demo.steps_definition;

import demo.pages.base.BasePageObject;
import demo.pages.base.page_object.MiddlemanCartPages;
import demo.pages.base.page_object.MiddlemanLoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class MiddlemanCartStep extends BasePageObject {
    MiddlemanCartPages middlemanCartPages = new MiddlemanCartPages();


    @When("user click button add")
    public void userClickButtonAdd() {
        middlemanCartPages.clickBtnAdd();
    }

    @And("user see alert sucsess add to cart & click OK")
    public void userSeeAlertSucsessAddToCartClickOK() {
        try {
            Assert.assertTrue(middlemanCartPages.isSuccessfullyAddToCart());
        } catch (NoSuchElementException ignored) {
        }
    }

    @And("user click My Cart")
    public void userClickMyCart() {
        middlemanCartPages.clickMyCart();
    }

    @Then("user can see the shopping cart added")
    public void userCanSeeTheShoppingCartAdded() {
        middlemanCartPages.isSuccessSeeAddToCart();
    }


}

