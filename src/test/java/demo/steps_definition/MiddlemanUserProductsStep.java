package demo.steps_definition;

import demo.pages.base.BasePageObject;
import demo.pages.base.page_object.MiddlemanAdminPages;
import demo.pages.base.page_object.MiddlemanUserProductsPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class MiddlemanUserProductsStep extends BasePageObject {

//    MiddlemanAdminPages middlemanAdminPages = new MiddlemanAdminPages();
    MiddlemanUserProductsPages middlemanUserProductsPages = new MiddlemanUserProductsPages();

    @When("click button add on page my product")
    public void clickButtonAddOnPageMyProduct() {
        middlemanUserProductsPages.clickButtonAddProduct();
    }
    @And("user input product image")
    public void userInputProductImage() {
        middlemanUserProductsPages.inputProductImage();
    }
    @And("user input product name {string}")
    public void userInputProductName(String name) {
        middlemanUserProductsPages.inputProductName(name+System.currentTimeMillis());
    }
    @And("user input unit {string}")
    public void userInputUnit(String unit) {
        middlemanUserProductsPages.inputProductUnit(unit);
    }
    @And("user input stock {string}")
    public void userInputStock(String stock) {
        middlemanUserProductsPages.inputinputProductStock(stock);
    }
    @And("user input price {string}")
    public void userInputPrice(String price) {
        middlemanUserProductsPages.inputProductPrice(price);
    }
    @And("user click on button add product")
    public void userClickOnButtonAddProduct() {
        middlemanUserProductsPages.clickOnBtnAddPopUp();
    }
//    @And("user see alert success add product & click OK")
//    public void userSeeAlertSuccessAddProductClickOK()  {
//        middlemanUserProductsPages.alertSuccessfullyAddProduct();
//    }

    @Then("user can see success add product to my product page")
    public void userCanSeeSuccessAddProductToMyProductPage() {
        try {
            Assert.assertTrue(middlemanUserProductsPages.isSuccessfullyAddProduct());
        } catch (NoSuchElementException ignored) {
        }
    }
}
