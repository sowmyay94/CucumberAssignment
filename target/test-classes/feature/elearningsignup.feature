Feature: elearningm1 signup functionality

  Scenario Outline: Register for elearningm1 upskill
    Given Open the elearningm1 site
    And Click on Signup
    When I provide required fields "<First Name>", "<Last Name>", "<email>", "<Username>", "<Pass>", "<Confirm Password>" in step
    Then Click on Register
    And Confirmation message comes
    When select user dropdown in right side of the screen
    Then Clik on Homepage
    Then Click on Profile
    When send a message on click of compose
    When provide required fields "<Send to>", "<Subject>", "<Message>" in step
    Then click on Send message
    When sent message should show

    Examples: 
      | url                            | First Name | Last Name | email         | Username | Pass | Confirm Password | Send to | Subject       | Message                                           |
      | http://elearningm1.upskills.in | Sas        | S         | sas@gmail.com | Sas      | 1234 |             1234 | Sasira  | Cucumber Test | Hi Sasira,\n Cucumber Assignment.\n From\n Sowmya |
