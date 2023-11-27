Feature: Login functionality

Scenario: Positive scenario for Login

Given Launch browser
Given load url
Given enter username
Given enter password
When click login
Then verify login