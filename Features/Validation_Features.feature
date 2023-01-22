Feature: Varify Orange Web Application

Background: 

Given browser is initiated  by the user
When Valied used Login ID and Password


Scenario Outline: Adding new employee details
When i click on "Add" buttom   
Then enter name as  "<username>"
And enter password as  "<password>"
And confirm the password  "<confirm password>"
Then Click "save"


Examples: 
|username|password |confirm password|
|ganesh  |Kites@7899|Kites@7899|





