#Author: rubuait@gmail.com
# Date: 02/03/2025
@login
Feature: Log In
  As a student
  I want to login with my valid credentials to Enthrall IT dashboard
  In order to get access of my dashboard

  Background: Student navigate to Application URL
    Given Student is on the Enthrall IT Homepage URL

  @regression
  Scenario: Login with valid credentials
    When Student click Login Button from the header
    Then Student will navigate to login page
    When Student enter Email in the Email field
    And Student enter Password in the Password field
    And Student finally click on Login Button
    Then Student will  be navigate to  the student dashboard

  @sanity
  Scenario: Login with fixed valid credentials
    When Student click Login Button from the header
    Then Student will navigate to login page
    When Student enter UserId as 'rubuait525@gmail.com'
    And Student enter Password as 'Password$1'
    And Student finally click on Login Button
    Then Student will  be navigate to  the student dashboard

  @smoke
  Scenario Outline: Login with sets of valid credentials
    When Student click Login Button from the header
    Then Student will navigate to login page
    When Student enter UserId as <Email>
    And Student enter Password as <Password>
    And Student finally click on Login Button
    Then Student will  be navigate to  the student dashboard

    Examples: 
      | Email                                            	|                Password          				|
      | 'mizimuktar0@gmail.com'           			|               'password$1'      				|
      | 'ayshasiddqua26@gmail.com'           	|        				'Faizan2026#'           	|
      | 'mariabegum2121'           								|				 				'saimun388556Bd@' 	|
      | 'rubuait525@gmail.com'     							|					 			'Password$1'      				|
