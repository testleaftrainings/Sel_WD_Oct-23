Feature: Leads Functionality
#Background:
#Given Launch the browser
#And Load the url
#When Close the browser

@createLead @regression
Scenario: Create Lead testcase with positive Credentials

#Given Launch the browser
#And Load the url
And Enter the username as demosalesmanager
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
#When Close the browser

@login @smoke
Scenario: Login with negative credentials
Gicven Enter the username as demomanager
And Enter the password
When Click on the Login button
But Verify login is successfull
#When Close the browser

@login @smoke
Scenario: Login with Positive credentials
Given Enter the username as demosalesmanager
And Enter the password
When Click on the Login button
Then Verify login is successfull