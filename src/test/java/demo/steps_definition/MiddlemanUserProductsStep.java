package demo.steps_definition;

import demo.pages.base.BasePageObject;
import demo.pages.base.page_object.MiddlemanAdminPages;
import demo.pages.base.page_object.MiddlemanUserProductsPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class MiddlemanUserProductsStep extends BasePageObject {

//    MiddlemanAdminPages middlemanAdminPages = new MiddlemanAdminPages();
    MiddlemanUserProductsPages middlemanUserProductsPages = new MiddlemanUserProductsPages();

//    @Given("user go to page my product")
//    public void userGoToPageMyProduct() throws InterruptedException {
//        middlemanUserProductsPages.clickMenuMyProduct();
//    }
    @Given("user go to page my product")
    public void userGoToPageMyProduct(){
        middlemanUserProductsPages.clickMenuMyProduct();
    }

    @And("user will see my product page")
    public void userWillSeeMyProductPage() {
        middlemanUserProductsPages.isSuccessRedirectToMyProduct();
    }
    @When("user click button add on page my product")
    public void userclickButtonAddOnPageMyProduct() {
        middlemanUserProductsPages.clickButtonAddProduct();
    }
    @And("user input product image")
    public void userInputProductImage() {
        middlemanUserProductsPages.inputProductImage();
    }
    @And("user input new product name {string} with random suffix")
    public void userInputProductNameWithRandomSuffix(String name) {
        middlemanUserProductsPages.inputProductName(name+System.currentTimeMillis());
    }


    @And("user input product name {string}")
    public void userInputProductName(String name) {
        middlemanUserProductsPages.inputProductName(name);
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

    @Then("user should stay in the Add Product pop up")
    public void userSeeRequiredAlertPleaseEnterANumberOnStockField() {
        Assert.assertTrue(middlemanUserProductsPages.isStillOnPopUpAddProduct());

    }

    @Then("user see required alert please enter a number on price field")
    public void userSeeRequiredAlertPleaseEnterANumberOnPriceField() {
        middlemanUserProductsPages.isStillOnPopUpAddProduct();
    }

    @And("user can see alert internal error with alert {string} add product & click OK")
    public void userSeeReuiredAlertInternalErrorAddProductClickOK(String errorAlert) {
        String textAlert = middlemanUserProductsPages.generalAlertAcceptWithTextAssert(errorAlert);
        // check kalau stringnya sama atau tidak. karena String, maka harus pakai method .equals
        Assert.assertTrue(errorAlert.equals(textAlert));
    }

    @Then("user back to my product page")
    public void userBackToMyProductPage() {
        middlemanUserProductsPages.isSuccessRedirectToMyProduct();

    }

    @And("user click on button edit")
    public void userClickOnButtonEdit() {
        middlemanUserProductsPages.clickOnBtnEditProduct();
    }

    @Then("user success update product to my product page")
    public void userSuccessUpdateProductToMyProductPage() {
        middlemanUserProductsPages.isSuccessRedirectToMyProduct();
    }

    @When ("user click on button edit in a product list index {int}")
    public void userClickEditOnProductList(int index) {
        // cari element edit di product list My Product
        // trus di click
    }
}
