package demo.steps_definition;

import demo.pages.base.BasePageObject;
import demo.pages.base.page_object.MiddlemanCartPages;
import demo.pages.base.page_object.MiddlemanLoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class MiddlemanCartStep extends BasePageObject {
    MiddlemanCartPages middlemanCartPages = new MiddlemanCartPages();

    @When("user click button add on the dashboard page")
    public void userClickButtonAddOnTheDashboardPage() {
        middlemanCartPages.clickBtnAdd();
    }

    @When("user click button add on the dashboard page by {int}")
    public void userClickButtonAddOnTheDashboardPageMultipleTimes(int numberOfClicks) throws InterruptedException {
        for(int i = 0;i<numberOfClicks;i++) {
            middlemanCartPages.clickBtnAdd();
            middlemanCartPages.alertSuccessfullyAddtoCart();
        }
    }

    @And("user see alert success add to cart & click OK")
    public void userSeeAlertSucsessAddToCartClickOK() throws InterruptedException {
        middlemanCartPages.alertSuccessfullyAddtoCart();
    }
    @And("user add product to cart")
    public void userAddProductToCart() {
        middlemanCartPages.clickBtnAdd();
    }

    @And("user add product2 to cart")
    public void userAddProduct2ToCart() {
        middlemanCartPages.clickBtnAdd();
    }

    @And("user click My Cart")
    public void userClickMyCart() {
        middlemanCartPages.clickMyCart();
    }

    @Then("user can see the product cart added")
    public void userCanSeeTheProductCartAdded() {
        middlemanCartPages.isSuccessSeeAddToCart();
    }

    @Then("user can see the number of item updated")
    public void userCanSeeTheNumberOfItemUpdated() {
        middlemanCartPages.textItemIncrease();
    }

    @And("user clicks button plus")
    public void userClikButtonPlus() {
        // panggil userClikButtonPlusMultipleTimes dengan parameter 1 supaya terpanggil assertionnya
        userClikButtonPlusMultipleTimes(1);
    }

    @And("user clicks button plus by {int}")
    public void userClikButtonPlusMultipleTimes(int numberOfAddedQuantity) {
        // Simpan hasil nomor sebelumnya
        int quantityBefore = middlemanCartPages.getProductCount(1);

        for(int i = 0;i<numberOfAddedQuantity;i++) {
            middlemanCartPages.plusProduct();
        }

        // Simpan hasil sesudahnya
        int quantityAfter = middlemanCartPages.getProductCount(1);

        // dibandingkan kalau sesudah dan sebelumnya adalah bertambah sesuai dengan numberOfAddedQuantity
        Assert.assertTrue(quantityAfter == quantityBefore + numberOfAddedQuantity);
    }

    @And("user clik button plus threed time")
    public void userClikButtonPlusThreedTime() {
        middlemanCartPages.plusMultipleProduct();
    }

    @And("user clik button minus")
    public void userClikButtonMinus() {
        middlemanCartPages.minusProduct();
    }

    @Then("user can see the number of item is reduced")
    public void userCanSeeTheNumberOfItemIsReduced() {
        middlemanCartPages.textItemIncrease();
    }

    @And("user click button minus to decrease the product")
    public void userClickButtonMinusToDecreaseTheProduct() {
        // memanggil fungsi dengan parameter, tapi karena kita hanya mengurangi 1, di berikan parameter 1 saja
        // ini di gunakan supaya assertionnya jalan
        userClickButtonMinusToDecreaseTheProduct(1);
    }

    @And("user click button minus to decrease the product by {int}")
    public void userClickButtonMinusToDecreaseTheProduct(int numberOfDecreasedQuantity) {
        // Simpan hasil nomor sebelumnya
        int quantityBefore = middlemanCartPages.getProductCount(1);

        for(int i=0;i<numberOfDecreasedQuantity;i++) {
            middlemanCartPages.minusProduct();
        }

        // Simpan hasil sesudahnya
        int quantityAfter = middlemanCartPages.getProductCount(1);

        // dibandingkan kalau sesudah dan sebelumnya adalah berkurang sesuai dengan numberOfDecreasedQuantity
        Assert.assertTrue(quantityAfter == quantityBefore - numberOfDecreasedQuantity);
    }

    @And("user click button minus to decrease the product to {int}")
    public void userClickButtonMinusUntilCertainNumber(int numberOfNewQuantity) {
        // Simpan hasil nomor sebelumnya
        int quantityBefore = middlemanCartPages.getProductCount(1);

        // kurangi sampai dengan jumlah yang user inginkan di parameter numberOfNewQuantity
        // jadi kalau numberOfNewQuantity=0, maka akan trus sampai 0 di kurangi

        // hitung berapa kali loop untuk mencapai jumlah yang di inginkan
        // contoh: kalau skrg quantitynya (di variable quantityBefore 3) dan kita ingin numberOfNewQuantity=0, maka
        // kita harus click 3 kali supaya jadi nol
       int jumlahLoop = quantityBefore - numberOfNewQuantity;

       for(int i=0;i<jumlahLoop;i++) {
           middlemanCartPages.minusProduct();
       }

        // Simpan hasil sesudahnya
        int quantityAfter = middlemanCartPages.getProductCount(1);

        // assert apakah quantityAfter sesuai dengan numberOfNewQuantity yang di inginkan
        Assert.assertTrue(quantityAfter == numberOfNewQuantity);
    }


    @And("user click button delete product")
    public void userClikButtonDeleteProduct() {
        middlemanCartPages.deleteButton();
    }

    @Then("user can see the product is removed")
    public void userCanSeeTheProductIsRemoved() {
        middlemanCartPages.isSuccessSeeAddToCart();
    }

    @Then("user should not be able to click minus at quantity one")
    public void userCantClickMinusAtOne() {
        // pastikan quantitynya 1 dulu

        // Simpan hasil sesudahnya
        int quantityText = middlemanCartPages.getProductCount(1);

        // assert apakah quantityAfter sesuai dengan numberOfNewQuantity yang di inginkan
        Assert.assertTrue(quantityText == 1);

        // assert kalau buttonnya disabled di quantity satu
        Assert.assertTrue(middlemanCartPages.checkIfUserCanClickMinusButton());

    }
}

