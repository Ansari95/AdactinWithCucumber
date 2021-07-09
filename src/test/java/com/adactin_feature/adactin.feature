Feature: Login functionality for adactin application


Scenario: user enter valid username and valid password
	Given user enter url of adactin application
	When user enter "ansari1234" as username
	And user enter "ansari@123" as password
	And user click the login button
	Then user validate login button
	
Scenario: user select the location
	When user select location of hotel
	And user select hotel name
	And user select room type
	And user select number of rooms
	And user enter check in date "27/05/2021"
	And user enter check out date "28/05/2021"
	And user select adult per room
	And user select child per room
	Then user click search button

Scenario: to select the hotel
	When user select the hotel
	Then click the continue button
	
Scenario: confirm hotel booking with proceed of payment
	When user enter "Ansari" as firstname
	And user enter "m" as lastname
	And user enter "absdfkj" as building address
	And enter "9876543212345678" as card number
	And user select card type
	And user select expiry date
	And user enter "321" as cvv number
	Then user click book now button
	
	
	


	
	