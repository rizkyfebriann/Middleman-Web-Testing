package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MiddlemanAdminPages extends BasePageObject {
    public static final String DIR = System.getProperty("user.dir");
    public static String IMAGE_FOLDER = DIR + "/src/test/resources/image";

    By elementButtonAddProduct = By.id("btn-add");
    By elementinputProductImage = By.xpath("//body/div[@id='__next']/div[5]/div[1]/form[1]/input[1]");
    By elementinputProductName = By.xpath ("//body/div[@id='__next']/div[5]/div[1]/form[1]/input[2]");
    By elementinputDataUnit = By.xpath("//body/div[@id='__next']/div[5]/div[1]/form[1]/input[3]");
    By elementinputDataStock = By.xpath("//body/div[@id='__next']/div[5]/div[1]/form[1]/div[1]/input[1]");
    By elementinputDataPrice = By.xpath("//body/div[@id='__next']/div[5]/div[1]/form[1]/div[1]/input[2]");
    By elementButtonSuccessAdd = By.xpath("//body/div[@id='__next']/div[5]/div[1]/form[1]/div[2]/button[1]");
    By elementLabelDashboard = By.xpath("//h1[contains(text(),'Dashboard')]");
    By elementModalBoxAddProduct = By.xpath("//body/div[@id='__next']/div[5]/div[1]");
    By elementButtonEditProduct = By.id("btn-edit-modal");
    By elementUpdateProductImage = By.xpath("//body/div[@id='__next']/div[4]/div[2]/div[1]/section[1]/form[1]/input[1]");
    By elementUpdateProductName = By.xpath ("//body/div[@id='__next']/div[4]/div[2]/div[1]/section[1]/form[1]/input[2]");
    By elementUpdateProductUnit = By.xpath ("//body/div[@id='__next']/div[4]/div[2]/div[1]/section[1]/form[1]/input[3]");
    By elementUpdateProductStock = By.xpath("//body/div[@id='__next']/div[4]/div[2]/div[1]/section[1]/form[1]/div[1]/input[1]");
    By elementUpdateProductPrice = By.xpath("//body/div[@id='__next']/div[4]/div[2]/div[1]/section[1]/form[1]/div[1]/input[2]");
    By elementButtonSuccessUpdate = By.xpath("//body/div[@id='__next']/div[4]/div[2]/div[1]/section[1]/form[1]/div[2]/button[1]");
    By elementDeleteProduct = By.id("btn-delete-modal");
    By elementButtonSuccessDelete = By.xpath("//button[@id='btn-delete']");
    By elementButtonNoDelete = By.xpath("//body/div[@id='__next']/div[4]/div[2]/div[1]/section[1]/div[1]/button[2]");
    By elementSearchProduct = By.xpath("//input[@id='input-search']");
    By elementButtonSearch = By.xpath("//button[@id='btn-search']");
    By elementResultNotFound = By.xpath("//body/div[@id='__next']/div[1]");

    public void clickButtonAddProduct() {
        clickOn(elementButtonAddProduct);
    }
    public void inputProductImage() {
        wait(2000);
        WebElement element= getDriver().switchTo().activeElement().findElement(elementinputProductImage);
        element.sendKeys(IMAGE_FOLDER + "/minyak-bimoli.jpeg");
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
        wait(2000);
    }

    public void alertSuccessfullyAdd() {
        wait(2000);
        alertSuccessAddProductAdmin();

    }
    public boolean isSuccessfullyAddProductAdmin() {
        wait(2000);
        return isPresent(elementLabelDashboard);
    }

    public boolean isStillOnAddProduct() {
        wait(2000);
        return isPresent(elementModalBoxAddProduct);
    }
    public void alertInternalErrorAdd(){
        alertErrorInternalAddProductAdmin();
    }
    public void alertFailedGetFile(){
        wait(2000);
        alertErrorFailedGetFileProduct();
    }
    public void alertWrongInput(){
        alertWrongInputProductAdmin();
    }

    public void clickButtonEditProduct() {
        clickOn(elementButtonEditProduct);
    }
    public void updateProductImage (){
        wait(2000);
        WebElement element= getDriver().switchTo().activeElement().findElement(elementUpdateProductImage);
        element.sendKeys(IMAGE_FOLDER + "/minyak-fortune.jpeg");
    }
    public void updateProductName (String name){
        wait(2000);
        getDriver().findElement(elementUpdateProductName).clear();
        typeOn(elementUpdateProductName, name);
    }

    public void updateProductUnit (String unit){
        wait(2000);
        getDriver().findElement(elementUpdateProductUnit).clear();
        typeOn(elementUpdateProductUnit, unit);
    }

    public void updateProductStock (String stock){
        wait(2000);
        getDriver().findElement(elementUpdateProductStock).clear();
        typeOn(elementUpdateProductStock, stock);
    }
    public void updateProductPrice (String price){
        wait(2000);
        getDriver().findElement(elementUpdateProductPrice).clear();
        typeOn(elementUpdateProductPrice, price);
    }
    public void clickButtonUpdateProduct (){
        clickOn(elementButtonSuccessUpdate);
    }
    public void alertSuccessfullyUpdate(){
        wait (2000);
        alertSuccessUpdateProductAdmin();
    }
   public boolean isSuccessfullyUpdateProductAdmin(){
       wait(2000);
       return isPresent(elementLabelDashboard);
   }
   public void clickButtonDeleteProduct(){
        clickOn(elementDeleteProduct);
   }
   public void clickButtonSuccesDelete(){
        clickOn(elementButtonSuccessDelete);
   }
   public void alertSuccessfullyDelete(){
       wait (2000);
       alertSuccessDeleteProductAdmin();
   }
   public boolean isSuccessfullyDeleteProductAdmin(){
       wait(2000);
       return isPresent(elementLabelDashboard);
   }
   public void clickButtonNoDelete(){
        wait(2000);
       clickOn(elementButtonNoDelete);
   }
   public boolean isCanBackToDashboard(){
       wait(2000);
       return isPresent(elementLabelDashboard);
   }

    public void inputKeyword (String keyword){
        wait(2000);
        getDriver().findElement(elementSearchProduct).clear();
        typeOn(elementSearchProduct,keyword);
    }

    public void clickButtonSearch() {
        wait(2000);
        clickOn(elementButtonSearch);
    }
    public void inputInvalidKeyword(String keyword){
        wait(2000);
        getDriver().findElement(elementSearchProduct).clear();
        typeOn(elementSearchProduct,keyword);
    }

    public boolean isCanSeeResultNotFound (){
        wait(2000);
        return isPresent(elementResultNotFound);
    }

}
