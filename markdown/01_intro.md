Hibernate
---------

* An ORM tool
* Used in data layer of application
* Implements JPA

Problem
-------

To map the object of class to row of the table in relational database
So, a class represent the table and its object represent the row in that table. 

| User Class    |
|---------------|
| Id            |
| Name          |
| Address       |
| Phone         |
| Date of Birth |
OBJECT

| Id | Name | Addr | Phone | DOB |
|----|------|------|-------|-----|
|    |      |      |       |     |
|    |      |      |       |     |
|    |      |      |       |     |
|    |      |      |       |     |
|    |      |      |       |     |
RELATIONAL

MAPPING!

Traditionally, to map the object to table a jdbc connection is made and value from the
object is pulled and insert query is generated. Similarly, to get the value from 
relational table to object a select query is to be constructed.

* Map member var to columns
* Map relationships
* Handling data type
* Managing changes to object state











