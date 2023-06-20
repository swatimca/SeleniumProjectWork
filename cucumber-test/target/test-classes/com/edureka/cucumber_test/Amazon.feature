Feature:  Login Feature

  @tag1
  Scenario: Successfully login with valid credentials
    Given I am in the login page of url https://www.amazon.in/
    When I enter "swati.d.bajpayee@gmail.com" and "Swat@june23"
    And click on submit button
    Then I should be successfully logged in