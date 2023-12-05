#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@firsttestcase
Feature: Navigate to Web Application which you want to Automate
Scenario: Navigate to Web Application
   Given Start Recording & Navigate to the URL
   And Explore the List
   And Search some product
   And Stop Recording
   #When product is avialable 
   #And Add to Cart
   #And Buy it 
   #Then Close the Browser
  
