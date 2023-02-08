package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-reports.html"},
        features = "src/test/resources/features",
        glue = "stepdefinitions" ,
        tags = "@wip",
        dryRun = false
)
public class Runner {
    /*
        Cucumber'da Runner class'i bos bir class'tir
        Runner class'ini diger class'lardan farkli kilan ve TestNG'deki
        xml dosyalari gibi calismasini saglayan 2 adet notasyon mevcuttur.

        @RunWith notasyonu projemize cucumber junit depency eklememizin sebebidir. Bu sayede runner class'larimiz
        cucumber ile çalısır.

        @CucumberOptions notasyonu ile istedigimiz özellikleri Runner class'ine ekleyebiliriz.

        **Öncelikli görevi features dosyalari ile stepdefinitions'dea bulunan Java Method'larini iliskilendirmektir.

        tags : features klasörü içerisinde yazılan taglari aratip buldugu tum feature veya scenario'lari calistirir

        dryRun : iki deger alabilir.
        true : secilirse, verilen tag ile isaretli olan feature veya scneario'daki
        eksik stepdeinitions'lari bulup ilgili method'lari olusturur
        hic bir sekilde testimizi calistirmaz
        eksik adim yoksa test passed olarak isaretler.

     */
}
