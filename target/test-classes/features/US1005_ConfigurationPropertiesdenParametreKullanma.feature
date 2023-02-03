Feature: US1005 Kullanici configutarion.properties'de yazilan datalari parametre olarak kullanma
  # 3 Scenario olusturup amazon,wisequarter ve walmart anasayfalarına gidin
  # ve o sayfalara gittiginizi test edin

  Scenario: TC06 Kullanici amazon sitesine gidisi test eder

    Given kullanici "amazonUrl" anasayfaya gider
    Then url de "amazon" oldugunu test eder
    And sayfayi kapatir.

  Scenario: TC07 Kullanici wisequarter sitesine gidisi test eder

    Given kullanici "wqUrl" anasayfaya gider
    Then url de "wisequarter" oldugunu test eder
    And sayfayi kapatir.

  Scenario: TC08 Kullanici walmart sitesine gidisi test eder

    Given kullanici "walmartUrl" anasayfaya gider
    Then url de "walmart" oldugunu test eder
    And sayfayi kapatir.