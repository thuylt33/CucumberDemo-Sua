Feature: Login

Scenario: Show Tooltip message for invalid value provided from User
		Given I am staying at Login page
		When I give the invalid username and blank value for password
		And I do login
		Then I should see the error tooltip "Hãy nhập E-mail ở định dạng: user@email.com" placed on UserName Field
		And "Mật khẩu chỉ nhận giá trị chữ và số" is placed on Password field 
		
Scenario: Show error message for wrong password value provided from user
		Given I am staying at Login page
		When I give the valid username and wrong password value
		And I do login
		Then I should see the notification message "Tên đăng nhập hoặc Mật khẩu không đúng."
		
		
Scenario: Show error message for wrong password value provided from user
		Given I am staying at Login page
		When I give the valid username and wrong password value
		And I do login
		Then I should see the notification message "Tên đăng nhập hoặc Mật khẩu không đúng."