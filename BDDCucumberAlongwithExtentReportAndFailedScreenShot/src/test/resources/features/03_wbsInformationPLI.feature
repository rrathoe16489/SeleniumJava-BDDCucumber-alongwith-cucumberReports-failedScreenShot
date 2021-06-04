#Author: RameshRathod
@WBSInformation
Feature: Validating WBS Information Header PLI Role

  Scenario Outline: Validate as a PLI role, user click on the WBSInformation Header
    Given validate user login as a "<pli>" role
    Then validate user select newly created project card
    Then validate "<wbsInfo>" header is clicked

    Examples: 
      | pli            | wbsInfo         |
      | RathodR@bv.com | WBS Information |

  Scenario Outline: Validate CWAList SubSection - User are able to Add new Row
    Then validate user click on add row button and user enter the CWA Number and CWA Name "<CWANumberTextBox>","<CWANameTextBox>"
    Then Validate save button is enabled
    Then Validate user click on the save button
    Then validate complete button is enabled
    Then validate user click on complete button
    Then validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName | CWANumberTextBox | CWANameTextBox |
      | CWA List    |             1234 | Test123        |

  Scenario Outline: Validate ModuleList SubSection - User are able to Add new Row
    Then validate user click on "<sectionName>"
    Then validate user click on add row button and user enter the Modulenumber and modulename and CWA Numbername "<moduleNumberColumnTextBox>","<moduleNameColumnTextBox>","<cwaNumberNameDropDown>"
    Then Validate save button is enabled
    Then Validate user click on the save button
    Then validate complete button is enabled
    Then validate user click on complete button
    Then validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName | moduleNumberColumnTextBox | moduleNameColumnTextBox | cwaNumberNameDropDown |
      | Module List | 1234M                     | ModuleTest              | 1234-Test123          |

  Scenario Outline: Validate PurchaseSpecificationList - user are able to Add new Row
    Then validate user click on "<sectionName>"
    Then validate user click on addRow button and user enter the value in PurchaseSpecificationNumber and PurchaseSpecificationName and Discipline column "<PurchaseSpecificationNumber>"
    Then Validate save button is enabled
    Then Validate user click on the save button
    Then validate complete button is enabled
    Then validate user click on complete button
    Then validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName                 | PurchaseSpecificationNumber |
      | Purchase Specification List |                          61 |

  Scenario Outline: Validate Process Area List Section - User are able to Add new Row
    Then validate user click on "<sectionName>"
    Then validate user click on addRow button and user enter the value in Process Area ID and Process Area Name "<processAreaID>","<processAreaName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
    Then validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then validate Top header is completed with cheked mark
    Then closing the browser

    Examples: 
      | sectionName       | processAreaID | processAreaName |
      | Process Area List |           123 | processName     |
