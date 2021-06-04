#Author: RameshRathod
@projectInformation
Feature: Project Information as a Process Role

  Scenario Outline: Validate login
    Given validate user login as a "<process>" role
    Then validate user select newly created project card
    Then validate "<projectInformation>" header is clicked

    Examples: 
      | process        | projectInformation  |
      | process@bv.com | Project Information |

  Scenario Outline: Validate Process Section
    When validate user updateORenter value in Design Review Facilitation Textbox "<processDataSoftware>","<plantCapacity>"
    When validate addField button is Display and click
    Then validate user enter value in fieldName textBox "<fieldName>"
    Then Validate user select value from the valueType dropDown
    Then Validate user click on the Save button
    When validate user enter alphabet in numeric field "<alphabetinnumeric>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then validate Top ProjectInformation header is completed with cheked mark
    Then closing the browser

    Examples: 
      | sectionName | processDataSoftware | plantCapacity | fieldName          | alphabetinnumeric |
      | Process     | Test                | TestAuto      | Testing Automation | Testing           |
