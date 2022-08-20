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

    @When("user click button add on the dashboard page")
    public void userClickButtonAddOnTheDashboardPage() {
        middlemanCartPages.clickBtnAdd();
    }

    @And("user see alert sucsess add to cart & click OK")
    public void userSeeAlertSucsessAddToCartClickOK() throws InterruptedException{
        middlemanCartPages.alertSuccessfullyAddtoCart();
//        try {
//            Assert.assertTrue(middlemanCartPages.isSuccessfullyAddToCart());
//        } catch (NoSuchElementException ignored) {
//        }
    }
    @And("user add product to cart")
    public void userAddProductToCart() {
        middlemanCartPages.clickBtnAdd();
    }

    @And("user add product2 to cart")
    public void userAddProduct2ToCart() {
        middlemanCartPages.clickBtnAdd();
    }

    @And("user click My Cart")
    public void userClickMyCart() {
        middlemanCartPages.clickMyCart();
    }

    @Then("user can see the product cart added")
    public void userCanSeeTheProductCartAdded() {
        middlemanCartPages.isSuccessSeeAddToCart();
    }

    @Then("user can see the number of item increase")
    public void userCanSeeTheNumberOfItemIncrease() {
        middlemanCartPages.textItemIncrease();
    }

    @And("user clik button plus")
    public void userClikButtonPlus() {
        middlemanCartPages.plusProduct();
    }

    @And("user clik button plus threed time")
    public void userClikButtonPlusThreedTime() {
        middlemanCartPages.plusMultipleProduct();
    }

    @And("user clik button minus")
    public void userClikButtonMinus() {
        middlemanCartPages.minusProduct();
    }

    @Then("user can see the number of item is reduced")
    public void userCanSeeTheNumberOfItemIsReduced() {
        middlemanCartPages.textItemIncrease();
    }

    @And("user clik button minus to icrease the product")
    public void userClikButtonMinusToIcreaseTheProduct() {
        middlemanCartPages.textItemIncrease();
    }

    @And("user clik button delete product")
    public void userClikButtonDeleteProduct() {
        middlemanCartPages.deleteButton();
    }

    @Then("user can see the product is remove")
    public void userCanSeeTheProductIsRemove() {
        middlemanCartPages.isSuccessSeeAddToCart();
    }
}

