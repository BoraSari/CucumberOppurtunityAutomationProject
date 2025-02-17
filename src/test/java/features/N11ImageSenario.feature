Feature: As a user I can successfully search product and also I can see an oppurtunity image on product.
  Background:
    Given setup Driver
  Scenario: Navigate to N11 website  and execute product search and check image test.
    Given User navigate to N11 website
    And search product on searchbox
    When User scroll the page
    Then User successfuly see oppurtunity image on product



