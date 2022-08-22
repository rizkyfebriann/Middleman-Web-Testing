package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static demo.utils.Constants.timeout;

public class MiddlemanUserProductsPages extends BasePageObject {
    public static final String DIR = System.getProperty("user.dir");
    public static String IMAGE_FOLDER = DIR + "/src/test/resources/image";

    By elementMenuMyProduct = By.xpath("//a[text()='My Product'][1] ");
    By elementHeaderPageMyProduct = By.xpath("//h1[contains(text(),'My Product')]");
    By elementButtonAddProduct = By.id("btn-add");
    By elementModalBoxAddProduct = By.xpath("//*[@id=\"__next\"]/div[5]/div");
    By elementInputProductImage = By.id("input-image");
    By elementInputProductName = By.id("input-name");
    By elementInputProductUnit = By.id("input-unit");
    By elementInputProductStock = By.id("input-stock");
    By elementInputProductPrice = By.id("input-price");
    By elementBtnAdd = By.id("btn-add");
    By elementBtnCancel = By.id("btn-cancel");
    By elementLabelDashboard = By.xpath("//h1[contains(text(),'Dashboard')]");

//    By elementinputProductImage = By.xpath("//body/div[@id='__next']/div[6]/div[1]/form[1]/input[1]");

//    By elementinputProductName = By.xpath ("//body/div[@id='__next']/div[6]/div[1]/form[1]/input[2]");
//    By elementinputDataUnit = By.xpath("//body/div[@id='__next']/div[6]/div[1]/form[1]/input[3]");
//    By elementinputDataStock = By.xpath("//body/div[@id='__next']/div[6]/div[1]/form[1]/div[1]/input[1]");
//    By elementinputDataPrice = By.xpath("//body/div[@id='__next']/div[6]/div[1]/form[1]/div[1]/input[2]");
//    By elementButtonSuccessAdd = By.xpath("//body/div[@id='__next']/div[6]/div[1]/form[1]/div[2]/button[1]");
//

    public void clickMenuMyProduct() throws InterruptedException {
        waitUntil(ExpectedConditions.elementToBeClickable(elementMenuMyProduct), timeout);
        clickOn(elementMenuMyProduct);
    }
    public boolean isSuccessRedirectToMyProduct() {
        wait(2000);
        return isPresent(elementHeaderPageMyProduct);
    }

    public void clickButtonAddProduct() {
        clickOn(elementButtonAddProduct);
    }
    public void inputProductImage(String image) {
        wait(2000);
        WebElement element= getDriver().switchTo().activeElement().findElement(elementInputProductImage);
        element.sendKeys(IMAGE_FOLDER + "/beras_pulen.jpeg");
//        typeOn(elementInputProductImage, image);
    }

    public void inputProductName(String name){
        wait(2000);
        typeOn(elementInputProductName, name);
    }
    public void inputProductUnit(String unit) {
        wait(2000);
        typeOn(elementInputProductUnit, unit);
    }
    public void inputProductPrice(String price) {
        typeOn(elementInputProductPrice, price);
    }
    public void inputinputProductStock(String stock) {
        typeOn(elementInputProductStock, stock);
    }
    public void clickOnBtnAddPopUp() {
        clickOn(elementBtnAdd);
    }
    public void clickOnBtnCancelPopUp() {
        clickOn(elementBtnCancel);
    }
    public void alertSuccessfullyAddProduct() {
        generalAlertAccept2();
    }
    public boolean isSuccessfullyAddProduct() {
        wait(5000);
        return isPresent(elementHeaderPageMyProduct);
    }

    public boolean isStillOnPopUpAddProduct() {
        wait(5000);
        return isPresent(elementModalBoxAddProduct);
    }
}
