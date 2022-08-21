package demo.steps_definition;

import demo.pages.base.page_object.MiddlemanAdminPages;
import demo.pages.base.page_object.MiddlemanUserPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class MiddlemanAdminStep {
    MiddlemanAdminPages middlemanAdminPages = new MiddlemanAdminPages();


    @When("user click button add product")
    public void userClickButtonAddProduct() {
        middlemanAdminPages.clickButtonAddProduct();

    }

    @And("user input data product image")
    public void userInputDataProductImage() {
        middlemanAdminPages.inputProductImage();

    }

    @And("user input data product name {string}")
    public void userInputDataProductName(String name) {
        middlemanAdminPages.inputProductName(name+System.currentTimeMillis());
    }

    @And("user input data unit {string}")
    public void userInputDataUnit(String unit) {
        middlemanAdminPages.inputDataUnit(unit);
    }


    @And("user input data stock {string}")
    public void userInputDataStock(String stock) {
        middlemanAdminPages.inputDataStock(stock);
    }

    @And("user input data price {string}")
    public void userInputDataPrice(String price) {
        middlemanAdminPages.inputDataPrice(price);
    }

    @And("user click on button add")
    public void userClickOnButtonAdd() {
        middlemanAdminPages.clickButtonSuccessAdd();
    }

    @And("user see alert success add product & click OK")
    public void userSeeAlertSuccessAddProductClickOK()  {
        middlemanAdminPages.alertSuccessfullyAdd();
    }

    @Then("user can see success add product to dashboard")
    public void userCanSeeSuccessAddProductToDashboard() {
        try {
            Assert.assertTrue(middlemanAdminPages.isSuccessfullyAddProductAdmin());
        } catch (NoSuchElementException ignored) {
        }
    }

    @Then("user see required alert on stock field {string}")
    public void userSeeRequiredAlertOnStockField(String arg0) {
        middlemanAdminPages.isStillOnAddProduct();

    }

    @And("user see alert internal error add product & click OK")
    public void userSeeAlertInternalErrorAddProductClickOK() {
        middlemanAdminPages.alertInternalErrorAdd();
    }

    @And("user see alert error {string} & click OK")
    public void userSeeAlertErrorClickOK(String arg0) {
        middlemanAdminPages.alertFailedGetFile();
    }

    @And("user input data registered product name {string}")
    public void userInputDataRegisteredProductName(String name) {
        middlemanAdminPages.inputProductName(name);
    }

    @And("user see alert alert error {string} & click OK")
    public void userSeeAlertAlertErrorClickOK(String arg0) {
        middlemanAdminPages.alertWrongInput();
    }

    @When("user click button edit product")
    public void userClickButtonEditProduct() {
        middlemanAdminPages.clickButtonEditProduct();
    }

    @And("user input data update product image")
    public void userInputDataUpdateProductImage() {
        middlemanAdminPages.updateProductImage();
    }

    @And("user input data update product name {string}")
    public void userInputDataUpdateProductName(String name) {
        middlemanAdminPages.updateProductName(name);
    }
}
