Feature: US1001 Kullanici amazonda test yapar
@p2
  Scenario: TC01 Kullanici amazonda nutella aratir

    Given kullanici amazon anasayfaya gider.
    Then amazon arama kutusuna Nutella yazip aratir.
    And arama sonuclarinin nutella icerdigini test eder.
    Then sayfayi kapatir.