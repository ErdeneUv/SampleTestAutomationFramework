@done
Feature: User Login

  Background:
  Given User is on sample site

  Scenario: Invalid credentials
  When Click on Personal Banking module
  When User input invalid username and password
  When press on login button
  Then I shouldn't login
