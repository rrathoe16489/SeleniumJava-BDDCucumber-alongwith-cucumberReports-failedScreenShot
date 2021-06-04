#Author: RameshRathod
@WBSInformationDPS
Feature: Validating WBS Information Header Piping Role

  Scenario Outline: Validate Login
    Given validate user login as a "<piping>" role
    Then validate user select newly created project card
    Then validate "<wbsInfo>" header is clicked

    Examples: 
      | piping        | wbsInfo         |
      | piping@bv.com | WBS Information |

  Scenario Outline: validate As a Piping discipline I will see sections:  Pipe Specification List
    Then validate viewing data that needs to be updated, I can click on Pipe Specification List to addOrupdate the data and changes have been made on the screen by clicking on save "<pipeSpecificationNumber>","<pipeSpecificationMaterial>","<pipeSpecificationClass>"
    Then Validate user click on the save button
    Then validate user click on complete button
    Then validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName             | pipeSpecificationNumber | pipeSpecificationMaterial | pipeSpecificationClass |
      | Pipe Specification List |                   66666 | Automation Piping         | Test Class             |

  Scenario Outline: validate As a Piping discipline I will see sections: Tie-in Priority List
    Then validate user click on "<sectionName>"
    Then validate viewing data that needs to be updated, I can click on addROW button to addOrupdate the data and changes have been made on the screen the Save button enable "<tieInPriority>","<tieInPriority1>"
    Then Validate user click on the save button
    Then validate user click on complete button
    Then validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName          | tieInPriority | tieInPriority1 |
      | Tie-in Priority List |          6666 |            664 |

  Scenario Outline: Validate SystemFluid List Section
    Then validate user click on "<sectionName>"
    When validate viewing data that needs to be updated, i can click on addROW button to addOrupdate the data and changes have been made on the screen the Save button enable "<fluidName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
    Then validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then validate Top header is completed with cheked mark
    Then closing the browser

    Examples: 
      | sectionName       | fluidName |
      | System/Fluid List | AutoFliud |
