#Author: RameshRathod
Feature: Validating AssignTeam Header as a SuperUser Role

  Scenario Outline: Validate login as SuperUser role
    Given validate user login as a "<superuser>" role
    Then validate user select newly created project card
    Then validate "<assignTeam>" header is clicked

    Examples: 
      | superuser        | assignTeam  |
      | superuser@bv.com | Assign Team |

  Scenario Outline: Validate PipingLead Section: Select Roles and add professional name and Navigation
    When validate "<sectionName>" section is NOT completed, an empty circle next to the Section label will display in left panel
    When validate toggle is ON and the name field will enable
    When validate entering the assignee name, it will search for matching names and display NameJobFamilyOffice "<assigneeName>"
    Then Validate user click on the save button
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disable "<assigneeNameEdit>"
    When validate System will prompt user to save record if user is moving away from sectionscreen to "<otherSection>" without saving data
    When validate the section information has been saved and the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable
    #When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role "<assigneeName>","<addProfessional>"
    Then Validate user click on the save button
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then Validate user click on the Edit button
    When validate clicking on Define User Permissions displays a list of user permissions so that I can assign an individual in Discipline "<assigneeName>"
    Then validate hovering over i icon next to user permissions provides additional informationORdescription of permissions
    Then validate user can select Save to save the selections

    Examples: 
      | sectionName  | assigneeName                      | assigneeNameEdit                      | otherSection     |
      | Piping Leads | Piping Discipline / Lead / Kansas | Electrical Discipline / Lead / Kansas | Electrical Leads |

  Scenario Outline: Validate Electrical Leads Section: Select Roles and add professional name and Navigation
    Then validate user click on "<sectionName>"
    When validate "<sectionName>" section is NOT completed, an empty circle next to the Section label will display in left panel
    When validate toggle is ON and the name field will enable
    When validate entering the assignee name, it will search for matching names and display NameJobFamilyOffice "<assigneeName>"
    Then Validate user click on the save button
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disable "<assigneeNameEdit>"
    When validate System will prompt user to save record if user is moving away from sectionscreen to "<otherSection>" without saving data
    When validate the section information has been saved and the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable
    #When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role "<assigneeName>","<addProfessional>"
    Then Validate user click on the save button
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then Validate user click on the Edit button
    When validate clicking on Define User Permissions displays a list of user permissions so that I can assign an individual in Discipline "<assigneeName>"
    Then validate hovering over i icon next to user permissions provides additional informationORdescription of permissions
    Then validate user can select Save to save the selections

    Examples: 
      | sectionName      | assigneeName                          | assigneeNameEdit                 | otherSection |
      | Electrical Leads | Electrical Discipline / Lead / Kansas | iandc Discipline / Lead / Kansas | Piping Leads |

  Scenario Outline: Validate I&C Leads Section: Select Roles and add professional name and Navigation
    Then validate user click on "<sectionName>"
    When validate "<sectionName>" section is NOT completed, an empty circle next to the Section label will display in left panel
    When validate toggle is ON and the name field will enable
    When validate entering the assignee name, it will search for matching names and display NameJobFamilyOffice "<assigneeName>"
    Then Validate user click on the save button
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disable "<assigneeNameEdit>"
    When validate System will prompt user to save record if user is moving away from sectionscreen to "<otherSection>" without saving data
    When validate the section information has been saved and the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable
    #When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role "<assigneeName>","<addProfessional>"
    Then Validate user click on the save button
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then Validate user click on the Edit button
    When validate clicking on Define User Permissions displays a list of user permissions so that I can assign an individual in Discipline "<assigneeName>"
    Then validate hovering over i icon next to user permissions provides additional informationORdescription of permissions
    Then validate user can select Save to save the selections

    Examples: 
      | sectionName | assigneeName                     | assigneeNameEdit                      | otherSection     |
      | I&C Leads   | iandc Discipline / Lead / Kansas | Structural Discipline / Lead / Kansas | Electrical Leads |

  Scenario Outline: Validate Structural Leads Section: Select Roles and add professional name and Navigation
    Then validate user click on "<sectionName>"
    When validate "<sectionName>" section is NOT completed, an empty circle next to the Section label will display in left panel
    When validate toggle is ON and the name field will enable
    When validate entering the assignee name, it will search for matching names and display NameJobFamilyOffice "<assigneeName>"
    Then Validate user click on the save button
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disable "<assigneeNameEdit>"
    When validate System will prompt user to save record if user is moving away from sectionscreen to "<otherSection>" without saving data
    When validate the section information has been saved and the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable
    #When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role "<assigneeName>","<addProfessional>"
    Then Validate user click on the save button
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then Validate user click on the Edit button
    When validate clicking on Define User Permissions displays a list of user permissions so that I can assign an individual in Discipline "<assigneeName>"
    Then validate hovering over i icon next to user permissions provides additional informationORdescription of permissions
    Then validate user can select Save to save the selections

    Examples: 
      | sectionName      | assigneeName                          | assigneeNameEdit                   | otherSection |
      | Structural Leads | Structural Discipline / Lead / Kansas | Process Discipline / Lead / Kansas | I&C Leads    |

  Scenario Outline: Validate Process Leads Section: Select Roles and add professional name and Navigation
    Then validate user click on "<sectionName>"
    When validate "<sectionName>" section is NOT completed, an empty circle next to the Section label will display in left panel
    When validate toggle is ON and the name field will enable
    When validate entering the assignee name, it will search for matching names and display NameJobFamilyOffice "<assigneeName>"
    Then Validate user click on the save button
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disable "<assigneeNameEdit>"
    When validate System will prompt user to save record if user is moving away from sectionscreen to "<otherSection>" without saving data
    When validate the section information has been saved and the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable
    #When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role "<assigneeName>","<addProfessional>"
    Then Validate user click on the save button
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then Validate user click on the Edit button
    When validate clicking on Define User Permissions displays a list of user permissions so that I can assign an individual in Discipline "<assigneeName>"
    Then validate hovering over i icon next to user permissions provides additional informationORdescription of permissions
    Then validate user can select Save to save the selections

    Examples: 
      | sectionName   | assigneeName                       | assigneeNameEdit                     | otherSection     |
      | Process Leads | Process Discipline / Lead / Kansas | Equipment Discipline / Lead / Kansas | Structural Leads |

  Scenario Outline: Validate Equipment Leads Section: Select Roles and add professional name and Navigation
    Then validate user click on "<sectionName>"
    When validate "<sectionName>" section is NOT completed, an empty circle next to the Section label will display in left panel
    When validate toggle is ON and the name field will enable
    When validate entering the assignee name, it will search for matching names and display NameJobFamilyOffice "<assigneeName>"
    Then Validate user click on the save button
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disable "<assigneeNameEdit>"
    When validate System will prompt user to save record if user is moving away from sectionscreen to "<otherSection>" without saving data
    When validate the section information has been saved and the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable
    #When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role "<assigneeName>","<addProfessional>"
    Then Validate user click on the save button
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then Validate user click on the Edit button
    When validate clicking on Define User Permissions displays a list of user permissions so that I can assign an individual in Discipline "<assigneeName>"
    Then validate hovering over i icon next to user permissions provides additional informationORdescription of permissions
    Then validate user can select Save to save the selections

    Examples: 
      | sectionName     | assigneeName                         | assigneeNameEdit                         | otherSection  |
      | Equipment Leads | Equipment Discipline / Lead / Kansas | Ramesh Rathod / Project Engineer / Wipro | Process Leads |

  Scenario Outline: Validate Management Team Section: Select Roles and add professional name and Navigation
    Then validate user click on "<sectionName>"
    When validate "<sectionName>" section is NOT completed, an empty circle next to the Section label will display in left panel
    When validate toggle is ON and the name field will enable
    When validate entering the assignee name, it will search for matching names and display NameJobFamilyOffice "<assigneeName>"
    Then Validate user click on the save button
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disable "<assigneeNameEdit>"
    When validate System will prompt user to save record if user is moving away from sectionscreen to "<otherSection>" without saving data
    When validate the section information has been saved and the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable
    #When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role "<assigneeName>","<addProfessional>"
    Then Validate user click on the save button
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button
    When validate Section is completed, a check next to the "<sectionName>" label will display in left panel
    Then Validate user click on the Edit button
    When validate clicking on Define User Permissions displays a list of user permissions so that I can assign an individual in Discipline "<assigneeName>"
    Then validate hovering over i icon next to user permissions provides additional informationORdescription of permissions
    Then validate user can select Save to save the selections

    Examples: 
      | sectionName     | assigneeName                             | assigneeNameEdit                   | otherSection    |
      | Management Team | Ramesh Rathod / Project Engineer / Wipro | Vepur S / Project Engineer / Wipro | Equipment Leads |
