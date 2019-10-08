if we use hbm2ddl.auto = create or create-drop then hibernate will drop 
all the tables and recreate schema. This might be helpful if we want to
change add/remove many fields in our database.

But if you dont want to recreate schema just to update if our model changes then\
we have to set hbm2ddl.auto = update

We can specify the name of the table by passing name property in Entity annotation
We can specify the name of the column to be created by specifying @Column annotation on
fields name with name property

We can also put the annotations on getters.