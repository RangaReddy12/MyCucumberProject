Feature: Add User Module
Scenario Outline:
Validate Add user with multiple data
Given user navigates orangehrm url
When user logs in using Username as "Admin" and Password as "Qedge123!@#"
When user click login button
When user click Admin
When user click Add button
When user Enter employeename as "<Ename>" and Username as"<UserName>" and password as"<password>" and Confirm Password as "<cpassword>"
When user click save button
Then user validate url
Then user close browser
Examples:
|Ename|UserName|password|cpassword|
|Aaditya lname|Testing65|Testing@#$%^&123|Testing@#$%^&123|
|Anand kumbar|Testing65|Testing@#$%^&123|Testing@#$%^&123|
|Akhil gunji|Testing65|Testing@#$%^&123|Testing@#$%^&123|
|john player|Testing65|Testing@#$%^&123|Testing@#$%^&123|

