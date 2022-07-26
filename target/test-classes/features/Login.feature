Feature: My application validation
  

  Scenario: Validate login page with possitive data
    Given Initialize the browser with chrome
    And navigate to "Testing" site
    And click on login button present on landing page
    When User enters "UN" and "PW"
    Then Navigated to the home page and user logged sucessfully
    