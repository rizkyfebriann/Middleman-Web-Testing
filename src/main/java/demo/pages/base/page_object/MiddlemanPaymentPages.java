package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class MiddlemanPaymentPages extends BasePageObject {

    By elementAddToCartProductNumber10 = By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[10]/div[1]/button[1]");

    By elementGoToMyCart = By.xpath("//*[@id=\"to-cart\"][1]");

    By elementAlreadyOnMyCartPage = By.xpath("//h1[contains(text(),'My Cart')]");

    By elementGoToPaymentPage = By.id("to-payment");

    By elementAlreadyOnPaymentPage = By.xpath("//div[contains(text(),'Scarva E Store')]");
    By elementChoosePaymentMethodNumber1 = By.xpath("//body/div[@id='app']/div[@id='application']/div[1]/a[1]/div[1]/div[2]");
    By elementInputCreditCardNumber = By.xpath("//*[@id=\"application\"]/div/div[2]/div[2]/input");
    By elementInputExpCreditCard = By.id("card-expiry");
    By elementInputCVVCreditCard = By.id("card-cvv");
    By elementBtnPayWithCreditCard = By.xpath("//*[@id=\"application\"]/div/div[6]/button");
    By elementSuccessfulPayWithCC = By.xpath("//*[@id=\"application\"]/div/div[1]/div/div[1]");
    By elementHistoryOrderProductPage = By.xpath("//*[@id=\"__next\"]/div/div[3]/h1");

    By elementChoosePaymentMethodNumber2 = By.xpath("//body/div[@id='app']/div[@id='application']/div[1]/a[2]/div[1]/div[2]");

    By elementPayNowWithPaymentMethodNumber2 = By.xpath("//button[contains(text(),'Pay now')]");

    By elementAlreadyOnPaymentSimulatorPage = By.xpath("//body/div[@id='wrap']/div[2]/div[1]");

    By elementButtonBayar = By.xpath("//button[contains(text(),'Bayar')]");

    By elementPaymentSuccessStatus = By.xpath("//div[contains(text(),'Transaksi Sukses')]");

    By elementShopeePay = By.xpath("//*[@class=\"list\"][12]");

    By elementDivScrollTo = By.xpath("//*[@id=\"application\"]/div");

    public void scrollDownLittleBit() {
        scrollDown();
    }

    public void innerScrollDownLittleBit() {
//        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
//        jse.executeScript("arguments[0].scrollIntoView(true)", elementShopeePay);
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("javascript:window.scrollBy(0,350)");
        ((JavascriptExecutor) getDriver()).executeScript(
                "arguments[0].scrollTop=arguments[1].offsetTop",
                elementDivScrollTo,
                elementShopeePay);
    }

    public void clickShopeePay() {
        clickOn(elementShopeePay);
        wait(3000);
    }

    public void clickAddSuperBubur() {
        clickOn(elementAddToCartProductNumber10);
    }

    public void goToMyCart() {
        clickOn(elementGoToMyCart);
    }

    public boolean isSuccessfullyOnMyCart() {
        wait(5000);
        return isPresent(elementAlreadyOnMyCartPage);
    }

    public void alertSuccessfullyCreateOrder() {
        alertSuccessCreateOrder();
    }

    public void clickNextToPayment() {
        clickOn(elementGoToPaymentPage);
    }

    public boolean isSuccessfullyOnPaymentPage() {
        wait(5000);
        return isPresent(elementAlreadyOnPaymentPage);
    }

    public void clickCreditCard() {
        clickOn(elementChoosePaymentMethodNumber1);
    }

    public void inputCCNumber(String CCNumber) {
        typeOn(elementInputCreditCardNumber, CCNumber);
    }

    public void inputExpCC(String Exp) {
        typeOn(elementInputExpCreditCard, Exp);
    }

    public void inputCVV(String CVV) {
        typeOn(elementInputCVVCreditCard, CVV);
    }

    public void clickPayCC() {
        clickOn(elementBtnPayWithCreditCard);
    }

    public boolean isSuccessfullyPayWithCC() {
        wait(3000);
        return isPresent(elementSuccessfulPayWithCC);
    }

    public boolean isSuccessfullyOnHistoryOrderPage() {
        wait(3000);
        return isPresent(elementHistoryOrderProductPage);
    }

    public void clickBCAKlikpay() {
        clickOn(elementChoosePaymentMethodNumber2);
    }

    public void clickPayNow() {
        wait(3000);
        clickOn(elementPayNowWithPaymentMethodNumber2);
    }

    public boolean isSuccessfullyOnSimulatorPaymentPage() {
        wait(4000);
        return isPresent(elementAlreadyOnPaymentSimulatorPage);
    }

    public void clickBayar() {
        clickOn(elementButtonBayar);
    }

    public boolean isPaymentSuccess() {
        wait(5000);
        return isPresent(elementPaymentSuccessStatus);
    }

}
