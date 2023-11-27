Feature: Leads Functionality

Scenario: Create Lead testcase with positive Credentials

Given Launch the browser
And Load the url
And Enter the username
And Enter the password
When Click on the Login button
Then Verify login is successfull
When Click on the crmsfa
And Click on the Leads tab
And Click on the Create Lead
Given Enter the company name
And Enter the first name
And Enter the last name
When Click on the submit button
Then Verify Create Lead is successfull
Given Get the lead id
When Close the browser