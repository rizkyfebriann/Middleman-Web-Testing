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
        waitUntil(ExpectedConditions.elementToBeClickable(element), timeout);
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
        js.executeScript("window.scrollTo(0, 400)");
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
        wait(2000);
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
        wait(2000);
        Alert successEditProfile = getDriver().switchTo().alert();
        successEditProfile.accept();
        wait(2000);
    }

    public void alertNoSuccessEditProfile() {
        wait(3000);
        Alert noSuccessEditProfile = getDriver().switchTo().alert();
        noSuccessEditProfile.accept();
        wait(3000);
    }

    public void alertEditEmailIncorrect() {
        wait(2000);
        Alert incorrectEmail = getDriver().switchTo().alert();
        incorrectEmail.accept();
        wait(2000);
    }

    public void alertEditFieldIsEmpty() {
        wait(2000);
        Alert alert = getDriver().switchTo().alert();
        alert.getText();
        wait(2000);
    }

    public void alertEditFieldEmptyEmail() {
        wait(2000);
        Alert alert = getDriver().switchTo().alert();
        alert.getText();

//        WebElement emailAddress = getDriver().findElement(By.cssSelector("[name='emailAddress']"));
//        String required = emailAddress.getAttribute("required");
//        assertEquals(required, "true");
//
//        webdriver.switchTo().frame(iframeSwitch);
//        wait.until(ExpectedConditions.elementToBeClickable(submit));
//        WebElement submitbtn = webdriver.findElement(submit);
//        submitbtn.click();
        wait(2000);
    }

}
