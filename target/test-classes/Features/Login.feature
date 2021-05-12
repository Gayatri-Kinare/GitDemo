Feature: Application Login





@MobileTest
Scenario: Home page deafult login
Given User is on NetBaking landing page
When User login into application with "jin" and password "4321"
Then Home page is populated
And cards displayed are "true"

@SmokeTest
Scenario: Home page deafult login
Given User is on NetBaking landing page
When User login into application with "john" and password "1234"
Then Home page is populated
And cards displayed are "false"

@MobileTest
Scenario: Home page deafult login
Given User is on NetBaking landing page
When User sign up with following details
| jenny | abcd | john@yopmail.com | Australia |235487 |
Then Home page is populated
And cards displayed are "false"

@SmokeTest
Scenario Outline: Home page deafult login
Given User is on NetBaking landing page
When User login in to application with <Username> and password <Password>
Then Home page is populated
And cards displayed are "false"


Examples:
|Username | Password |
|User1|Pass1|
|User2|Pass2|
|User3|Pass3|