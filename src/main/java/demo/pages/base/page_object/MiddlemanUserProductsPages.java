package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static demo.utils.Constants.timeout;

public class MiddlemanUserProductsPages extends BasePageObject {
    public static final String DIR = System.getProperty("user.dir");
    public static String IMAGE_FOLDER = DIR + "/src/test/resources/image";
    By elementMenuMyProduct = By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]");
//    By elementMenuMyProduct = By.xpath("//a[text()='My Product'][1]");
    By elementHeaderPageMyProduct = By.xpath("//h1[contains(text(),'My Product')]");
    By elementButtonAddProduct = By.id("btn-add-modal");
    By elementModalBoxAddProduct = By.xpath("//*[@id=\"__next\"]/div[5]/div");
    By elementInputProductImage = By.xpath("//form[@id='form-add']//input[@id='input-image']");
    By elementInputProductName = By.xpath("//form[@id='form-add']//input[@id='input-name']");
    By elementInputProductUnit = By.xpath("//form[@id='form-add']//input[@id='input-unit']");




    By elementInputProductStock = By.xpath("//body/div[@id='__next']/div[5]/div[1]/form[1]/div[1]/input[1]");
    By elementInputProductPrice = By.xpath("//body/div[@id='__next']/div[5]/div[1]/form[1]/div[1]/input[2]");



    By elementEditInputProductImage = By.xpath("//form[@id='form-edit']//input[@id='input-image']");
    By elementEditInputProductName = By.xpath("//form[@id='form-edit']//input[@id='input-name']");
    By elementEditInputProductUnit = By.xpath("//form[@id='form-edit']//input[@id='input-unit']");
    By elementEditInputProductStock = By.xpath("//body/div[@id='__next']/div[5]/div[1]/form[1]/div[1]/input[1]");
    By elementEditInputProductPrice = By.xpath("//body/div[@id='__next']/div[5]/div[1]/form[1]/div[1]/input[2]");



    By elementBtnAdd = By.id("btn-add");
    By elementBtnCancel = By.id("btn-cancel");
    By elementLabelDashboard = By.xpath("//h1[contains(text(),'Dashboard')]");
    By elementBtnEditProduct = By.id("btn-edit");
    By elementBtnCancelProduct = By.id("btn-cancel");

    public void clickMenuMyProduct(){
       wait(5000);
        clickOn(elementMenuMyProduct);
    }
    public boolean isSuccessRedirectToMyProduct() {
        wait(2000);
        return isPresent(elementHeaderPageMyProduct);
    }

    public void clickButtonAddProduct() {
        wait(2000);
        clickOn(elementButtonAddProduct);
    }
    public void inputProductImage() {
        wait(2000);
        WebElement element= getDriver().switchTo().activeElement().findElement(elementInputProductImage);
        element.sendKeys(IMAGE_FOLDER + "/beras_pulen.jpeg");
//        typeOn(elementInputProductImage, image + (IMAGE_FOLDER + "/beras_pulen.jpeg"));
    }

    public void inputProductName(String name){
        typeOn(elementInputProductName, name);
    }
    public void inputProductUnit(String unit) {
        typeOn(elementInputProductUnit, unit);
    }
    public void inputProductPrice(String price) {
        typeOn(elementInputProductPrice, price);
    }
    public void inputProductStock(String stock) {
        typeOn(elementInputProductStock, stock);
    }

    public void editProductName(String name){
        typeOn(elementEditInputProductName, name);
    }
    public void editProductUnit(String unit) {
        typeOn(elementEditInputProductUnit, unit);
    }
    public void editProductPrice(String price) {
        typeOn(elementEditInputProductPrice, price);
    }
    public void editProductStock(String stock) {
        typeOn(elementEditInputProductStock, stock);
    }





    public void clickOnBtnAddPopUp() {
        wait(1000);
        clickOn(elementBtnAdd);
    }
    public void clickOnBtnCancelPopUp() {
        clickOn(elementBtnCancel);
    }
    public void alertSuccessfullyAddProduct() {
        generalAlertAccept(15);
    }
    public boolean isSuccessfullyAddProduct() {
        wait(5000);
        return isPresent(elementHeaderPageMyProduct);
    }

    public boolean isStillOnPopUpAddProduct() {
        wait(5000);
        return isPresent(elementModalBoxAddProduct);
    }
    public void clickOnBtnEditProduct() {
          clickOn(elementBtnEditProduct);
    }

    public void clickOnBtnEditProduct(int index) {
        String xpathEditButton = "//button[@id='btn-edit-modal'][" + index + "]";
        By elementEditButton = By.xpath(xpathEditButton);
        clickOn(elementEditButton);
    }

    public void clickOnBtnCancelProduct() {
        clickOn(elementBtnCancelProduct);
    }
}
