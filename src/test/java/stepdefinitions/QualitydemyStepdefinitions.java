package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.QualityDemyPage;
import utilities.ConfigReader;

public class QualitydemyStepdefinitions {

    QualityDemyPage qualityDemyPage;
    @Then("ilk safa login linkine click yapar")
    public void ilk_safa_login_linkine_click_yapar() {
        qualityDemyPage=new QualityDemyPage();
        qualityDemyPage.ilkLoginLinki.click();
    }
    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String istenenEmail) {
        qualityDemyPage=new QualityDemyPage();
        qualityDemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty(istenenEmail));
    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String istenenSifre) {
        qualityDemyPage=new QualityDemyPage();
        qualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(istenenSifre));

    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qualityDemyPage=new QualityDemyPage();
        qualityDemyPage.loginButonu.click();
    }
    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {
        qualityDemyPage=new QualityDemyPage();
        Assert.assertTrue(qualityDemyPage.basariliGirisCoursesLinki.isDisplayed());

    }

    @And("basarili giris yapilamadigini test eder")
    public void basariliGirisYapilamadiginiTestEder() {
        qualityDemyPage=new QualityDemyPage();
        Assert.assertTrue(qualityDemyPage.kullaniciEmailKutusu.isDisplayed());
    }
}
