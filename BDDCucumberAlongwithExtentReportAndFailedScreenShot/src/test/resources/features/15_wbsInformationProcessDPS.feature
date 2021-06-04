#Author: RameshRathod
@wbsInformation
Feature: Validating WBSInformation Header as a Process Role

  Scenario Outline: Validate login
    Given validate user login as a "<process>" role
    Then validate user select newly created project card
    Then validate "<wbsInfo>" header is clicked

    Examples: 
      | process        | wbsInfo         |
      | process@bv.com | WBS Information |

  Scenario Outline: Validate Philosophy Document List Section
    Then validate viewing data that needs to be updated, I can click on addRow button to addOrupdate data and changes have been made on the screen the Save button enable "<philosophyDocumentnumber>","<philosophyDocumentName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed
    Then validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName              | philosophyDocumentnumber | philosophyDocumentName |
      | Philosophy Document List |                     6666 | Automation Philo       |

  Scenario Outline: Validate Study List Section
    Then validate user click on "<sectionName>"
    When validate viewing data that needs to be updated, i can click on addRow button to addOrupdate the data and change have been made on the screen the Save button enable "<studyNumber>","<studyName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    #When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed
    When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
    Then validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then validate Top header is completed with cheked mark
    Then closing the browser

    Examples: 
      | sectionName | studyNumber | studyName        |
      | Study List  |         666 | Automation study |
