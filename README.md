# Project Summary :
It is an project where we have automated Different scenarios using Selenium and TestNG. We have followed the Page Object Model (POM) for designing and developing the project.
Also done email reading using Rest Assured.
## Technology used:
- Language: Java
- Build System: Gradle
- Automation tool and framework: Selenium and TestNG, Rest Assured
- Data manipulation: Simple JSON and CSV Parser

## Peoject Description -

1. Visit the site https://dailyfinance.roadtocareer.net/. Register a new user . Assert the congratulations email is received.
2. Now click on the reset password link. Write 2 negative test case and assert. 
3. Now Input valid gmail account you have registered and and click on send reset link button
4. Now retrieve password reset mail from your gmail and set new password
5. Now login with the new password to ensure login successful
6. Add random 2 items and assert 2 items are showing on the item list
7. Now go to user profile and update user gmail with a new gmail
8. Now logout and login with the updated gmail account. Assert that using new email login is successful and using previous email login is failed.
9. Now logout again and login with the admin account. Admin credential must be sent from the terminal securely.
10. Search by the updated gmail and Assert that updated user email is showing on admin dashboard.

## How to run this project
- Clone the project
- Open the project from IntellIJ; File>Open>Select and expand folder>Open as project
- Hit this command: `gradle clean test -Pemail="admin@test.com" -Ppassword="admin123"` to run the  suite.
  
## Generate Allure report:

- ``` allure generate allure-results --clean -output ``` 
-   ``` allure serve allure-results ```



## Output -

![image](https://github.com/user-attachments/assets/dd06f94f-eb1d-44f7-9675-3f8f63698854)


![image](https://github.com/user-attachments/assets/138c5d0a-039c-4ceb-84d4-5ac74827a5ff)





  


### Output Video Link :
-  [Click Here To see the output video of Automation Script ](https://drive.google.com/file/d/1dOfKdEl4rfw0XU0sEVh-t1Jcg66sZnhC/view?usp=sharing)
    
