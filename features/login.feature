Feature: login related scenario

  # background will always execute before every scenario
  # Scenario outline

   @postive-scenario @sanity
  Scenario: validate valid credentials
    When i enter "standard_user" in username field
    And i enter "secret_Sauce" in password field
    And i click in signin button
    Then i verify dashboard

  @negative-sceanrio @regression @negative
  Scenario Outline: validate negative testcase with <username> and <password>
    When i enter "<username>" in username field
    And i enter "<password>" in password field
    And i click in signin button
    Then i validate error message as "<error-msg>"

    Examples:
      | username        | password      | error-msg                                                                 |
      |                 |               | Epic sadface: Username is required                                        |
      |                 | secret_sauce  | Epic sadface: Username is required                                        |
      | standard_user   |               | Epic sadface: Password is required                                        |
#      | locked_out_user | secret_sauce  | Epic sadface: Sorry this user has been locked out.                        |
#      | standard_user   | wrong_pass    | Epic sadface: Username and password do not match any user in this service |
#      | wrong_user      | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
#      | admin           | admin         | Epic sadface: Username and password do not match any user in this service |
#      | test_user       | test123       | Epic sadface: Username and password do not match any user in this service |
#      | standard_user   | SECRET_SAUCE  | Epic sadface: Username and password do not match any user in this service |
#      | standard_user   | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |
#      | STANDARD_USER   | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
#      | standard_user   | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
#      | standard_user   | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
#      | standard_user   | secret sauce  | Epic sadface: Username and password do not match any user in this service |
#      | user@123        | pass@123      | Epic sadface: Username and password do not match any user in this service |
#      | 123456          | 123456        | Epic sadface: Username and password do not match any user in this service |
#      | !@#$%^          | &*()_+        | Epic sadface: Username and password do not match any user in this service |
#      | null            | null          | Epic sadface: Username and password do not match any user in this service |
#      | abcdefg         | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
#      | standard_user   | abcdefg       | Epic sadface: Username and password do not match any user in this service |

