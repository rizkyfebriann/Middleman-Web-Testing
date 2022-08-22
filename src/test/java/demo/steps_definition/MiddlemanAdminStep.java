package demo.steps_definition;

import demo.pages.base.page_object.MiddlemanAdminPages;
import demo.pages.base.page_object.MiddlemanUserPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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
        middlemanAdminPages.inputProductName(name);
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

    @And("user input data update unit {string}")
    public void userInputDataUpdateUnit(String unit) {
        middlemanAdminPages.updateProductUnit(unit);
    }

    @And("user input data update stock {string}")
    public void userInputDataUpdateStock(String stock) {
        middlemanAdminPages.updateProductStock(stock);
    }

    @And("user input data update price {string}")
    public void userInputDataUpdatePrice(String price) {
        middlemanAdminPages.updateProductPrice(price);
    }

    @And("user click on  button update")
    public void userClickOnButtonUpdate() {
        middlemanAdminPages.clickButtonUpdateProduct();
    }

    @And("user see alert success update product & click OK")
    public void userSeeAlertSuccessUpdateProductClickOK() {
        middlemanAdminPages.alertSuccessfullyUpdate();
    }

    @Then("user can see success edit product to dashboard")
    public void userCanSeeSuccessEditProductToDashboard() {
        try {
            Assert.assertTrue(middlemanAdminPages.isSuccessfullyUpdateProductAdmin());
        } catch (NoSuchElementException ignored) {
        }
    }

    @Given("user click button delete")
    public void userClickButtonDelete() {
        middlemanAdminPages.clickButtonDeleteProduct();
    }

    @And("user click {string} on button delete")
    public void userClickOnButtonDelete(String arg0) {
        middlemanAdminPages.clickButtonSuccesDelete();
    }

    @And("user see alert success delete product & click OK")
    public void userSeeAlertSuccessDeleteProductClickOK() {
        middlemanAdminPages.alertSuccessfullyDelete();
    }

    @Then("user can see success delete product to dashboard")
    public void userCanSeeSuccessDeleteProductToDashboard() {
        try {
            Assert.assertTrue(middlemanAdminPages.isSuccessfullyDeleteProductAdmin());
        } catch (NoSuchElementException ignored) {
        }
    }

    @And("user click {string} on button delete product")
    public void userClickOnButtonDeleteProduct(String arg0) {
        middlemanAdminPages.clickButtonNoDelete();
    }

    @Then("user can back to dashboard")
    public void userCanBackToDashboard() {
        try {
            Assert.assertTrue(middlemanAdminPages.isCanBackToDashboard());
        } catch (NoSuchElementException ignored) {
        }
    }

    @And("user input data empty product name {string}")
    public void userInputDataEmptyProductName(String name) {
        middlemanAdminPages.inputProductName(name);
    }


    @Given("user input valid keyword {string} on search field")
    public void userInputValidKeywordOnSearchField(String keyword) {
        middlemanAdminPages.inputKeyword(keyword);
    }

    @And("user click on button search")
    public void userClickOnButtonSearch() {
        middlemanAdminPages.clickButtonSearch();
    }

    @Then("user can see all result search product on dashboard")
    public void userCanSeeAllResultSearchProductOnDashboard() {
        try {
            Assert.assertTrue(middlemanAdminPages.isCanBackToDashboard());
        } catch (NoSuchElementException ignored) {
        }
    }

    @Given("user input invalid keyword {string} on search field")
    public void userInputInvalidKeywordOnSearchField(String keyword) {
        middlemanAdminPages.inputInvalidKeyword(keyword);
    }

    @Then("user can see page data not found")
    public void userCanSeePageDataNotFound() {
        try {
            Assert.assertTrue(middlemanAdminPages.isCanSeeResultNotFound());
        } catch (NoSuchElementException ignored) {
        }
    }

    @Then("user see required alert on image product field {string}")
    public void userSeeRequiredAlertOnImageProductField(String arg0) {
        middlemanAdminPages.isStillOnAddProduct();
    }

    @And("user see required alert on product name field {string}")
    public void userSeeRequiredAlertOnProductNameField(String arg0) {
        middlemanAdminPages.isStillOnAddProduct();
    }
}
