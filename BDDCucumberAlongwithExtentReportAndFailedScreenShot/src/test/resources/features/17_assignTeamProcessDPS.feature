#Author: RameshRathod
Feature: Validating AssignTeam Header as a Process Role

  Scenario Outline: Validate login
    Given validate user login as a "<process>" role
    Then validate user select newly created project card
    Then validate "<assignTeam>" header is clicked

    Examples: 
      | process        | assignTeam  |
      | process@bv.com | Assign Team |

  Scenario Outline: Validate ProcessTeamLeads Section: Select Roles and add professional name and Navigation
    When validate "<sectionName>" section is NOT completed, an empty circle next to the Section label will display in left panel
    When validate toggle is ON and the name field will enable
    When validate entering the assignee name, it will search for matching names and display NameJobFamilyOffice "<assigneeName>"
    Then Validate user click on the save button
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disable "<assigneeNameEdit>"
    When validate System will prompt user to save record if user is moving away from sectionscreen to "<otherSection>" without saving data
    When validate the section information has been saved and the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable
    When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role "<assigneeName>","<addProfessional>"
    Then Validate user click on the save button
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then Validate user click on the Edit button
    When validate clicking on Define User Permissions displays a list of user permissions so that I can assign an individual in Discipline "<assigneeName>"
    Then validate hovering over i icon next to user permissions provides additional informationORdescription of permissions
    Then validate user can select Save to save the selections

    Examples: 
      | sectionName        | assigneeName                   | assigneeNameEdit                            | otherSection | addProfessional                             |
      | Process Team Leads | Matthew Fowler / Lead / Kansas | Pooja Chaurasiya / Project Engineer / Wipro | Process Team | Pooja Chaurasiya / Project Engineer / Wipro |

  Scenario Outline: Validate ProcessTeam Section: Select Roles and add professional name and Navigation
    Then validate user click on "<sectionName>"
    When validate "<sectionName>" section is NOT completed, an empty circle next to the Section label will display in left panel
    When validate toggle is ON and the name field will enable
    When validate entering the assignee name, it will search for matching names and display NameJobFamilyOffice "<assigneeName>"
    Then Validate user click on the save button
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disable "<assigneeNameEdit>"
    When validate System will prompt user to save record if user is moving away from sectionscreen to "<otherSection>" without saving data
    When validate the section information has been saved and the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable
    When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role "<assigneeName>","<addProfessional>"
    Then Validate user click on the save button
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then Validate user click on the Edit button
    When validate clicking on Define User Permissions displays a list of user permissions so that I can assign an individual in Discipline "<assigneeName>"
    Then validate hovering over i icon next to user permissions provides additional informationORdescription of permissions
    Then validate user can select Save to save the selections

    Examples: 
      | sectionName  | assigneeName                           | assigneeNameEdit                    | otherSection       | addProfessional                     |
      | Process Team | Rohan Mendu / Project Engineer / Wipro | Himani Bhatnagar / null / undefined | Process Team Leads | Himani Bhatnagar / null / undefined |

  Scenario Outline: Validate Add Project Role
    Then validate user click on "<sectionName>"
    Then valiate user click on the Edit button
    When verify that user is able add new role and view added Role "<roleTitle>","<roleDiscription>"
    Then Validate user click on the save button
    Then validate user click on complete button
    Then closing the browser

    Examples: 
      | sectionName        | roleTitle       | roleDiscription       | duplicateRole      |
      | Process Team Leads | Automation Role | Testing Automation... | Automation Role152 |
