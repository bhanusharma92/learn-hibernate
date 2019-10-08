Another way to name the table is by using Table annotation. So the difference between
naming table vs naming entity is when we use HQL. If we want to name Entity just 
UserDetails but name table as USER_DETAILS then we use table annotation.


Now i have added few more fields in UserDetails class.  
private Date joinedDate;  
private String address;  
private String description;  

Another annotation is @Basic which tells to make this field persis in db(it is happening by default 
without basic)

If the field is marked as static or transient then is not get persisted to Database

Another way to ignore the field is to mark the field with @Transient annotation.

To save only date without hour min sec and milli seconds. We can use Temporal 
annotation, it takes argument like TemporalType.DATE, TemporalType.TIME and TemporalType.TIMESTAMP

Another annotation is Lob to specify large object if it is on String
the database consider it as character lob (CLOB) otherwise byte stream lob(BLOB)

In our case it is applied over description field.