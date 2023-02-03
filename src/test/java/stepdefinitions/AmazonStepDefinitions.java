package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage;
    
    @Then("amazon arama kutusuna Nutella yazip aratir.")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("arama sonuclarinin nutella icerdigini test eder.")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        amazonPage = new AmazonPage();
        String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
        String expectedWord ="Nutella";

        Assert.assertTrue(actualAramaSonucu.contains(expectedWord));
    }
    @Then("sayfayi kapatir.")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("amazon arama kutusuna Java yazip aratir")
    public void amazonAramaKutusunaJavaYazipAratir() {
        amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }

    @And("arama sonuclarının Java icerdigini test eder")
    public void aramaSonuclarınınJavaIcerdiginiTestEder() {
        amazonPage = new AmazonPage();
        String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
        String expectedWord ="Java";

        Assert.assertTrue(actualAramaSonucu.contains(expectedWord));
    }
    @Then("amazon arama kutusuna Samsung yazip aratir")
    public void amazon_arama_kutusuna_samsung_yazip_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Samsung"+ Keys.ENTER);
    }
    @Then("arama sonuclarının Samsung icerdigini test eder")
    public void arama_sonuclarının_samsung_icerdigini_test_eder() {
        amazonPage = new AmazonPage();
        String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
        String expectedWord ="Samsung";

        Assert.assertTrue(actualAramaSonucu.contains(expectedWord));
    }

    @Then("amazon arama kutusuna {string} yazip aratir.")
    public void amazonAramaKutusunaYazipAratir(String aranacakKelime) {
        amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);
    }

    @And("arama sonuclarinin {string} icerdigini test eder.")
    public void aramaSonuclarininIcerdiginiTestEder(String arananKelime) {
        amazonPage = new AmazonPage();
        String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(arananKelime));
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("url de {string} oldugunu test eder")
    public void urlDeOldugunuTestEder(String arananKelime) {
        String acutalUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(acutalUrl.contains(arananKelime));
    }
}
