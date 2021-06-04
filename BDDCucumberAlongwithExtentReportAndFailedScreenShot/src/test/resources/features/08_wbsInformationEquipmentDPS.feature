#Author: RameshRathod
@wbsInformation
Feature: Validating WBS Information Header Equipment Role

  Scenario Outline: Validate login
    Given validate user login as a "<equipment>" role
    Then validate user select newly created project card
    Then validate "<wbsInfo>" header is clicked

    Examples: 
      | equipment        | wbsInfo         |
      | equipment@bv.com | WBS Information |

  Scenario Outline: Validate Mechenical Equipment List
    Then validate viewing data that needs to be updated, I can click on addRow button to addORupdate the data and changes have been made on the screen the Save button enable "<equipmentTag>","<equipmentTagName>","<equipmentType>","<pSpecification>","<processAreaID>","<cwaNumberName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
    Then validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then validate Top header is completed with cheked mark
    Then closing the browser

    Examples: 
      | sectionName               | equipmentTag | equipmentTagName | equipmentType | pSpecification                              | processAreaID | cwaNumberName |
      | Mechanical Equipment List | AutoTag      | Autoequipment    | Pump          | 61-Civil/Structural Equipment and Materials |           123 |           123 |
