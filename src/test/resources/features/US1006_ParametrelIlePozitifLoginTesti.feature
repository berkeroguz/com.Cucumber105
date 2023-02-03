
Feature: US1006 Kullanici configuration dosyasindaki bilgilerle login olabilmeli

  Scenario: TC09 Gecerli Kullanici adi ve sifre ile pozitif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk safa login linkine click yapar
    And kullanici kutusuna "qdGecerliUsername" yazar
    And password kutusuna "qdGecerliPassword" yazar
    Then login butonuna basar
    And basarili giris yapildigini test eder
    Then sayfayi kapatir.