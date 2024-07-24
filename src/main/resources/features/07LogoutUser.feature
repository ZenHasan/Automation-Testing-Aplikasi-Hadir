Feature: Logout

  Scenario: Successfull login and logout user with valid credentials
    Given I am on the login page user
#    When I enter a valid email and password user
#    And I click the submit button user
    And Logout in page user
    Then I succesfully logout
