Remember we only have to create session factory once for the application.
However we can open session and close session as many times requires.

To get the object we have to write
session.get(arg1, arg2)

Here arg1 = EntityClassName.class (because we require SELECT * FROM TABLE_NAME)
So arg1 works as a TABLE_NAME

arg2 = primary key 