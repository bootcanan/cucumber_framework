Feature: US_Different url

  Scenario Outline:
    Given user is on "<url_page>" page

    Examples:
    |url_page|
    |amazon_url|
    |yandex_url|
    |fb_url|