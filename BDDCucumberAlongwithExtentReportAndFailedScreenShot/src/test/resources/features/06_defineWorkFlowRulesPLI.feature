#Author: RameshRathod
Feature: WorkflowRule for PLI Role

  Scenario Outline: Validate As a PLI Define Workflow Rules: View and update FragnetStep durations and Define Workflow Rules: Select Applicable FragnetStep Types
    Given validate user login as a "<pli>" role
    Then validate user select newly created project card
    Then validate "<workflowrule>" header is clicked
    Then validate If the box is unselected, upon hovering over a box, a select button appears
    Then validate Upon selecting FragnetStep boxes, I can view the default durations tied to each step
    Then validate when a duration needs to be changed, I can edit the durations by selecting the duration field
    Then validate PLI is displayed a generic workflow with Create, and Issue for Construction static; In-House Review, Client Review, Combined IHR & Client Review, and 3rd-Party Review are selectable
    Then validate If In-House Review or Client Review is selected, Combined IHR & Client Review CANNOT be selected and vice versa
    Then validate If the box is selected, upon hovering over a box, a deselect button appears
    Then validate Deselecting box removed check from upper left corner.
    Then Validate user click on the save button
    Then validate user click on complete button
    When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
    Then validate Top defineWorkFlow header is completed with cheked mark
    Then closing the browser

    Examples: 
      | pli            | workflowrule   |
      | RathodR@bv.com | Workflow Rules |
