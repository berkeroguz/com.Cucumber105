@wip
Feature: US1011 Kullanici herokuapp sayfasinda butonlarin gorunur oldugnu test eder

  Scenario: TC16 Kullanici bekleyerek butonlarin gorunur olmasini saglamali

    Given kullanici "herokuappUrl" anasayfaya gider
    Then Add Element butonuna basar
    And Delete butonunun gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder
    Then sayfayi kapatir.

