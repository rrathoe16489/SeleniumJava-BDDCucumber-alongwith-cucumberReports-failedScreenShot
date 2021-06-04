#Author: RameshRathod
Feature: Validating Reference Library Header as a Piping role

  Scenario Outline: Validate login
    Given validate user login as a "<piping>" role
    Then validate user select newly created project card
    Then validate "<referenceLib>" header is clicked

    Examples: 
      | piping        | referenceLib      |
      | piping@bv.com | Reference Library |

  Scenario Outline: Validate ProjectSpecificDocumentsPiping sections
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
      | sectionName                         | categoryName        | name       | ID  | link                    |
      | Project-Specific Documents - Piping | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ClientDocumentPiping section
    Then validate user click on "<sectionName>"
    When validate user click on AddReference button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate moving the slider to on position only editing of name "<name>" and ID, deletingorpasting of Link "<link>" allowed
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName               | categoryName        | name       | ID  | link                    |
      | Client Documents - Piping | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ProceduresPiping section
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
      | sectionName         | name            | link                    |
      | Procedures - Piping | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate calculationTemplatesPiping sections
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
      | sectionName                    | name       | link                    |
      | Calculation Templates - Piping | Automation | https://www.google.com/ |

  Scenario Outline: Validate typicalDetailsPiping sections
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
      | sectionName              | name       | link                    |
      | Typical Details - Piping | Automation | https://www.google.com/ |

  Scenario Outline: Validate ManualsHandbooksPiping sections
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
      | sectionName                | name            | link                    |
      | Manuals/Handbooks - Piping | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate trainingPiping sections
    Then validate user click on "<sectionName>"
    When validate user click on AddReference button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate moving the slider to on position only editing of name "<name>" and ID, deletingorpasting of Link "<link>" allowed
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName       | categoryName        | name       | ID  | link                    |
      | Training - Piping | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate otherPiping sections
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
      | sectionName    | name            | link                    |
      | Other - Piping | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate checklistsPiping sections
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
    Then validate Top ReferenceLibrary header is completed with cheked mark
    Then closing the browser

    Examples: 
      | sectionName         | name       | link                    |
      | Checklists - Piping | Automation | https://www.google.com/ |
