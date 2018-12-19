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
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat StepDefinitions.LoginSteps.is_placed_on_Password_field(LoginSteps.java:56)\r\n\tat ✽.\"Mật khẩu chỉ nhận giá trị chữ và số\" is placed on Password field(CucumberTest/Login.feature:9)\r\n",
  "status": "failed"
});
});