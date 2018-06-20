Feature: Login user

  @lunaTest
  Scenario: Login
    Given I have accessed the site
    When I type a valid email in email field
    And I type a valid password in password field
    And I click 'Login'
    Then I should be redirect to the secure area

#  Scenario: Insert wrong password
#    Given I have accessed the site
#    When  I type a valid email in email field
#    And I type an invalid password in password field
#    And I click 'Continue'
#    Then I should see an error message
#    And I shouldn't see the page redirect
#
#  Scenario: Insert wrong email
#    Given I have accessed the site
#    When I type an invalid email in email field
#    And I type a valid password in password field
#    And I click 'Continue'
#    Then I should see an error message
#    And I shouldn't see the page redirect
#
#  Scenario: Insert wrong email and password
#    Given I have accessed the site
#    When  I type an invalid email in email field
#    And I type an invalid password in password field
#    And I click 'Continue'
#    Then I should see an error message
#    And I shouldn't see the page redirect
#
#  Scenario: Insert no data
#    Given I have accessed the site
#    When I click in 'Continue' button
#    Then I should see an error message
