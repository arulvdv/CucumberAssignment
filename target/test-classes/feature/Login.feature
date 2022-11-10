Feature: Validate Sign Up and Email compose

  Background: 
    Given User should be able to navigate to demo url

  @scenario1
  Scenario Outline: Validate Sign up
    And User should click on Sing up link
    When User enters First name "<First name>" and "<Last name>"
    And User enters Email "<e-mail>" and Username "<Username>"
    And User enters Password "<pass>" and "<Confirm password>"
    And User should click on Register button
    Then User should be able to Sign up

    Examples: 
      | First name | Last name | e-mail                | Username    | pass    | Confirm password |
      | arul3      | vadivu3   | arulvadivu3@gmail.com | arulvadivu3 | arul123 | arul123          |

  @Scenario2
  Scenario Outline: Validate Email compose
    When User enters Username "<Username>" and Password "<Password>"
    And User should click on Login
    And User should click Inbox and then Compose message
    And User should enter Send to "<Send to>"
    And User should enter Subject "<Subject>"
    Then User should be able to send the email successfully

    Examples: 
      | Username   | Password | Send to | Subject      |
      | arulvadivu | arul123  | ami     | Sample email |
