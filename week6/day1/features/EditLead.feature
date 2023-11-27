Feature: Leads Functionality

Scenario: Edit Lead testcase with positive Credentials

Given Launch the browser
And Load the url
And Enter the username
And Enter the password
When Click on the Login button
Then Verify login is successfull
When Click on the crmsfa
And Click on the Leads tab
And Click on the find leads
Given Enter the firstName
When Click on the find leads button
And Click on the first resulting lead id
And Click on the edit button
Given update the cname
When click on the update button
When Close the browser