#Author: RameshRathod
Feature: Validating View/Approve Project Plan Header as a Process role

  Scenario Outline: Validate login
    Given validate user login as a "<process>" role
    Then validate user select newly created project card
    Then validate "<viewApproveProjectPlan>" header is clicked

    Examples: 
      | process        | viewApproveProjectPlan    |
      | process@bv.com | View/Approve Project Plan |

  Scenario Outline: Validate View/Approve Project Plan Header
    Then verify the Day Scale in Preliminary Discipline Plan "<dayScaleValue>","<weekScaleValue>","<monthScaleValue>"
    Then verify user apply the filter by clicking on the filter icon "<equipment>"
    Then validate DPS user will select Project Activity gantt view full page form "<Project Activity>"
    Then verify the Project Activity details when clicking on ViewEdit Full Information Link
    Then validate DPS user will check editing permissions from the "<Project Activity>" gantt view full page form
    Then verify when projectUser clicks on Back
    Then validate DPS user will select FragnetStep gantt view full page form "<FragnetStep>"
    Then verify the Project Activity details when clicking on ViewEdit Full Information Link
    Then validate DPS user will check editing permissions from the "<FragnetStep>" gantt view full page form
    Then verify when projectUser clicks on Back
    Then validate DPS user will select Gig gantt view full page form "<Gig>"
    Then verify the Project Activity details when clicking on ViewEdit Full Information Link
    Then validate DPS user will check editing permissions from the "<Gig>" gantt view full page form
    Then verify when projectUser clicks on Back
    Then validate user click on complete button
    Then closing the browser

    Examples: 
      | dayScaleValue | weekScaleValue | monthScaleValue | Project Activity     | FragnetStep                           | Gig              |
      | Day           | Week           | Month           | Line Schedule-Common | Prepare & Issue Process Line Schedule | Engineer Prepare |
