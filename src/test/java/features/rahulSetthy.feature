#Author: suvendusamal@gmail.cpm
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: validation of rahul setthy demo website.


  @tag1
  Scenario: verify user is able to login with valid credential.
    Given user should lunch the login url
    And validate the title of login page
    When User enter the username and password
    And click on login button
    Then page will navigate to home page
    And validate you are in home page

   