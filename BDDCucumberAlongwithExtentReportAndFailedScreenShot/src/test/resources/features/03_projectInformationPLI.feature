#Author: RameshRathod
@projectInformation
Feature: Validating Project Information Header as a PLI Role

  Scenario Outline: Validate login as PLI role
    Given validate user login as a "<pli>" role
    Then validate user select newly created project card
    Then validate "<projectInformation>" header is clicked

    Examples: 
      | pli            | projectInformation  |
      | RathodR@bv.com | Project Information |

  Scenario: Checking the Initial fuctionality GeneralProjectInformation SubSection
    When User click on the GeneralProjectInformation SubSection First Time
    When Verify user can select value from the Project Type dropdown
    Then validate ResetBtn is Enable
    Then validate SaveBtn is Enable

  Scenario: Checking the functionlity of Reset button under GeneralProjectInformation SubSection
    When Validate user click on ResetButton
    Then Validate ResetPage modal is popUp
    Then validate Reset message is display under pop Modal
    Then validate click on cancel button modal is disapear
    Then validate again user click on reset button
    Then validate user click on continue button

  Scenario Outline: Checking user can enter the value in textBox Or Fill the entire form under GeneralProjectInformation SubSection
    When Verify user can select value from the TypeOfFacility dropdown
    Then Verify user can select value from the SupportingOffices dropdown
    Then Verify user can select radio button in RiskAssessmentCompleted field
    Then Verify user can enter value in ProposalProjectRiskScore Textbox "<ProposalProjectRiskScore>"
    Then Verify user can enter value in ProposalProjectRiskLevel Textbox "<risklevel>"
    Then Verify user can select value from the LeadOffice dropdown
    Then Verify user can enter the value in FacilityTechnology textBox "<FacilityTechnology>"
    # Then Verify user can select value from the ConstructionContractType dropdown
    Then Verify user can enter value in ClientName Textbox "<ClientName>"
    Then Verify user can select radio button from BrownAndGreen field
    Then Verify user can select radio button from AreThereForiegnContract field
    Then Verify user can select radio button from IsBlackAndVeatch field
    Then Validate ProjectLocation Ttile is display
    Then Validate AddField IconText is display
    Then Verify user can enter value in ProjectLocationState Textbox "<ProjectLocationState>"
    Then Verify user can enter value in ProjectLocationCountry Textbox "<ProjectLocationCountry>"
    Then Verify user can enter value in ProjectLocationCity Textbox "<ProjectLocationCity>"
    Then Validate KeyScheduleDates Ttile is display
    Then Validate AddField IconText is display
    Then Verify user can enter value in EstEngineeringTimeframe Textbox "<EstEngineeringTimeframe>"
    Then Verify user can enter value in EstConstructionTimeframe Textbox "<EstConstructionTimeframe>"

    Examples: 
      | ProposalProjectRiskScore | risklevel | FacilityTechnology | ClientName             | ProjectLocationState | ProjectLocationCountry | ProjectLocationCity | EstEngineeringTimeframe | EstConstructionTimeframe |
      |                      244 |       233 |                233 | Client Name Automation | Maharastra           | India                  | Pune                |                      35 |                       40 |

  Scenario: Validate when Moving from the page without saving a Information
    When Validate user click on the projectScope Section

  Scenario: Checking the functionlity of save button under GeneralProjectInformation SubSection
    When Validate user can Save the information by clicking on Save button
    #Then Validate Saving information message is display
    Then validate CompleteBtn is Enable

  Scenario Outline: Checking the operation when user edit the form
    When Validate user enter the value in clientName field textbox "<clientName>"
    Then validate ResetBtn is Enable
    Then validate SaveBtn is Enable
    Then Validate user can Save the information by clicking on Save button

    Examples: 
      | clientName          |
      | Client Name Testing |

  Scenario: Checking the operation of CompleteButton
    When Validate user click on the complete button
    Then validate only Edit button is display
    Then Vaidate the section have check next to the Section
    Then Validate user click on the Edit button
    Then Validate check next to the Section is removed
    Then validate CompleteBttn is Enable

  Scenario Outline: Checking the functionality of Add additional Project Metadata Field
    When validate addField button is Display With BPD title
    Then validate user click on AddField button
    Then validate user enter value in fieldName textBox "<fieldName>"
    Then Validate user select value from the valueType dropDown
    Then Validate user click on the cancel button
    Then validate PROJECTSETUP_TOPTEXT screen display

    Examples: 
      | fieldName |
      |           |

  Scenario: Check when user save the blank add field form
    When validate user click on AddField icon
    Then validate user click on the save button
    Then validate filed validation eror message is display

  Scenario Outline: Check when user enter duplicate fieldName in Add Field Modal which is already used within ProjectInformation
    When validate user enter duplicate field name "<duplicatefieldname>"
    Then validate validation error message is display
    Then Validate user select Numeric value from dropdown
    Then validate UOMType and UOM option is display
    Then validate select value from the UOMType and UOM dropDown field
    Then Validate user enter fieldName "<userenterfieldvalue>"
    Then Validate user click on the Save button
    Then validate added field is display under BasicProjectData section
    Then validate pencil icon for edit is display

    Examples: 
      | duplicatefieldname    | userenterfieldvalue |
      | Project Location City | Testing Automation  |

  Scenario Outline: Checking validation on Newly added numeric field
    When validate user enter alphabet in numeric field "<alphabetinnumeric>"
    Then Validate Validation error message is displays
    Then validate enter only numeric value "<onlyNumeric>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName                 | alphabetinnumeric | onlyNumeric |
      | General Project Information | Numeric Testing   |         444 |

  Scenario Outline: Checking all mendetory field of Project Scope section
    When Validate user click on the ProjectScope Subsection
    Then validate user select and check all mendetory field in ProjectScope and click on save then complete "<PerformanceResponsibility>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName   | PerformanceResponsibility |
      | Project Scope | Automation Testing        |

  Scenario Outline: Checking all mendetory field of Technical Requirement section
    When Validate user click on the TechnicalRequirement section
    Then validate user select and check all mendetory field in TechnicalRequirement and click on save then complete "<unitSystem>","<authorization>","<stateRegCode>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName            | unitSystem    | authorization | stateRegCode |
      | Technical Requirements | English Units | Test          |         6666 |

  Scenario Outline: Checking all mendetory field of Project Control section
    When Validate user click on the project control section
    Then validate user select and check all mendetory field in projectControl "<costTrackingSoftware>"
    When validate addField button is Display and click
    Then Validate user click on the cancel button
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName      | costTrackingSoftware |
      | Project Controls | Automation Testing   |

  Scenario Outline: Checking all mendetory field of Procurement section
    When Validate user click on the Procurement section
    Then validate user select and check all mendetory field in Procurement Software "<materialTracking>"
    When validate addField button is Display and click
    Then Validate user click on the cancel button
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then validate Top ProjectInformation header is completed with cheked mark
    Then closing the browser

    Examples: 
      | sectionName | materialTracking   |
      | Procurement | Automation Testing |
