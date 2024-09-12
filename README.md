# dropreach

Milestone Update: Just ran my first docker container and connected to it as a datasource.
For the life of me I couldn't figure out how to do it via a docker-compose file with a username and password, until I found this page: https://www.jetbrains.com/help/idea/running-a-dbms-image.html#connect_to_psql
These are the steps I followed:
- under Services/Docker/Images I pulled the latest postgres image
- then I created a new container under the postgres image, setting the env variable AUTH_METHOD to trust (i know i know not secure, but im still learning) and choosing to randomly expose ports
- then I configured a new datasource with username postgres, no password and database postgres

I'm gonna mess around for another few minutes to try to see if I can add a database name and password. I wonder why the docker-compose file wasn't working...

