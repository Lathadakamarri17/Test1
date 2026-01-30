Feature:Test login functionality
Scenario Outline:check
Given browser is open
And  user is on navigate to  google search 
When user enters <username>and<password>
Then user is navigate to homepage


Examples:
|username||password|
|Lalli||9966976|
|pilli||733110|
|standar


