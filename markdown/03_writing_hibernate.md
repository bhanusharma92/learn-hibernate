Saving without hibernate
------------------------

* JDBC database configuration
* The model object eg. create User class
* Service method to create the model object
* Database design eg. create table in database
* DAO method to save object using SQL queries

The hibernate way
-----------------

* JDBC Database configuration - hibernate configuration
* The model object - Annotations
* Service method to create the model object - Use hibernate API (it actually does CRUD)
* Database design - Not Needed!
* DAO method to save object using SQL queries - Not Needed!


To do JDBC database configuration in hibernate we have to provide hibernate.cfg.xml 
file in src folder.

go get started search this hibernate.cfg.xml file in sample projects we have just 
downloaded.

In this hibernate.cfg.xml give the driver name, url and password