Feature: US1002 Kullanici amazon anasayfada birden fazla ürün aratır

  Scenario: TC02 Kullanici urunleri aratip test edebilmeli

    Given kullanici amazon anasayfaya gider.
    Then amazon arama kutusuna Nutella yazip aratir.
    And arama sonuclarinin nutella icerdigini test eder.
    And sayfayi kapatir.

    Given kullanici amazon anasayfaya gider.
    Then amazon arama kutusuna Java yazip aratir
    And arama sonuclarının Java icerdigini test eder
    Then sayfayi kapatir.

    Given kullanici amazon anasayfaya gider.
    Then amazon arama kutusuna Samsung yazip aratir
    And arama sonuclarının Samsung icerdigini test eder
    Then sayfayi kapatir.