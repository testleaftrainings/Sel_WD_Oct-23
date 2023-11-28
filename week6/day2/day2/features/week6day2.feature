Feature: Leaftaps Leads module

@mergelead @functional
Scenario: merge lead with positive credentials

Given Enter the username as demosalesmanager
And Enter the password
When Click on the Login button
Then Verify login is successfull
When Click on the crmsfa
And Click on the Leads tab
And Click on the merge leads
And Click on the from lead
Given Enter the firstName as babu
When Click on the find leads button
And Click on the first resulting lead id
And Click on the to lead
Given Enter the firstName as hari
When Click on the find leads button
And Click on the first resulting lead id
And Click on merge button