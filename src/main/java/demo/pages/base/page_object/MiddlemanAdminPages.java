package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MiddlemanAdminPages extends BasePageObject {
    public static final String DIR = System.getProperty("user.dir");
    public static String IMAGE_FOLDER = DIR + "/src/test/resources/image";

    By elementButtonAddProduct = By.id("btn-add");
    By elementinputProductImage = By.xpath("//body/div[@id='__next']/div[6]/div[1]/form[1]/input[1]");
    By elementinputProductName = By.xpath ("//body/div[@id='__next']/div[6]/div[1]/form[1]/input[2]");
    By elementinputDataUnit = By.xpath("//body/div[@id='__next']/div[6]/div[1]/form[1]/input[3]");
    By elementinputDataStock = By.xpath("//body/div[@id='__next']/div[6]/div[1]/form[1]/div[1]/input[1]");
    By elementinputDataPrice = By.xpath("//body/div[@id='__next']/div[6]/div[1]/form[1]/div[1]/input[2]");
    By elementButtonSuccessAdd = By.xpath("//body/div[@id='__next']/div[6]/div[1]/form[1]/div[2]/button[1]");
    By elementLabelDashboard = By.xpath("//h1[contains(text(),'Dashboard')]");
    By elementModalBoxAddProduct = By.xpath("//body/div[@id='__next']/div[6]/div[1]");
    By elementButtonEditProduct = By.id("btn-edit-modal");
    By elementUpdateProductImage = By.xpath("//body/div[@id='__next']/div[5]/div[8]/div[1]/section[1]/form[1]/input[1]");
    By elemenUpdateProductName = By.xpath ("");

    public void clickButtonAddProduct() {
        clickOn(elementButtonAddProduct);
    }
    public void inputProductImage() {
        wait(2000);
        WebElement element= getDriver().switchTo().activeElement().findElement(elementinputProductImage);
        element.sendKeys(IMAGE_FOLDER + "/ultramilk.jpeg");
    }

    public void inputProductName(String name){
        wait(2000);
        WebElement element= getDriver().switchTo().activeElement().findElement(elementinputProductName);
        element.sendKeys(name);
    }

    public void inputDataUnit(String unit){
        wait(2000);
        WebElement element= getDriver().switchTo().activeElement().findElement(elementinputDataUnit);
        element.sendKeys(unit);
    }

    public void inputDataStock(String stock) {
        wait(2000);
        WebElement element = getDriver().switchTo().activeElement().findElement(elementinputDataStock);
        element.sendKeys(stock);
    }
    public void inputDataPrice(String stock) {
        wait(2000);
        WebElement element = getDriver().switchTo().activeElement().findElement(elementinputDataPrice);
        element.sendKeys(stock);
    }
    public void clickButtonSuccessAdd() {
        clickOn(elementButtonSuccessAdd);
    }

    public void alertSuccessfullyAdd() {
        alertSuccessAddProductAdmin();

    }
    public boolean isSuccessfullyAddProductAdmin() {
        wait(5000);
        return isPresent(elementLabelDashboard);
    }

    public boolean isStillOnAddProduct() {
        wait(5000);
        return isPresent(elementModalBoxAddProduct);
    }
    public void alertInternalErrorAdd(){
        alertErrorInternalAddProductAdmin();
    }
    public void alertFailedGetFile(){
        alertErrorFailedGetFileProduct();
    }
    public void alertWrongInput(){
        alertWrongInputProductAdmin();
    }

    public void clickButtonEditProduct() {
        clickOn(elementButtonEditProduct);
    }
    public void updateProductImage (){
        WebElement element= getDriver().switchTo().activeElement().findElement(elementUpdateProductImage);
        element.sendKeys(IMAGE_FOLDER + "/indomilk.jpeg");
    }
    public void updateProductName (String name){
        wait(2000);
        WebElement element= getDriver().switchTo().activeElement().findElement(elemenUpdateProductName);
        element.sendKeys(name);
    }

}
