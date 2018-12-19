Feature: Login

Scenario: Show  for user see Tooltip message for invalid value provided from User
		Given I am staying at Login page222
		When I give the invalid username and blank value for password
		And I do login
		Then I should see the error tooltip "Hãy nhập E-mail ở định dạng: user@email.com" placed on UserName Field
		And "Mật khẩu chỉ nhận giá trị chữ và số" is placed on Password field 
		
