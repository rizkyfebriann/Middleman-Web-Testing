package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class MiddlemanLoginPages extends BasePageObject {

    public void inputEmail(String email) {
        By element = By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/input");
        typeOn(element, email);
    }

    public void inputPassword(String password) {
        By element = By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/input");
        typeOn(element, password);
    }

    public void clickButtonLogin() {
        By element = By.id("btn-login");
        clickOn(element);
    }
    public boolean isSuccessfullyLogin() {
        By element = By.xpath("/html/body/div[1]/div/div[3]/h1");
        return isPresent(element);
    }


}
