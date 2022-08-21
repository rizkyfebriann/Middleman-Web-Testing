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
    By elementBtnDeleteProfile = By.xpath("//label[contains(text(),'delete')]");
    By elemenModalBoxDeleteProfile = By.xpath("//*[@id=\"__next\"]/div[4]/div");
    By elementBtnYesDeleteProfile = By.id("btn-delete");
    By elementLogoImageHalamanLogin = By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/span/img");
    By elementBtnNoDeleteProfile = By.xpath("//label[contains(text(),'No')]");

    public void inputNameClear(String name) {
        getDriver().findElement(elementInputName).clear();
        typeOn(elementInputName, name);
    }

    public void inputEmailClear(String email) {
        getDriver().findElement(elementInputEmail).clear();
        typeOn(elementInputEmail, email);
    }


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

    public boolean isEditBoxPresent() {
        return isPresentWithDelay(elemenModalBoxEditProfile, 2000);
    }

    public boolean isStillOnPopUpEdit() {
        wait(2500);
        return isPresent(elemenModalBoxEditProfile);
    }
    public void clickButtonDeleteProfile() {
//        waitUntil(ExpectedConditions.elementToBeClickable(elementBtnCircleMyProfile), timeout);
        clickOn(elementBtnDeleteProfile);
    }

    public boolean alertModalBoxDeleteProfile() {
        wait(2500);
        return isPresent(elemenModalBoxDeleteProfile);
    }
    public void clickButtonYesDeleteProfile() {
        clickOn(elementBtnYesDeleteProfile);
    }
    public boolean isRedirecToLoginPage() {
        wait(1000);
        return isPresent(elementLogoImageHalamanLogin);
    }

    public void clickBtnNoDeleteProfile() {
       clickOn(elementBtnNoDeleteProfile);
    }
    public boolean  isSuccessBackToPageMyProfile() {
        wait(2000);
        return isPresent(elementLabelDashboardMyProfile);
    }

}
