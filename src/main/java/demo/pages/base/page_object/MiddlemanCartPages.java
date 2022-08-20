package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MiddlemanCartPages extends BasePageObject {
    By elementBtnAdd = By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]");

    By elementLabelDashboard1 = By.xpath("//h1[contains(text(),'Dashboard')]");
    By elementMyCart = By.xpath("//li/a[@id='to-cart'][1]/..");

    By elemenHeaderMyCart = By.xpath("//h1[contains(text(),'My Cart')]");
    public void clickBtnAdd() {
        clickOn(elementBtnAdd);
    }

    public void clickMyCart() {
        generalAlertAccept(2000);
        WebElement aHref = getDriver().findElement(elementMyCart);
        clickOn(elementMyCart);
    }
    public boolean isSuccessfullyAddToCart() {
        boolean isDashboardPresent = isPresent(elementLabelDashboard1);
        return isDashboardPresent;
    }

//    public void alertSuccessfullyAddToCart() throws InterruptedException  {
//        alertSuccessAddToCart();
//    }

    public boolean isSuccessSeeAddToCart() {
        wait(5000);
        return isPresent(elemenHeaderMyCart);
    }
}
