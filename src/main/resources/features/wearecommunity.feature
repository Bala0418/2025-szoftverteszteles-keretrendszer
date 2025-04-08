Feature: Test WeAreCommunity page
  Scenario:
    Given The WeAreCommunity page is opened
    When The Communities button is clicked
    Then The Communities page is loaded
    And The WeAreCommunity card is visible
    When The "test" is typed in to the Search bar