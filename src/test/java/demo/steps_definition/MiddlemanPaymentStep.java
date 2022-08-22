package demo.steps_definition;

import demo.pages.base.BasePageObject;
import demo.pages.base.page_object.MiddlemanCartPages;
import demo.pages.base.page_object.MiddlemanPaymentPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MiddlemanPaymentStep extends BasePageObject {

    MiddlemanPaymentPages middlemanPaymentpages = new MiddlemanPaymentPages();
    MiddlemanCartPages middlemanCartPages = new MiddlemanCartPages();

    @When("user scroll down little bit on dashboard page")
    public void userScrollDownLittleBitOnDashboardPage() {
        middlemanPaymentpages.scrollDownLittleBit();
    }

    @And("click button add product on Super Bubur")
    public void clickButtonAddProductOnSuperBubur() {
        middlemanPaymentpages.clickAddSuperBubur();
    }

    @Then("user go to my cart")
    public void userGoToMyCart() throws InterruptedException {
        middlemanCartPages.alertSuccessfullyAddtoCart();
        middlemanCartPages.clickMyCart();
    }

    @And("user can see product added on cart")
    public void userCanSeeProductAddedOnCart() {
        middlemanPaymentpages.isSuccessfullyOnMyCart();
    }

    @And("user click Next for create order and go to payment page")
    public void userClickNextForContinuePayment() {
        middlemanPaymentpages.clickNextToPayment();
        middlemanPaymentpages.alertSuccessfullyCreateOrder();
    }

    @And("user see payment page")
    public void userSeePaymentPage() {
        middlemanPaymentpages.isSuccessfullyOnPaymentPage();
    }

    @And("user click BCA Klikpay for payment method")
    public void userClickBCAKlikpayForPaymentMethod() {
        middlemanPaymentpages.clickBCAKlikpay();
    }

    @And("user click Pay Now")
    public void userClickPayNow() {
        middlemanPaymentpages.clickPayNow();
    }

    @Then("user go to simulator payment page")
    public void userGoToSimulatorPaymentPage() {
        middlemanPaymentpages.isSuccessfullyOnSimulatorPaymentPage();
    }

    @And("user click Bayar button")
    public void userClickBayarButton() {
        middlemanPaymentpages.clickBayar();
    }

    @And("user can see payment transaction is success")
    public void userCanSeePaymentTransactionIsSuccess() {
        middlemanPaymentpages.isPaymentSuccess();
    }


    @And("user click Credit Card for payment method")
    public void userClickCreditCardForPaymentMethod() {
        middlemanPaymentpages.clickCreditCard();
    }

    @And("user input credit card number {string}")
    public void userInputCreditCardNumber(String CCNumber) {
        middlemanPaymentpages.inputCCNumber(CCNumber);
    }

    @And("user input exp card {string}")
    public void userInputExpCard(String exp) {
        middlemanPaymentpages.inputExpCC(exp);
    }

    @And("user input CVV {string}")
    public void userInputCVV(String CVV) {
        middlemanPaymentpages.inputCVV(CVV);
    }

    @And("user click Pay Now button")
    public void userClickPayNowButton() {
        middlemanPaymentpages.clickPayCC();
    }

    @Then("user see payment successful")
    public void userSeePaymentSuccessful() {
        middlemanPaymentpages.isSuccessfullyPayWithCC();
    }

    @And("user can see transactions on history order page")
    public void userCanSeeTransactionsOnHistoryOrderPage() {
        middlemanPaymentpages.isSuccessfullyOnHistoryOrderPage();
    }

    @And("user scroll for see more payment method")
    public void userScrollForSeeMorePaymentMethod() {
        middlemanPaymentpages.innerScrollDownLittleBit();
    }

    @And("user choose Shopeepay")
    public void userChooseShopeepay() {
        middlemanPaymentpages.clickShopeePay();
    }
}
