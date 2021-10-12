Feature: This feature file contains search verification
  @run
  Scenario: User should see This field is required message
    Given User is on Google page
    When User search for "Ducks"
    Then User gets a proper result for required result
