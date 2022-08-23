package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MiddlemanOrderUserPages extends BasePageObject {
    public static final String DIR = System.getProperty("user.dir");
    public static String IMAGE_FOLDER = DIR + "/src/test/resources/image";

    By elementButtonNext = By.xpath("//button[@id='to-payment']");
    By elementDirectOnPaymentPage = By.xpath("//div[@id='app']");
    By elementButtonDeleteProductMyCart = By.xpath("//body/div[@id='__next']/div[1]/div[4]/div[1]/div[1]/div[2]/button[1]");
    By elementButtonHistoryOrder = By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By elementButtonDetailHistoryOrder = By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]");
    By elementDirectOnDetailHistoryOrderPage = By.xpath("//body/div[@id='__next']/div[1]/div[2]");


    public void clickButtonNext(){
        wait (2000);
        clickOn(elementButtonNext);
    }
    public boolean isCanDirectOnPaymentPage(){
        wait(4000);
        return isPresent(elementDirectOnPaymentPage);
    }
    public void alertSuccessfullyCreateOrder(){
        wait (2000);
        alertSuccessfullyCreateOrderProduct();
    }
    public void clickButtonDeleteProductMyCart(){
        wait(2000);
        clickOn(elementButtonDeleteProductMyCart);
    }
    public void alertSuccessDeleteProductMyCart(){
        wait (2000);
        alertSuccessfullyDeleteProductMyCart();
    }
    public void clickButtonHistoryOrder(){
        wait (2000);
        clickOn(elementButtonHistoryOrder);
    }
    public void clickButtonDetailHistoryOrder(){
        wait (2000);
        clickOn(elementButtonDetailHistoryOrder);
    }
    public boolean isCanDirectOnDetailHistoryOrderPage() {
        wait(5000);
        return isPresent(elementDirectOnDetailHistoryOrderPage);
    }

}
