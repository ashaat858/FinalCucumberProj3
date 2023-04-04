@Feature 
Feature: Set color background

@BlueSenario1
  Scenario: Click on "Set SkyBlue Background" button
  As a user
  I want to set the background color to sky blue
  So that the page looks more appealing
    Given the Set SkyBlue Background button exists
    When I click on the blue button
    Then the background color will change to sky blue
 
@WhiteSenario2
  Scenario: Click on "Set White Background" button
   As a user
  I want to set the background color to sky white
  So that the page looks more appealing
    Given the Set White Background button exists
    When I click on the white button
    Then the background color will change to white