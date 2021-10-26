Feature: Login into Application

  Scenario Outline: Positive test validation
    Given Initialize the browser with chrome
    And Navigate to "https://rahulshettyacademy.com/#/index"
    And Click on login link homepage to land on secure sign in page
    When User enters <username> and <password> and logs in
    Then Verify that user logs in successfully
    And close the window
    
    Examples:
                 |username									|password			|
                 |Prathapbarkur97@gmail.com	|Prastha@9995	|
                 |2n set										|2nd passwrd	|
                 |3rd set										|3 set				|
                 


#from framework project
#If we are performing parameterization ...instread of Scenario we have to give Scenario Outline
#Syntax is :-    Examples:
           #      |username									|password			|
           #      |Prathapbarkur97@gmail.com	|Prastha@9995	|
           #      |2n set										|2nd passwrd	|
           #      |3rd set										|3 set				|
                 
 #Makesure what are attribut name you gave u should pass the same name in feature file   like <username> and <password>
 # In above case our script will run two times
 #Without parameterization is in cucumber section
        