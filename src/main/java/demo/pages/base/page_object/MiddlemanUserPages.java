package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static demo.utils.Constants.timeout;

public class MiddlemanUserPages extends BasePageObject {
    By elementIconMyProfile = By.xpath("//label[@class='btn btn-ghost btn-circle avatar']");
    By elementBtnCircleMyProfile1 = By.className("btn btn-ghost btn-circle avatar");
    By elementButtonMyProfile = By.xpath("(//a[@id='to-profile'])[2]");
    By elementLabelDashboardMyProfile = By.xpath("//h1[contains(text(),'My Profile')]");
    By elementBtnEditProfile = By.id("open-modal");
    By elemenModalBoxEditProfile = By.xpath("(//div[@class='modal-box'])[3]");
    By elemenEditBtnProfile = By.id("btn-edit");
    By elementMenuDropdown = By.className("mt-3 p-2 shadow menu menu-compact dropdown-content bg-base-100 rounded-box w-52 font-Roboto font-medium");

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

    public boolean isStillOnEditPage() {
        return isPresent(elemenModalBoxEditProfile);
    }

}
