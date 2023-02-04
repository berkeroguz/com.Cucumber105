package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerOkuAppPage;

public class HerokuappStepdefinitions {
    HerOkuAppPage herOkuAppPage = new HerOkuAppPage();
    @Then("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herOkuAppPage.addElementButonu.click();
    }
    @Then("Delete butonunun gorunur oluncaya kadar bekler")
    public void delete_butonunun_gorunur_oluncaya_kadar_bekler() throws InterruptedException {
        Thread.sleep(2000);

    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(herOkuAppPage.deleteButonu.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herOkuAppPage.deleteButonu.click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        int flag=3;
        try {
            herOkuAppPage.deleteButonu.click();
            Assert.assertFalse(flag==3);
            // exception olusmazsa bekledigimiz durum gerceklesmedi demektir.
            // bu durumda test failed olmali
            // bunun icin 34. satirda failed olacak bir assertion olusturduk.
        } catch (NoSuchElementException e) {
            Assert.assertTrue(flag==3);
            // tam tersi
        }
    }
}
