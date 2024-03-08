@done
Feature: As a user I want to check out Small Business tab, and click on ATM button

Background:
Given User is on sample site

  Scenario:
  When User goes to Small Business tab
  Then User should see enroll button

  When User click on ATM locator
  Then User should be in "https://locators.bankofamerica.com/"