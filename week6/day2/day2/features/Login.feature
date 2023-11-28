Feature: To test the login functionality

@login @functional @smoke
Scenario: To test the login functionality with positive credentials

Given Enter the username as democsr
And Enter the password
When Click on the Login button
Then Verify login is successfull