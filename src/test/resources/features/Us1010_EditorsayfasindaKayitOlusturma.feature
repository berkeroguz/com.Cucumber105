
Feature: US1010 Kullanici Scenario Outline ile Editor sayfasında kayit olusturur

  Scenario Outline: TC15 Editor sayfasinda birden fazla kayit olusturabilmeli

    When kullanici "editorUrl" anasayfaya gider
    Then new butonuna basar
    And First name kutusuna "<firstName>" yazar
    And Last name kutusuna "<lastName>" yazar
    And position kutusuna "<position>" yazar
    And Office kutusuna "<office>" yazar
    And extension kutusuna "<Extension>" yazar
    And start date kutusuna "<startDate>" yazar
    And Salary kutusuna "<salary>" yazar
    And create tusuna basar
    When kullanici "<firstName>" ile arama yapar
    Then isim bolumunde "<firstName>" oldugunu dogrular
    And 2 saniye bekler
    Then sayfayi kapatir.

    Examples:
    |firstName|lastName|position|office|Extension|startDate|salary|
    |Ilker    |Bulut   |QA      |Istanbul|Levent |2021-01-01|20000|
    |Ahmet    |Ezo     |Developer|Balıkesir|Levent|2010-01-01|23400|
    |Yasir    |dindar  |QA Team  |Konya    |Akşehir|2022-02-02|25000|

