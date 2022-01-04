Feature: Login Functionality

#Scenario: Verify the Login Functionality by Valid Credentials
#Given User is on the Login page
#Then User enters the "Admin" in username textfield
#Then User enters the "admin123" in password textfield
#Then User clicks in the Login button
#And User is on the Home page

Scenario Outline: Check the Login Functionality with all sets of data
Given launch login page
Then enters the "<username>" and enters "<password>"
Then click on the login button

Examples:
					|username|password|
					|adaewdw|ygds|
					|bxzhb|abnjnxj|
					|shhgsa|snxknk|
					|Admin|admin123| 
