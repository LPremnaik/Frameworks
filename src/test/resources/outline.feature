Feature: validation of facebook
Scenario Outline: validation of facbook with different username and password 
Given user must be able to lanch facebook url 
When locates the element and enters the "<username>" and "<password>"
And user click the login button 
Then user validate login page 


Examples:
|username|password|
|test@123|prem@123|
|test@345|prem@234| 
|test@123|prem@567| 
|test@132|prem@755|    