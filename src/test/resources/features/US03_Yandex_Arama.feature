@yandex
Feature: US03_Yandex Arama

  Background: user is on the yandex page
    Given user is on the yandex page

    Scenario: TC03 Iphone arama
      When user search for iphone on yandex
      Then verify the result is iphone on yandex
      Scenario: TC03 Tea pot arama
        When user search tea pot on yandex
        Then verify the result is tea pot on yandex
