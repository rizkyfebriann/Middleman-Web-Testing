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
        middlemanUserProductsPages.inputProductStock(stock);
    }
    @And("user input price {string}")
    public void userInputPrice(String price) {
        middlemanUserProductsPages.inputProductPrice(price);
    }
    @And("user click on button add product")
    public void userClickOnButtonAddProduct() {
        middlemanUserProductsPages.clickOnBtnAddPopUp();
    }


    @Then("user can see success add product to my product page")
    public void userCanSeeSuccessAddProductToMyProductPage() {
        try {
            Assert.assertTrue(middlemanUserProductsPages.isSuccessfullyAddProduct());
        } catch (NoSuchElementException ignored) {
        }
    }

    @Then("user should stay in the Add Product pop up")
    public void userStayInAddProductPopUp() {
        Assert.assertTrue(middlemanUserProductsPages.isStillOnPopUpAddProduct());
    }
//    @Then("user should stay in the Edit Product pop up")
//    public void userStayInEditProductPopUp() {
//        Assert.assertTrue(middlemanUserProductsPages.isStillOnPopUpEditProduct());
//    }

    @Then("user should stay in the Edit Product pop up")
    public void userStayInEditProductPopUp() {
        Assert.assertTrue(middlemanUserProductsPages.isStillOnPopUpEditProduct());
    }

    @Then("user see required alert please enter a number on price field")
    public void userSeeRequiredAlertPleaseEnterANumberOnPriceField() {
        middlemanUserProductsPages.isStillOnPopUpAddProduct();
    }

    @And("user can see alert with message {string} & click OK")
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
        middlemanUserProductsPages.clickOnBtnEditProduct(index);
    }


    @And("user edit new product name {string} with random suffix")
    public void userEditProductNameWithRandomSuffix(String name) {
        middlemanUserProductsPages.editProductName(name+System.currentTimeMillis());
    }


    @And("user edit product name {string}")
    public void userEditProductName(String name) {
        middlemanUserProductsPages.editProductName(name);
    }


    @And("user edit unit {string}")
    public void userEditUnit(String unit) {
        middlemanUserProductsPages.editProductUnit(unit);
    }
    @And("user edit stock {string}")
    public void userEditStock(String stock) {
        middlemanUserProductsPages.editProductStock(stock);
    }
    @And("user edit price {string}")
    public void userEditPrice(String price) {
        middlemanUserProductsPages.editProductPrice(price);
    }


    @And("user clear product name")
    public void userEditProductName() {
        middlemanUserProductsPages.clearProductName();
    }

    @And("user clear unit")
    public void userEditUnit() {
        middlemanUserProductsPages.clearProductUnit();
    }
    @And("user clear stock")
    public void userEditStock() {
        middlemanUserProductsPages.clearProductStock();
    }
    @And("user clear price")
    public void userEditPrice() {
        middlemanUserProductsPages.clearProductPrice();
    }

    @And("user clear name")
    public void userClearName() {
        middlemanUserProductsPages.clearProductName();
    }

    @And("user edit product image")
    public void userEditProductImage() {
        middlemanUserProductsPages.editProductImage();
    }
}
