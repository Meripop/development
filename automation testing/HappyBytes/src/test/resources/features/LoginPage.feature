Feature: Login to OrangeHRM in different ways

  Scenario: Login with valid username and valid password, Test Case Keys: HBYTES-T12, HBYTES-T13
    Given Webpage has been loaded "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When The user enters the username as "Admin" and password as "admin123" and click to Login button
    Then User logged in Login was successfully

  Scenario: Login page click Forgot your password? Test Case Key:
    Given Webpage has been loaded "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When click to Forgot your password? text
    Then Go to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode" page

  Scenario Outline: Login with empty or valid username or password, Test Case Keys: HBYTES-T7, HBYTES-T8, HBYTES-T9
    Given Webpage has been loaded "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When The user enters the username as "<username>" and password as "<password>" and click to Login button
    Then the user can not able to login and "<errorMessage>" message is visible.
    Examples:
      | username | password | errorMessage |
      |          | admin123 | Required     |
      | Admin    |          | Required     |
      |          |          | Required     |

  Scenario Outline: Login with invalid or valid username or password, Test Case Keys: HBYTES-T10, HBYTES-T11
    Given Webpage has been loaded "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When The user enters the username as "<username2>" and password as "<password2>" and click to Login button
    Then the user can not able to login and "<errorMessage2>" message is visible after page reloaded.
    Examples:
      | username2 | password2 | errorMessage2       |
      | Admin     | admin     | Invalid credentials |
      | adm       | admin123  | Invalid credentials |

