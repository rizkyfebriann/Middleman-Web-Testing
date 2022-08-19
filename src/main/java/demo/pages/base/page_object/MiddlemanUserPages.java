package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static demo.utils.Constants.timeout;

public class MiddlemanUserPages extends BasePageObject {
    By elementInputName = By.id("input-name");
    By elementInputEmail = By.id("input-email");
    By elementInputPhone = By.id("input-phone");
    By elementInputPassword = By.id("input-password");
    By elementInputAddress = By.id("input-address");
    By elementIconMyProfile = By.xpath("//label[@class='btn btn-ghost btn-circle avatar']");
    By elementBtnCircleMyProfile1 = By.className("btn btn-ghost btn-circle avatar");
    By elementButtonMyProfile = By.xpath("(//a[@id='to-profile'])[2]");
    By elementLabelDashboardMyProfile = By.xpath("//h1[contains(text(),'My Profile')]");
    By elementBtnEditProfile = By.id("open-modal");
    By elemenModalBoxEditProfile = By.xpath("(//div[@class='modal-box'])[3]");
    By elemenEditBtnProfile = By.xpath("//*[@id=\"btn-edit\"]");
//    By elementMenuDropdown = By.className("mt-3 p-2 shadow menu menu-compact dropdown-content bg-base-100 rounded-box w-52 font-Roboto font-medium");

//    public void inputNameShop(String name) {
//        getDriver().findElement(elementInputName).clear();
//        typeOn(elementInputName, name);
//    }

    public void inputNameClear(String name) {
        getDriver().findElement(elementInputName).clear();
        typeOn(elementInputName, name);
    }

//    public void inputEmailUser(String email) {
//        getDriver().findElement(elementInputEmail).clear();
//        typeOn(elementInputEmail, email);
//    }

    public void inputEmailClear(String email) {
        getDriver().findElement(elementInputEmail).clear();
        typeOn(elementInputEmail, email);
    }

//    public void inputPassword(String password) {
//        typeOn(elementInputPassword, password);
//    }

    public void inputPasswordClear(String password) {
        getDriver().findElement(elementInputPassword).clear();
    }

    public void inputPhoneClear(String phone) {
        getDriver().findElement(elementInputPhone).clear();
        typeOn(elementInputPhone, phone);
    }

    public void inputAddressClear(String address) {
        getDriver().findElement(elementInputAddress).clear();
        typeOn(elementInputAddress, address);
    }

    public void clickIconMyProfile() {
//        waitUntil(ExpectedConditions.elementToBeClickable(elementBtnCircleMyProfile), timeout);
        clickOn(elementIconMyProfile);
    }
    public void clickButtonMyProfile() throws InterruptedException {
//        waitUntil(ExpectedConditions.elementToBeClickable(elementButtonMyProfile), timeout);
//        Thread.sleep(200);
        waitUntil(ExpectedConditions.visibilityOfElementLocated(elementButtonMyProfile), timeout);
        clickOn(elementButtonMyProfile);

    }
    public boolean isSuccessRedirectToMyProfile(){
        wait(5000);
        return isPresent(elementLabelDashboardMyProfile);
    }
    public void clickButtonEditMyProfile() {
        clickOn(elementBtnEditProfile);
    }

    public void alertModalBoxEditProfile() {
        clickOn(elemenModalBoxEditProfile);
    }
    public void clickButtonEdit() {
        clickOn(elemenEditBtnProfile);
    }
    public void alertSuccessfullyEditProfile() {
        alertSuccessEditProfile();
    }

    public boolean isStillOnPopUpEdit() {
        wait(2500);
        return isPresent(elemenModalBoxEditProfile);
    }

//    public boolean isStillOnFieldEmail() {
//        WebElement first_name = getDriver().findElement(elementInputEmail);
//        String pleasefilloutthisfield = first_name.getAttribute("required");
//        log.info("Got firstName error message: " + pleasefilloutthisfield);
//        getDriver().findElement(elementInputEmail).getAttribute("validationMessage");
//        getDriver().findElement(elementInputEmail).getAttribute("required");
//
//
//
//        WebElement email = getDriver().findElement(By.id("input-email"));
//        String validationMessage = email.getAttribute("validationMessage");
//        boolean required = Boolean.parseBoolean(email.getAttribute("required"));
//    }



}
