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

    // Ambil button minus berdasarkan textnya
    By elementBtnMinus = By.xpath("//button[text()=\"-\"][1]");

    // ini buat product quantity yang button pertama, di XPath /.. artinya naek ke atas jadi dia
    // bakal ambil div nya
    By elementProductQuantity = By.xpath("//button[text()=\"-\"][1]/../p");

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

    public void deleteProductAtIndex(int index) {
        String xpathForDeleteButton = "//div/button[text()='Delete'][" + index + "]";
        By elementDeleteButtonAtIndex = By.xpath(xpathForDeleteButton);

        // skrg click Delete untuk hilangkan
        clickOn(elementDeleteButtonAtIndex);
        generalAlertAccept();
    }

    public String getTitleForProductAtIndex(int index) {
        // ini bakal memproduksi contohnya kalo index = 1
        // XPATH = //div/button[text()='Delete'][1]/../../h1
        // Coba di console dengan
        // $x("//div/button[text()='Delete'][1]/../../h1")
        String xpathForProductTitle = "//div/button[text()='Delete'][" + index + "]" + "/../../h1";
        By elementProductTitleAtIndex = By.xpath(xpathForProductTitle);

        WebElement productTitleElement = getDriver().findElement(elementProductTitleAtIndex);
        String productTitle = productTitleElement.getText();

        return productTitle;
    }

    public int getProductCount(int index) {
        // ini sama kaya inspect di Chrome, buat dapetin elementnya
        WebElement quantityElement = getDriver().findElement(elementProductQuantity);

        // ambil textnya
        String textQuantity = quantityElement.getText();
        System.out.println("Text Quantity " +   textQuantity);
        return Integer.parseInt(textQuantity);
    }

    public boolean checkIfUserCanClickMinusButton() {
        WebElement minusButton = getDriver().findElement(elementBtnMinus);
        return minusButton.isEnabled();
    }
}
