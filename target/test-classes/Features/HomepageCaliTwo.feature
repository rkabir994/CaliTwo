Feature: Multiple browser open and check accessability  


@CaliTwoAm
Scenario: Successfully open Amazon and search for specific nike shoes  
Given launch chrome browser "<URL>"
Then navigate to Amazon home page
Then search for "Nike mens shoes"
Then search for specific nike shoes
Then verify specific nike shoes title "Men's Flex Control TR3 Sneaker" 




@CaliTwoAm
Scenario: After Amazon Navigate to FaceBook and login successfully 
Then open FaceBook home page
Then enter username and password and click login button
Then Verify User on his own page
Then close FaceBook and quit