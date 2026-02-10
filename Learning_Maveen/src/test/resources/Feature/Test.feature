#Author: Latha
Feature:homepage_search
Scenario:validategoogle search is working


Given browser is open
And  user is on navigate to search results
When user enters a test in saerch box
Then user is in google search page
