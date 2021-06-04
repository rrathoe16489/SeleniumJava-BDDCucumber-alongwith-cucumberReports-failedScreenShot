Feature: Gig Workflows as a Piping role

  @TestCase44745
  Scenario Outline: Completed all the the five steps on Gig Worflow for  Piping discipline
    Given validate user login as a "<piping>" role
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
      | Update Piping Tie-In List / Prepare Location Drawings & Details                                        |
      | IHR Piping Tie-In List, Location Dwgs & Details                                                        |
      | Incorp IHR Comments And Issue Piping Tie-In List, Location Drawings, & Details For Client Review       |
      | Client Review Piping Tie-In List, Location Drawings & Details                                          |
      | Incorp Client Comments And Issue Piping Tie-In List, Location Drawings, & Details For 3rd Party Review |
    And user fill values and completed stepfour Customize Gignet and save continue allprocess
      | Update Piping Tie-In List / Prepare Location Drawings & Details                                        |
      | IHR Piping Tie-In List, Location Dwgs & Details                                                        |
      | Incorp IHR Comments And Issue Piping Tie-In List, Location Drawings, & Details For Client Review       |
      | Client Review Piping Tie-In List, Location Drawings & Details                                          |
      | Incorp Client Comments And Issue Piping Tie-In List, Location Drawings, & Details For 3rd Party Review |
    And user select StepFive Gig Information
      | Activity Gignet Giginfo |
    And user click edit button for edit
    And user remove all selected Giginformation
      | Update Piping Tie-In List / Prepare Location Drawings & Details                                        |
      | IHR Piping Tie-In List, Location Dwgs & Details                                                        |
      | Incorp IHR Comments And Issue Piping Tie-In List, Location Drawings, & Details For Client Review       |
      | Client Review Piping Tie-In List, Location Drawings & Details                                          |
      | Incorp Client Comments And Issue Piping Tie-In List, Location Drawings, & Details For 3rd Party Review |
    And user selects Selected values in Stepfive and complete slide menu on Gig information
      | Update Piping Tie-In List / Prepare Location Drawings & Details                                        | Review Tie-Ins On P&IDs,Gather Info On Physical Tie-In Locations,Locate Tie-Ins In Model,Create Tie-In Spreadsheet,Create Tie-In Package,Create Tie-In Location Drawing,Issue Drawing For IHR |
      | IHR Piping Tie-In List, Location Dwgs & Details                                                        | IHR Facilitator Compiles IHR Comments                                                                                                                                                         |
      | Incorp IHR Comments And Issue Piping Tie-In List, Location Drawings, & Details For Client Review       | Address IHR Comments,Issue For Client Review                                                                                                                                                  |
      | Client Review Piping Tie-In List, Location Drawings & Details                                          | Client Review Facilitator Compiles Comments                                                                                                                                                   |
      | Incorp Client Comments And Issue Piping Tie-In List, Location Drawings, & Details For 3rd Party Review | Address Client Review Comments,Extract Info From Model / Clean Up And Annotate,Issue For 3rd Party Review                                                                                     |
      | 3rd Party Review Piping Tie-In List, Location Drawings, & Details                                      | 3rd Party Review Facilitator Compiles Comments                                                                                                                                                |
      | Incorp 3rd Party Comments And IFC Piping Tie-In List, Location Drawings, & Details                     | Address 3rd Party Review Comments,Extract Info From Model / Clean Up And Annotate,PDE Review Approve And Stamp,PLD Review And Issue                                                           |

    Examples: 
      | piping        | gigworkflow             |
      | piping@bv.com | Tie-In List And Details |
