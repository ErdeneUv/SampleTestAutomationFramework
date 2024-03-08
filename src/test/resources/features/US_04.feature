Feature: DropDown practice

  Scenario: User should be able to interact with all select dropdowns
    When User select simple dropdown
    Then User should be able to select 2nd option
    Then User should be able to select his birthdate
