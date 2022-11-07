



@naukri.com
Feature:  validating naukri.com features
  I want to validate naukri.com features
  
  
  Background: 
   Given open up the chromebrowser
   And enter the url in address bar


  @JobSearch
  Scenario: Testing Job Search Functionality
   
    When click on enter skills field and type the skills 
    And click on enter location  and type location
    And select experience from dropdown
    Then click on search button
    
    @login
    Scenario Outline: Testing Login Functionality
    Given click on login link
    And enter username and password <username> <password>
    When click on login button
    
    Examples:
    |username    | password   |
    |kawal       |kawal123   |
    |shivam      |shivam123  |
    
    @Register
    Scenario: Testing Register Functionality
     And click on register link
    And fill up the details
    Then click on register button
    
    


