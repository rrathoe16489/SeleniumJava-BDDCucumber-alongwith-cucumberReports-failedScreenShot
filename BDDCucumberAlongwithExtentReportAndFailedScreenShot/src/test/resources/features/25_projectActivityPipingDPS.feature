#Author: RameshRathod
Feature: Validating Project Activity Header as a Piping Role

  Scenario Outline: Validate login
    Given validate user login as a "<piping>" role
    Then validate user select newly created project card
    Then validate "<projectActivity>" header is clicked

    Examples: 
      | piping        | projectActivity    |
      | piping@bv.com | Project Activities |

  Scenario Outline: Validate Define Activities
    #When Verify when user enters Define Activities screen
    #Then select piping from dropDown
    Then Verify when user clicks on Generate Project Activities
    Then After including required activities and DPS clicks on Save button
    Then validate DPS can Add a Project Activity to DOS Activity section by selecting a plus Add Row button at the bottom of the table and by saving the activity, New row should be added below all the Activities "<activityName>"
    Then Verify DPS is able to edit the Activity name in the Activities list "<editedActivityName>"
    Then Verify when DPS selects multiple values from dropdown in WBS related fields
    Then Verify DPS is able to delete an Activity from Activity list
    Then To verify Mark DOS activity complete
    Then validate edit Project Activity after DOS activity marked complete and again complete the DOS activity
    #Then validate user select another dropdownValue from define activity
    #Then Validate user click on the save button
    # Then To verify All DOS activities complete
    Then validate user click on complete button

    Examples: 
      | activityName | editedActivityName |
      | 6655-4433    | 3322edit           |

  Scenario Outline: Validate ManHour Budget
    When validate user clicks on ManHour Budgets section
    #Then validate field validation by passing the maxLength value into field compare to length "<maxValue>"
    Then validate field validation by passing the decimal value into field "<decimalValue>"
    Then validate user fill the equal data into each field of DOS Activity and then check the total of hours "<usEngHours>","<usDsgnHours>","<ousEngHours>","<ousDsgnHours>"
    Then Validate user click on the save button
    Then To verify Mark DOS activity complete
    # Then validate user select another dropdownValue from define activity
    #Then validate user fill the equal data into each field of DOS Activity and then check the total of hours "<usEngHours>","<usDsgnHours>","<ousEngHours>","<ousDsgnHours>"
    # Then Validate user click on the save button
    # Then To verify All DOS activities complete
    Then validate user click on complete button
    Then closing the browser

    Examples: 
      | usEngHours | usDsgnHours | ousEngHours | ousDsgnHours | usEngHours1 | usDsgnHours1 | ousEngHours1 | ousDsgnHours1 | usEngHours2 | usDsgnHours2 | ousEngHours2 | ousDsgnHours2 | maxValue | decimalValue |
      |         25 |             |             |              |             |              |              |               |             |              |              |               |          |         10.5 |
