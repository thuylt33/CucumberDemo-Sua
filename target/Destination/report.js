$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CucumberTest/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Show Tooltip message for invalid value provided from User",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am staying at Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_staying_at_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I give the invalid username and blank value for password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_give_the_invalid_username_and_blank_value_for_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_do_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the error tooltip \"Hãy nhập E-mail ở định dạng: user@email.com\" placed on UserName Field",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_should_see_the_error_tooltip_placed_on_UserName_Field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Mật khẩu chỉ nhận giá trị chữ và số\" is placed on Password field",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.is_placed_on_Password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("CucumberTest/Subscription.feature");
formatter.feature({
  "name": "Subscription",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Show message for existed account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I stayed at testmaster homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "SubscriptionSteps.i_stayed_at_testmaster_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide existed account \"khanh.tx@live.com\" and press Enter",
  "keyword": "When "
});
formatter.match({
  "location": "SubscriptionSteps.i_provide_existed_account_and_press_Enter(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat StepDefinitions.SubscriptionSteps.i_provide_existed_account_and_press_Enter(SubscriptionSteps.java:28)\r\n\tat ✽.I provide existed account \"khanh.tx@live.com\" and press Enter(CucumberTest/Subscription.feature:6)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "I should see the error message \"E-mail khanh.tx@live.com đã được sử dụng, bạn hãy chọn một E-mail khác\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SubscriptionSteps.i_should_see_the_error_message(String)"
});
formatter.result({
  "status": "skipped"
});
});