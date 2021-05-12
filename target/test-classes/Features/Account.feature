Feature: Application Login

Background:
Given validate browser
When Browser is triggered
Then check if browser is started

@SmokeTest
Scenario: Home page deafult login
Given User is on NetBaking landing page
When User login into application with "Acc" and password "4321"
Then Home page is populated
And cards displayed are "true"


