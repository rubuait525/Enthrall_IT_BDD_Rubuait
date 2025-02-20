#Author: rubuait.email@.com
#Date :02/08/2025
@dashboard
Feature: As a Student
  i want to enroll as a student to Enthrall IT
  in order to get access of the Application features

  Background: student navigates to Application URL
    Given Student is on the Enthrall IT Homepage URL

  Scenario: 
    When Student Click On login button Student puting value in each field Click Login Button to navigate to Dashboard page
    And Student Click on Automation to navigate to Automation page
    And Student Click Enroll Now to navigate to enroll home page
    And Student Puting value in each field to enrollment process
    And Student Double Click on Terms and Condition and select Accept
    Then Student Click Submit Button it will navigate to Successfull Page
