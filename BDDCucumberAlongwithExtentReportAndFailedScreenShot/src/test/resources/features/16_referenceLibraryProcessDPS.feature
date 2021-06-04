#Author: RameshRathod
Feature: Validating ReferenceLibrary Header as a Process role

  Scenario Outline: Validate login
    Given validate user login as a "<process>" role
    Then validate user select newly created project card
    Then validate "<referenceLib>" header is clicked

    Examples: 
      | process        | referenceLib      |
      | process@bv.com | Reference Library |

  Scenario Outline: Validate ProjectSpecificDocumentsprocess sections
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only editing of name "<name>" and ID, deletingorpasting of Link "<link>" allowed
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    #Then Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click
    When validate user click on AddReference button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName                          | categoryName        | name       | ID  | link                    |
      | Project-Specific Documents - Process | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate clientDocumentsProcess sections
    Then validate user click on "<sectionName>"
    When validate user click on AddReference button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate moving the slider to on position only editing of name "<name>" and ID, deletingorpasting of Link "<link>" allowed
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName                | categoryName        | name       | ID  | link                    |
      | Client Documents - Process | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ProceduresProcess section
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
      | sectionName          | name            | link                    |
      | Procedures - Process | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate calculationTemplatesProcess sections
    Then validate user click on "<sectionName>"
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    When validate user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save button
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName                     | name       | link                    |
      | Calculation Templates - Process | Automation | https://www.google.com/ |

  Scenario Outline: Validate typicalDetailsProcess sections
    Then validate user click on "<sectionName>"
    When validate user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save button
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName               | name       | link                    |
      | Typical Details - Process | Automation | https://www.google.com/ |

  Scenario Outline: Validate ManualsHandbooksProcess sections
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
      | sectionName                 | name            | link                    |
      | Manuals/Handbooks - Process | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate trainingProcess sections
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
      | Training - Process | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate otherProcess sections
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
      | sectionName     | name            | link                    |
      | Other - Process | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate checklistsProcess sections
    Then validate user click on "<sectionName>"
    When validate user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save button
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then validate Top ReferenceLibrary header is completed with cheked mark
    Then closing the browser

    Examples: 
      | sectionName          | name       | link                    |
      | Checklists - Process | Automation | https://www.google.com/ |
