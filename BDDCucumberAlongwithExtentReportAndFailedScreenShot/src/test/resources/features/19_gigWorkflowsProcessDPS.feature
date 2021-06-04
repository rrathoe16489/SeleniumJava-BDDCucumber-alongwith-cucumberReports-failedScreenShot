Feature: Gig Workflows as a Process role

  @TestCase44745
  Scenario Outline: Completed all the the five steps on Gig Worflow for Process discipline
    Given validate user login as a "<process>" role
    Then validate user select newly created project card
    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information
      | Activity             |
      | Activity Information |
    And user click edit button to edit existing details.
    And user fill activity information form
    And user select Customize Fragnet
      | Activity          |
      | Customize Fragnet |
    And user click edit button and change fileds on customize fragnet page
    And user click save continue button
    And user select FragnetStepInformation tab
      | Activity                |
      | FragnetStep Information |
    And user click edit button and change fileds on FragnetStepInformation
    And user click save continue button
    And User selects Stepfour Customize Gignet
    And user click edit button for edit
    And user remove all selected customie gignet
      | Prepare & Issue Process Line Schedule |
    And user fill values and completed stepfour Customize Gignet and save continue allprocess
      | Prepare & Issue Process Line Schedule |
    And user select StepFive Gig Information
      | Activity Gignet Giginfo |
    And user click edit button for edit
    And user remove all selected Giginformation
      | Prepare & Issue Process Line Schedule |
    And user selects Selected values in Stepfive and complete slide menu on Gig information
      | Prepare & Issue Process Line Schedule | Engineer Prepare,Engineer Review,Engineer Update And Sign,Engineer Review And Sign,Lead Engineer Review Fragnet For Completion And Sign |

    Examples: 
      | process        | gigworkflow   |
      | process@bv.com | Line Schedule |
