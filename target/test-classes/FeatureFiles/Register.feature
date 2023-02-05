Feature: Registration functionality scenarios

  @Register @One
  Scenario: Verify whether the user is able to register into the application by providing all the details
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | Sasa                         |
      | LastName  | Vel                          |
      | Email     | sasa.velimirovic96@gmail.com |
      | Telephone | +381644005582                |
      | Password  | Sasa1996!                    |
    And I select the Privacy Policy
    Then I should see that the User account has successfully created