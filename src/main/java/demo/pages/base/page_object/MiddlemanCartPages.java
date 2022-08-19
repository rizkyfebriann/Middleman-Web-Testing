package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class MiddlemanCartPages extends BasePageObject {
    By elementBtnAdd = By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]");

    By elementLabelDashboard1 = By.xpath("//h1[contains(text(),'Dashboard')]");
    By elementMyCart = By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]']");

    By elemenHeaderMyCart = By.xpath("//h1[contains(text(),'My Cart')]");
    public void clickBtnAdd() {
        clickOn(elementBtnAdd);
    }

    public void clickMyCart() {
        clickOn(elementMyCart);
    }
    public boolean isSuccessfullyAddToCart() {
        wait(5000);
        return isPresent(elementLabelDashboard1);
    }

//    public void alertSuccessfullyAddToCart() throws InterruptedException  {
//        alertSuccessAddToCart();
//    }

    public boolean isSuccessSeeAddToCart() {
        wait(5000);
        return isPresent(elemenHeaderMyCart);
    }
}
