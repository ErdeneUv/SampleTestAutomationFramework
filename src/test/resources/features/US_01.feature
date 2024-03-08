@done
Feature: User should not be able to login
  Background:
  Given User is on sample site

  Scenario: Verify user doesn't get logged in
  When Click on Personal Banking module
  When User input fake username and password
  When press on login button
  Then I shouldn't login