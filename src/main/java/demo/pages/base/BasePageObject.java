package demo.pages.base;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static demo.utils.Constants.timeout;
import static java.lang.Thread.sleep;

public class BasePageObject {

    public WebDriver getDriver() {
        return WebdriverInstance.webdriver;
    }

    public WebElement waitUntil(ExpectedCondition<WebElement> conditions, Integer timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), timeout);
        return (WebElement) wait.until(conditions);
    }

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOn(By element) {
        clickOn(element, timeout);
    }

    public void clickOn(By element, int expectedTimeout) {
        waitUntil(ExpectedConditions.elementToBeClickable(element), expectedTimeout);
        getDriver().findElement(element).click();
    }

    public void typeOn(By element, String text) {
        waitUntil(ExpectedConditions.visibilityOfElementLocated(element), timeout);
        getDriver().findElement(element).sendKeys(text);
    }

    public boolean isPresent(By element) {
        return getDriver().findElement(element).isDisplayed();
    }

    public boolean isPresentWithDelay(By element, int delay) {
        wait(delay);
        return isPresent(element);
    }

    public void scrollDown() {
        wait(2000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, 800)");
    }

    public void InnerScrollDown (){
        wait(2000);
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("scroll(0, 250)"); //y value '250' can be altered
    }

    public void moveToTab(int index) {
        ArrayList<String> tabs = new ArrayList(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(index));
        System.out.println(tabs);
    }

    public void alertSuccessLogin() throws InterruptedException {
        Thread.sleep(2000);
        Alert successLogin = getDriver().switchTo().alert();
        successLogin.accept();
    }

    public void alertSuccessRegister() {
        wait(3000);
        Alert successRegister = getDriver().switchTo().alert();
        successRegister.accept();
        wait(2000);
    }

    public void alertMininumNameShop() {
        wait(2000);
        Alert minimumNameShop = getDriver().switchTo().alert();
        minimumNameShop.accept();
        wait(2000);
    }

    public void alertMininumPhoneNumber() {
        wait(2000);
        Alert minimumPhone = getDriver().switchTo().alert();
        minimumPhone.accept();
        wait(2000);
    }

    public void alertEmailorPhoneRegistered() {
        wait(2000);
        Alert registeredUser = getDriver().switchTo().alert();
        registeredUser.accept();
        wait(2000);
    }

    public void alertEmailorPasswordIncorrect() {
        wait(2000);
        Alert incorrect = getDriver().switchTo().alert();
        incorrect.accept();
        wait(2000);
    }

    public String getTitle() {
        wait(3000);
        return getDriver().getTitle();
    }

    public void alertSuccessEditProfile() {
        generalAlertAccept(2000);
    }

    public void alertNoSuccessEditProfile() {
        generalAlertAccept(3000);
    }

    public void alertEditEmailIncorrect() {
        generalAlertAccept(2000);
    }

    public void alertEditFieldIsEmpty() {
        generalAlertAccept(2000);
    }

    public void alertEditFieldEmptyEmail() {
        generalAlertAccept(2000);
    }

    public void generalAlertAccept(int timeout) {
        wait(timeout);
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
        wait(timeout);
    }

    public void generalAlertAccept2() {
        wait(2000);
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
        wait(2000);
    }

//    public void alertSuccessAddToCart() {
//        wait(2000);
//        Alert alert = getDriver().switchTo().alert();
//        alert.getText();
//        wait(2000);
//    }

    public void alertSuccessAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        Alert successAddtoCart = getDriver().switchTo().alert();
        successAddtoCart.accept();
    }
    public void alertSuccessAddProductAdmin() {
        wait(2000);
        Alert successAddProductAdmin = getDriver().switchTo().alert();
        successAddProductAdmin.accept();
    }
    public void alertErrorInternalAddProductAdmin() {
        wait(2000);
        Alert errorInternalAddProductAdmin = getDriver().switchTo().alert();
        errorInternalAddProductAdmin.accept();
    }
    public void alertErrorFailedGetFileProduct() {
        wait(2000);
        Alert errorFailedGetProductAdmin = getDriver().switchTo().alert();
        errorFailedGetProductAdmin.accept();
    }
    public void alertWrongInputProductAdmin(){
        wait(2000);
        Alert errorWrongInputProductAdmin = getDriver().switchTo().alert();
        errorWrongInputProductAdmin.accept();
    }

    public void alertSuccessCreateOrder() {
        wait(2000);
        Alert successOrder = getDriver().switchTo().alert();
        successOrder.accept();
        wait(2000);
    }
    public void alertSuccessUpdateProductAdmin(){
        wait(2000);
        Alert successUpdateProductAdmin = getDriver().switchTo().alert();
        successUpdateProductAdmin.accept();
        wait(2000);
    }
    public void alertSuccessDeleteProductAdmin (){
        wait(2000);
        Alert successDeleteProductAdmin = getDriver().switchTo().alert();
        successDeleteProductAdmin.accept();
        wait(2000);
    }

    public void alertSuccessfullyCreateOrderProduct(){
        wait(2000);
        Alert successCreateOrderProduct = getDriver().switchTo().alert();
        successCreateOrderProduct.accept();
        wait(2000);
    }
    public void alertSuccessfullyDeleteProductMyCart(){
        wait(2000);
        Alert successDeleteProductMyCart = getDriver().switchTo().alert();
        successDeleteProductMyCart.accept();
        wait(2000);
    }

}
