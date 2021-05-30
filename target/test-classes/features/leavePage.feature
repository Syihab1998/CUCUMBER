@Leave
Feature: User can Assign & search Leave

	@assignLeave @negativeLeave
	Scenario: User  failed to assign leave
		Given User 6 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password 
		When User 6 click leave button & assign leave button 
		And User input "asal" as xEmployeeNameToLeave & select leave type & input "2021-05-28" as leaveFromDate & select partialDays & input "2021-05-28" as leaveToDate & input "mudik" as commentLeave & click assign button
		Then User cant assign leave and get error Message bellow employee name 
	
	@assignLeave @positiveLeave
	Scenario: User successfully assign leave 
		Given User 7 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password 
		When User 7 click leave button & assign leave button 
		And User input "troy broe alssstor" as employeeNameToLeave & select leave type & input "2021-05-12" as leaveFromDate & input "2021-05-12" as leaveToDate & select partial days 
		And User User select duration days & select time from & select time to & input "bosen" as commentLeave & click assign button 
		Then User successfully assign leave 
		
	@searchLeave
	Scenario: User search leave on the list 
		Given User 8 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password 
		When User 8 click leave button  
		And User click check all status leave & input "ting wing dip" as fullNameLeave & click search button 
		Then User get the result on leave list 