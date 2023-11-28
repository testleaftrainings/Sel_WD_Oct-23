Feature: Leads Functionality

@createLead @functional @tc001
Scenario: Create Lead testcase with positive Credentials

Given Enter the username as democsr
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