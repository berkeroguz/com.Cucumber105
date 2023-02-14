
Feature: US1004 Kullanici bastaki ortak adimlar icin background kullanir.

  Background: Tum scenario'lar icin ortak ilk adim
    Given kullanici amazon anasayfaya gider.

    @p1
  Scenario: TC03 Kullnici parametreli method ile Nutella aratir.


    Then amazon arama kutusuna "Nutella" yazip aratir.
    And arama sonuclarinin "Nutella" icerdigini test eder.
    And sayfayi kapatir.
@p2
  Scenario: TC04 Kullanici parametreli method ile Java aratir.

    Then amazon arama kutusuna "Java" yazip aratir.
    And arama sonuclarinin "Java" icerdigini test eder.
    And sayfayi kapatir.