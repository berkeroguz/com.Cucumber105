
Feature: US1009 Yanlis kullanici adi ve password listesi ile negatif login testi

  Scenario Outline: TC14 yanlis kullanici listesi ile giris yapilamamali

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk safa login linkine click yapar
    And kullanici kutusuna manuel olarak "<yanlisUsername>" yazar
    And password kutusuna manuel olarak "<yanlisPassword>" yazar
    And 3 saniye bekler
    And login butonuna basar
    And basarili giris yapilamadigini test eder
    Then sayfayi kapatir.

    Examples:
    |yanlisUsername | yanlisPassword|
    |ilker          |ilker@a.com    |
    |mehmet         |mehmet@b.com   |
    |yasar          |yasar@c.com    |
    |Adem           |adem@d.com     |
    |ogzur          |ozgur@e.com    |