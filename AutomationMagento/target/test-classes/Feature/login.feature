Feature: Magneto login funtion

  Background: 
    Given user open the Magento website
    When user click on the signin button

  Scenario: Successful login with valid credentials
    And user enter valid login credentials "naveenraja92247@gmail.com" and "Password@123"
    And user sigin to the website
    Then user should see "Welcome, Naveen Raja!" on page

  Scenario: Login with invalid Email address
    And user enter invalid login credentials "emailbh@gmail.com" and "Password@123"
    And user sigin to the website
    Then user should see the message "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later." on page

  Scenario: Login with invalid password
    And user enter invalid login credentials "naveenraja84247@gmail.com" and "Password123"
    And user sigin to the website
    Then user should see the message "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later." on page
