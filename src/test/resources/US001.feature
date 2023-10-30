@US001 @Registration
Feature:  US001: Registration should be available using SSN, Firstname and Lastname

  Scenario: AC001: There should be a valid SSN respecting the "-" after 3rd and 5th digits, it should be 9 digits long
    Given User goes to homepage
    When user clicks user icon
    And user clicks register link
    Given AC001TC01: User enters the ssn first dash missing, there should be Your SSN is invalid message
    When AC001TC02: User enters the ssn second dash missing, there should be Your SSN is invalid message
    And AC001TC03: User enters the ssn one digit missing, there should be Your SSN is invalid message
    And AC001TC04: User enters the ssn with a non numeric character, there should be Your SSN is invalid message
    And AC001TC05: User enters a valid ssn, there should not be any error message

  Scenario: AC002: SSN cannot be left blank
    Given AC002TC01: User leaves the ssn blank, there should be Your SSN is required message
    When AC002TC02: User enters the ssn only space, there should be Your SSN is required. message
    And AC001TC05: User enters a valid ssn, there should not be any error message

  Scenario: AC003: There should be a valid name that contains any chars and cannot be blank
    Given AC003TC01: User leaves the FirstName blank, there should be Your FirstName is required message
    When AC003TC02: User enters the FirstName only space, there should be Your FirstName is required message
    And AC003TC03: User enters the name that contains any chars, there should not be any error message

    Scenario: AC004: There should be a valid lastname that contains any chars and it is a required field
    Given AC004TC01: User leaves the lastname blank, there should be Your LastName is required message
    When AC004TC02: User enters the lastname only space, there should be Your LastName is required message
    And AC004TC03: User enters the lastname that contains any chars, there should not be any error message


