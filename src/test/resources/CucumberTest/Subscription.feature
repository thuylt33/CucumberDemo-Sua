Feature: Subscription

@Sprint2
Scenario: Show message for existed account
	Given I stayed at testmaster homepage
	When I provide existed account "khanh.tx@live.com" and press Enter
Then I should see the error message "E-mail khanh.tx@live.com đã được sử dụng, bạn hãy chọn một E-mail khác"  trangnt46