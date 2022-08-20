package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;

import static demo.utils.Constants.timeout;

import org.openqa.selenium.WebElement;


public class MiddlemanCartPages extends BasePageObject {
    By elementBtnAdd = By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]");

    By elementLabelDashboard1 = By.xpath("//h1[contains(text(),'Dashboard')]");

    By elementMyCart = By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]");

    By elementMyCartOld = By.xpath("//li/a[@id='to-cart'][1]/..");


    By elemenHeaderMyCart = By.xpath("//h1[contains(text(),'My Cart')]");

    By elementBtnPlus = By.xpath("//*[@id=\"__next\"]/div/div[4]/div[1]/div/div[1]/button[2]");
    By elementNumberTextItem = By.xpath("//*[@id=\"__next\"]/div/div[4]/div[1]/div/div[1]/p");
    By elementBtnMinus = By.xpath("//*[@id=\"__next\"]/div/div[4]/div[1]/div/div[1]/button[1]");
    By elementBtnDelete = By.xpath("//*[@id=\"__next\"]/div/div[4]/div[1]/div/div[2]/button");

    public void clickBtnAdd() {
        clickOn(elementBtnAdd);
    }

    public void clickMyCart() {
        waitUntil(ExpectedConditions.elementToBeClickable(elementMyCart), timeout);
        clickOn(elementMyCart);
    }

    public boolean isOnDashboarPage() {
        wait(2000);
        return isPresent(elementLabelDashboard1);
    }

    public void alertSuccessfullyAddtoCart() throws InterruptedException {
        wait(2000);
        alertSuccessAddToCart();
    }
//    public boolean isSuccessfullyAddToCart() {
//        wait(5000);
//        return isPresent(elementLabelDashboard1);
//    }

//    public void alertSuccessfullyAddToCart() throws InterruptedException  {
//        alertSuccessAddToCart();
//    }

    public boolean isSuccessSeeAddToCart() {
        wait(5000);
        return isPresent(elemenHeaderMyCart);
    }

    public void plusProduct() {
//        wait(1000);
        clickOn(elementBtnPlus);
    }
    public boolean textItemIncrease() {
        wait(1000);
        return isPresent(elementNumberTextItem);
    }

    public void plusMultipleProduct() {
        clickOn(elementBtnPlus);
    }
    public void minusProduct() {
        clickOn(elementBtnMinus);
    }
    public void deleteButton() {
        clickOn(elementBtnDelete);
    }
}
