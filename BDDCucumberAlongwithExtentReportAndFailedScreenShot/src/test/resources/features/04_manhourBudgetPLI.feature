#Author: RameshRathod
Feature: Validating ManHourBudget as a PLI Role

  Scenario Outline: Validate Piping Section
    Given validate user login as a "<pli>" role
    Then validate user select newly created project card
    Then validate "<manHourBudgets>" header is clicked

    Examples: 
      | pli            | manHourBudgets |
      | RathodR@bv.com | Manhour Budget |

  Scenario Outline: Validate Piping Section
    Then validate user fill the data in "<activityName>","<US ENG Hours>","<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
     When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
     |sectionName | activityName            | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
     | Piping | Tie-In List And Details |           25 |               |               |                |

  Scenario Outline: Validate Electrical Section
    Then validate user click on "<sectionName>"
    Then validate user fill the data in "<activityName>","<US ENG Hours>","<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
     When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName | activityName                                             | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
      | Electrical  | Electrical Load List excluding Voltage Drop Calculations |           25 |               |               |                |

  Scenario Outline: Validate I&C Section
    Then validate user click on "<sectionName>"
    Then validate user fill the data in "<activityName>","<US ENG Hours>","<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
     When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName | activityName     | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
      | I&C         | Instrument Index |           25 |               |               |                |

  Scenario Outline: Validate Structural Section
    Then validate user click on "<sectionName>"
    Then validate user fill the data in "<activityName>","<US ENG Hours>","<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName | activityName           | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
      | Structural  | Piling Detail Drawings |           25 |               |               |                |

  Scenario Outline: Validate Process Section
    Then validate user click on "<sectionName>"
    Then validate user fill the data in "<activityName>","<US ENG Hours>","<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
     When validate Section is completed, a check next to the "<sectionName>" label will display in left panel

    Examples: 
      | sectionName | activityName  | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
      | Process     | Line Schedule |           25 |               |               |                |

  Scenario Outline: Validate Equipment Section
    Then validate user click on "<sectionName>"
    Then validate user fill the data in "<activityName>","<US ENG Hours>","<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
    #Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then validate manHourBudget header is completed with cheked mark
    Then closing the browser

    Examples: 
      | sectionName | activityName           | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
      | Equipment   | Mechanical Data Sheets |           25 |               |               |                |
