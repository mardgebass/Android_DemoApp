Feature: Swipe

  @ValidCredentials
  Scenario: Swipe cards
    Given User is on Swipe page
    When User swipe card
    Then User should see a new card