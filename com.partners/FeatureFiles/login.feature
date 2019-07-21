Feature: login homepage functionality 

Scenario Outline: webpage will be open successfully and all the features will be appeared 

Given User will be on the homepage
When  User click on signin button
And User will put "<UserId>"  
And User will input "<Password>" 
And User will hit on signin button 
Then User will see the "<Error>" message

Examples:
      |UserId               |Password|
      |robi.razaaa@yahoo.com|14257845|