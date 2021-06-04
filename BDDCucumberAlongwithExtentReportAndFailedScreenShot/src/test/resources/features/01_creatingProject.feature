#Author: RameshRathod
@projectInformation
Feature: Validating New Project Creation as a SuperUser Role

  Scenario Outline: Validate New Project Creation
    Given validate user login as a "<superuser>" role
    When valildate user create new project card "<projectName>"
    Then closing the browser

    Examples: 
      | superuser        | projectName                 |
      | superuser@bv.com | Pipeline Automation Project |
