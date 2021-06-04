#Author: RameshRathod
Feature: Reference Library as a Equipment role

  Scenario Outline: Validate login
    Given validate user login as a "<equipment>" role
    Then validate user select newly created project card
    Then validate "<referenceLib>" header is clicked

    Examples: 
      | equipment        | referenceLib      |
      | equipment@bv.com | Reference Library |

  Scenario Outline: Validate ProjectSpecificDocumentsEquipment sections
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
      | sectionName                            | categoryName        | name       | ID  | link                    |
      | Project-Specific Documents - Equipment | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ClientDocumentEquipmentSection sections
    Then validate user click on "<sectionName>"
    When validate user click on AddReference button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate moving the slider to on position only editing of name "<name>" and ID, deletingorpasting of Link "<link>" allowed
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName                  | categoryName        | name       | ID  | link                    |
      | Client Documents - Equipment | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ProceduresEquipment section
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
      | sectionName            | name            | ID  | link                    |
      | Procedures - Equipment | Automation Name | 123 | https://www.google.com/ |

  Scenario Outline: Validate calculationTemplatesEquipment sections
    Then validate user click on "<sectionName>"
    When validate user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save button
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName                       | name       | ID  | link                    |
      | Calculation Templates - Equipment | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate typicalDetailsEquipment sections
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
      | Typical Details - Equipment | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate ManualsHandbooksEquipment sections
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
      | sectionName                   | name            | link                    |
      | Manuals/Handbooks - Equipment | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate trainingEquipment sections
    Then validate user click on "<sectionName>"
    When validate user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName          | name       | ID  | link                    |
      | Training - Equipment | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate otherEquipment sections
    Then validate user click on "<sectionName>"
    When validate user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName       | name       | ID  | link                    |
      | Other - Equipment | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate checklistsEquipment sections
    Then validate user click on "<sectionName>"
    When validate user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then validate Top ReferenceLibrary header is completed with cheked mark
    Then closing the browser

    Examples: 
      | sectionName            | name       | ID  | link                    |
      | Checklists - Equipment | Automation | 123 | https://www.google.com/ |
