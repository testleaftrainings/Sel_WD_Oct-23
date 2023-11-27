Feature: To test the login functionality

Scenario: To test the login functionality with positive credentials

# precondition
Given Launch the browser
And Load the url
And Enter the username
And Enter the password
When Click on the Login button
Then Verify login is successfull