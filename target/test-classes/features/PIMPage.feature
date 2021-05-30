@PIM
Feature: PIM

	@addEmployee 
	Scenario: add and complete data of employee 
		Given User 10 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password 
		When User 10 click PIM button & click add employee button 
		And User input "muhammadsyihabb" as firstName & input "ululululu" as middleName & input "hihihihih" as lastName & input "11112349" as id_Employee & click checkBox 
		And input "muhammadsyihabb" as unameEmploy & input "s3Kol4HQA!*" as passEmploy & input "s3Kol4HQA!*" as rePassEmploy & click save btn & click edit btn
		And input "988228225" as SIMNumb & click genderChckBox & select nationality & input "327222102130000" as otherID & input "2024-05-21" as SIMExpDate & select marital status & input "1999-05-21" as BirthDate & click save btn
		Then User succesfully add employee
		
	@searchEmployee
	Scenario: search employee 
		Given User 11 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password 
		When User 11 click PIM button
		And User input "tingky wingky" as fullName & click search btn 
		Then User get employee on the list
		
	
	

