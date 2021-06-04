#Author: RameshRathod
@projectInformation
Feature: Project Information as a DPS Equipment Role

  Scenario Outline: Validate Equipment discipline
    Given validate user login as a "<equipment>" role
    Then validate user select newly created project card
    Then validate "<projectInformation>" header is clicked
    Then closing the browser

    Examples: 
      | equipment        | projectInformation  |
      | equipment@bv.com | Project Information |
