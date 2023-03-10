
Feature: US1008 Scenario Outline ile birden fazla data icin test calistirma
@p1
  Scenario Outline: TC13 Birden fazla word arama

    # Amazon ansayfaya gidelim. Nutella, Java, Samsung ve Apple icin arama yapıp
    # arama sonuclarinin aradigimiz kelimeyi icerdigini test edelim

    Given kullanici "amazonUrl" anasayfaya gider
    Then amazon arama kutusuna "<arananUrun>" yazip aratir.
    And arama sonuclarinin "<arananUrun>" icerdigini test eder.
    Then sayfayi kapatir.

    Examples:
      |arananUrun|
    |Nutella   |
    |Java      |
    |Samsung   |
    |Apple     |