# dropreach

### Update Oct.7 2024
Application now speaks to Postgres database!

Next steps:
 - Configure weight amd all the other classes so that the JPA entities match the Postgres database schema
 - Configure a login system with bCrypt password hashing

### Update Oct.7 2024
Designed and created postgres database. Tables are: Activity, ActivityLog, ActivitySchedule, CalorieSchedule, DailyLeft, Food, FoodLog, Goal, Meal, MotivationLog, User, WaterLog, WaterSchedule, Weight

I currently have a H2 database running that I can query to and preform CRUD operations via API, which is amazing. I have learned enough SpringBoot to create a web API.

Next steps:
 - Make the application speak to a postgres database
 - add bCrypt password hashing for security
 - create classes to represent the other entities

Overall goals:
 - user should be able to log in securely
 - user should see a homepage with their daily calorie limit and calories left, daily water limit and cups left, daily activity goal and minutes left, motivation bar and weight graph with trend line (calculated on backend)
 - user should be able to see what they've eaten today, yesterday, on any day
 - user should be able to add a meal (each food they add should have option to add to tracked foods)
 - user should be able to add a food and input calories per cup/x grams/ml etc (and backend should convert to grams)
 - user should be able to create a calorie, water, and activity schedule for the week and view it on a calendar
 - user should be able to create goals and log milestones towards those goals (have some predefined goals for weight, activity and water)
 - user should see updates when they reach milestones in their goals (1/3 of the way, streaks, etc)

Dev goals:
 - host on AWS
 - React frontend

-------
### Milestone Update 
Just ran my first docker container and connected to it as a datasource.
For the life of me I couldn't figure out how to do it via a docker-compose file with a username and password, until I found this page: https://www.jetbrains.com/help/idea/running-a-dbms-image.html#connect_to_psql
These are the steps I followed:
- under Services/Docker/Images I pulled the latest postgres image
- then I created a new container under the postgres image, setting the env variable AUTH_METHOD to trust (i know i know not secure, but im still learning) and choosing to randomly expose ports
- then I configured a new datasource with username postgres, no password and database postgres

I'm gonna mess around for another few minutes to try to see if I can add a database name and password. I wonder why the docker-compose file wasn't working...


