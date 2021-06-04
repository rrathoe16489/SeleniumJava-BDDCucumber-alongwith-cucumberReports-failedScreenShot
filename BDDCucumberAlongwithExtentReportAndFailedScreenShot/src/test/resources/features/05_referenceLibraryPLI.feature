#Author: RameshRathod
@ReferenceLibrary
Feature: Reference Library as a PLI Role

  Scenario Outline: Validate login
    Given validate user login as a "<pli>" role
    Then validate user select newly created project card
    Then validate "<referenceLib>" header is clicked

    Examples: 
      | pli            | referenceLib      |
      | RathodR@bv.com | Reference Library |

  Scenario Outline: Validate Project-Specific Documents - Management sections
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only editing of name "<name>" and ID, deletingorpasting of Link "<link>" allowed
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    # Then Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click
    When validate user click on AddReference button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName                             | categoryName        | name       | ID  | link                    |
      | Project-Specific Documents - Management | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ClientDocumentManagementSection sections
    Then validate user click on "<sectionName>"
    When validate user click on AddReference button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate moving the slider to on position only editing of name "<name>" and ID, deletingorpasting of Link "<link>" allowed
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName                   | categoryName        | name       | ID  | link                    |
      | Client Documents - Management | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ProcedureManagement section
    #Then validate ProcedureManagement section is Display and click
    Then validate user click on "<sectionName>"
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    When validate user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    

    Examples: 
      | sectionName             | name            | link                    |
      | Procedures - Management | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate manualsHandbooksManagement sections
        Then validate user click on "<sectionName>"
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    When validate user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName                    | name            | link                    |
      | Manuals/Handbooks - Management | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate OtherManagement sections
    #Then validate user click on OtherManagement SubSection
    Then validate user click on "<sectionName>"
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    When validate user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName        | name            | link                    |
      | Other - Management | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate checklistsManagement sections
    #Then validate user click on checklistsManagement SubSection
    Then validate user click on "<sectionName>"
    When Validate user when moving the slider to on position
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    When validate user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then validate Top ReferenceLibrary header is completed with cheked mark
    Then closing the browser

    Examples: 
      | sectionName             | name            | link                    |
      | Checklists - Management | Automation Name | https://www.google.com/ |
