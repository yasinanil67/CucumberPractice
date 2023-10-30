@US002 @Registration
Feature:  US002: Registration should be successful using email and username

  Scenario: US002AC01: Choose a username that can contain any chars, but it cannot be blank
    Given US002AC01TC01: User leaves the username blank, there should be Your username is required. error message
    When US002AC01TC02: User enters username special chars £#$€, there should be Your username is invalid. error message
    And US002AC01TC03: User enters username  that can contain any chars, there should not be any error message


# REST IS HOMEWORK !!!